#!/bin/bash
# This file is meant to be included by the parent cppbuild.sh script
if [[ -z "$PLATFORM" ]]; then
    pushd ..
    bash cppbuild.sh "$@" shaka-packager
    popd
    exit
fi

# Planned to support windows asap
if [[ $PLATFORM == windows* ]]; then
    #No Windows support yet
    echo "Error: Platform \"$PLATFORM\" is not supported"
    exit 1
fi

# Compilation instructions at https://github.com/shaka-project/shaka-packager/blob/main/docs/source/build_instructions.md


mkdir -p $PLATFORM
cd $PLATFORM

CURRENT_PLATFORM_PATH=$(pwd)


echo "Cloning shaka-packager reposository..."

# Master branch shaka-packager v3.2.0
if [[ ! -d shaka-packager ]]; then
    git clone --recurse-submodules https://github.com/shaka-project/shaka-packager.git

fi
cd shaka-packager
git submodule update --init --recursive
INSTALL_PATH=$(pwd)




case $PLATFORM in
    linux-x86_64)
        cmake -S . -B build -DBUILD_SHARED_LIBS="ON"  -DCMAKE_BUILD_TYPE=Release -G Ninja  -DCMAKE_INSTALL_PREFIX=$CURRENT_PLATFORM_PATH
        cmake --build build/ --config Release --parallel 
        cmake --install build/ --strip --config Release --prefix=$CURRENT_PLATFORM_PATH 
        ;;
    linux-arm64)
        MUSL_ARCH="aarch64"
        curl -LO https://musl.cc/"$MUSL_ARCH"-linux-musl-native.tgz
        tar xf "$MUSL_ARCH"-linux-musl-native.tgz
        export CC="$MUSL_ARCH"-linux-musl-native/bin/"$MUSL_ARCH"-linux-musl-gcc
        export CXX="$MUSL_ARCH"-linux-musl-native/bin/"$MUSL_ARCH"-linux-musl-g++
        cmake -S . -B build -DBUILD_SHARED_LIBS=ON -DFULLY_STATIC=OFF -DCMAKE_BUILD_TYPE=Release  -DCMAKE_INSTALL_PREFIX=$CURRENT_PLATFORM_PATH
        cmake --build build/ --config Release --parallel 
        cmake --install build/ --strip --config Release --prefix=$CURRENT_PLATFORM_PATH
        ;;
    macosx-arm64)
        cmake -S . -B build -DBUILD_SHARED_LIBS="ON"  -DCMAKE_BUILD_TYPE=Release -G Ninja  -DCMAKE_INSTALL_PREFIX=$CURRENT_PLATFORM_PATH
        cmake --build build/ --config Release --parallel 
        cmake --install build/ --strip --config Release --prefix=$CURRENT_PLATFORM_PATH
        ;;
    macosx-x86_64)
        cmake -S . -B build -DBUILD_SHARED_LIBS="ON"  -DCMAKE_BUILD_TYPE=Release -G Ninja  -DCMAKE_INSTALL_PREFIX=$CURRENT_PLATFORM_PATH
        cmake --build build/ --config Release --parallel 
        cmake --install build/ --strip --config Release --prefix=$CURRENT_PLATFORM_PATH
        ;;
    *)
        echo "Error: Platform \"$PLATFORM\" is not supported"
        ;;
esac

cd ../..

