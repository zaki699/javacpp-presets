/*
 * Copyright (C) 2020-2021 Samuel Audet, Eduardo Gonzalez
 *
 * Licensed either under the Apache License, Version 2.0, or (at your option)
 * under the terms of the GNU General Public License as published by
 * the Free Software Foundation (subject to the "Classpath" exception),
 * either version 2, or any later version (collectively, the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *     http://www.gnu.org/licenses/
 *     http://www.gnu.org/software/classpath/license.html
 *
 * or as provided in the LICENSE.txt file that accompanied this code.
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.bytedeco.pytorch.presets;

import java.util.List;
import org.bytedeco.javacpp.ClassProperties;
import org.bytedeco.javacpp.LoadEnabled;
import org.bytedeco.javacpp.Loader;
import org.bytedeco.javacpp.Pointer;
import org.bytedeco.javacpp.FunctionPointer;
import org.bytedeco.javacpp.annotation.ByRef;
import org.bytedeco.javacpp.annotation.ByVal;
import org.bytedeco.javacpp.annotation.Cast;
import org.bytedeco.javacpp.annotation.Const;
import org.bytedeco.javacpp.annotation.MemberGetter;
import org.bytedeco.javacpp.annotation.Namespace;
import org.bytedeco.javacpp.annotation.Platform;
import org.bytedeco.javacpp.annotation.Properties;
import org.bytedeco.javacpp.annotation.StdString;
import org.bytedeco.javacpp.tools.Info;
import org.bytedeco.javacpp.tools.InfoMap;
import org.bytedeco.javacpp.tools.InfoMapper;

import org.bytedeco.openblas.presets.openblas;

/**
 *
 * @author Samuel Audet
 */
@Properties(
    inherit = openblas.class,
    value = {
        @Platform(
            value = {"linux", "macosx", "windows"},
            compiler = "cpp14",
            define = {"SHARED_PTR_NAMESPACE std", "UNIQUE_PTR_NAMESPACE std" },
            include = {
                "c10/macros/cmake_macros.h",
                "c10/macros/Export.h",
                "c10/macros/Macros.h",
//                "c10/util/C++17.h",
//                "c10/util/Array.h",
//                "c10/util/ConstexprCrc.h",
//                "c10/util/IdWrapper.h",
//                "c10/util/TypeIndex.h",
//                "c10/util/TypeTraits.h",
//                "c10/util/TypeList.h",
//                "c10/util/Metaprogramming.h",
//                "c10/util/Optional.h",
//                "c10/util/UniqueVoidPtr.h",
//                "c10/util/flat_hash_map.h",
//                "c10/util/intrusive_ptr.h",
//                "c10/util/python_stub.h",
//                "c10/util/reverse_iterator.h",
//                "c10/util/string_view.h",
//                "c10/util/typeid.h",
                "c10/util/AlignOf.h",
                "c10/util/Deprecated.h",
                "c10/util/StringUtil.h",
                "c10/util/SmallVector.h",
                "c10/util/Exception.h",
                "c10/util/ArrayRef.h",
                "c10/util/complex.h",
                "c10/util/Half.h",
                "c10/util/qint32.h",
                "c10/util/qint8.h",
                "c10/util/quint8.h",
                "c10/util/BFloat16.h",
                "c10/util/quint4x2.h",
                "c10/util/ThreadLocalDebugInfo.h",
                "c10/util/Type.h",
                "c10/util/TypeCast.h",
                "c10/util/Registry.h",
                "c10/util/Flags.h",
                "c10/util/Logging.h",
                "c10/core/DeviceType.h",
                "c10/core/Device.h",
                "c10/core/DeviceGuard.h",
                "c10/core/DispatchKey.h",
                "c10/core/DispatchKeySet.h",
                "c10/core/Backend.h",
                "c10/core/CopyBytes.h",
                "c10/core/Layout.h",
                "c10/core/MemoryFormat.h",
                "c10/core/QEngine.h",
                "c10/core/QScheme.h",
                "c10/core/Stream.h",
                "c10/core/ScalarType.h",
                "c10/core/ScalarTypeToTypeMeta.h",
                "c10/core/Scalar.h",
                "c10/core/Allocator.h",
                "c10/core/DefaultDtype.h",
                "c10/core/StorageImpl.h",
                "c10/core/Storage.h",
                "c10/core/TensorOptions.h",
                "c10/core/TensorImpl.h",
                "c10/core/UndefinedTensorImpl.h",
                "c10/core/WrapDimMinimal.h",
//                "c10/core/GeneratorImpl.h",
//                "c10/core/impl/LocalDispatchKeySet.h",
//                "c10/core/impl/DeviceGuardImplInterface.h",
//                "ATen/core/op_registration/hacky_wrapper_for_legacy_signatures.h"
                "ATen/core/aten_interned_strings.h",
                "ATen/core/interned_strings.h",
                "ATen/core/grad_mode.h",
                "ATen/core/ATenGeneral.h",
                "ATen/core/Dimname.h",
                "ATen/core/DimVector.h",
                "ATen/core/Generator.h",
//                "ATen/core/DeprecatedTypeProperties.h",
//                "ATen/core/DeprecatedTypePropertiesRegistry.h",
//                "ATen/core/LegacyTypeDispatch.h",
//                "ATen/core/QuantizerBase.h",
                "ATen/core/List.h",
                "ATen/core/NamedTensor.h",
                "ATen/core/Reduction.h",
                "ATen/core/Scalar.h",
                "ATen/core/TensorAccessor.h",
                "ATen/core/TensorBody.h",
                "ATen/core/Tensor.h",
                "ATen/core/Formatting.h",
                "ATen/core/UnsafeFromTH.h",
                "ATen/core/blob.h",
                "ATen/core/functional.h",
                "ATen/core/ivalue.h",
                "ATen/core/operator_name.h",
                "ATen/core/qualified_name.h",
//                "ATen/core/jit_type_base.h",
//                "ATen/core/jit_type.h",
//                "ATen/detail/CUDAHooksInterface.h",
//                "ATen/detail/HIPHooksInterface.h",
//                "ATen/CPUGeneratorImpl.h",
//                "ATen/record_function.h",
                "ATen/Config.h",
                "ATen/Device.h",
                "ATen/DeviceGuard.h",
                "ATen/DimVector.h",
                "ATen/Dispatch.h",
                "ATen/Formatting.h",
                "ATen/Generator.h",
                "ATen/Parallel.h",
                "ATen/Utils.h",
                "ATen/TracerMode.h",
                "ATen/WrapDimUtils.h",
                "ATen/Tensor.h",
                "ATen/TensorGeometry.h",
                "ATen/TensorNames.h",
                "ATen/TensorUtils.h",
                "ATen/Context.h",
                "ATen/ExpandUtils.h",
                "ATen/Functions.h",
                "ATen/NamedTensor.h",
                "ATen/NamedTensorUtils.h",
                "ATen/ScalarOps.h",
                "ATen/TensorIndexing.h",
                "ATen/TensorOperators.h",
                "ATen/Version.h",

                "torch/autograd.h",
                "torch/csrc/WindowsTorchApiMacro.h",
                "torch/csrc/autograd/edge.h",
                "torch/csrc/autograd/function_hook.h",
                "torch/csrc/autograd/cpp_hook.h",
                "torch/csrc/autograd/forward_grad.h",
                "torch/csrc/autograd/variable.h",
                "torch/csrc/autograd/autograd.h",
//                "torch/csrc/autograd/grad_mode.h",
//                "torch/csrc/autograd/function.h",
//                "torch/csrc/autograd/input_metadata.h",
//                "torch/csrc/autograd/anomaly_mode.h"
//                "torch/csrc/autograd/custom_function.h"
//                "torch/csrc/autograd/generated/Functions.h",
//                "torch/csrc/autograd/generated/VariableType.h",
//                "torch/csrc/autograd/generated/variable_factories.h",
//                "torch/csrc/jit/frontend/tracer.h",
//                "torch/csrc/jit/ir/ir.h",
//                "torch/detail/TensorDataContainer.h",

                "torch/arg.h",
                "torch/enum.h",
                "torch/types.h",
                "torch/utils.h",

                "torch/data.h",
                "torch/data/example.h",
                "torch/data/iterator.h",
                "torch/data/worker_exception.h",
                "torch/data/dataloader.h",
                "torch/data/dataloader/base.h",
                "torch/data/dataloader_options.h",
                "torch/data/dataloader/stateful.h",
                "torch/data/dataloader/stateless.h",
                "torch/data/datasets.h",
                "torch/data/datasets/base.h",
//                "torch/data/datasets/chunk.h",
                "torch/data/datasets/map.h",
                "torch/data/datasets/mnist.h",
//                "torch/data/datasets/shared.h",
//                "torch/data/datasets/stateful.h",
//                "torch/data/datasets/tensor.h",
                "torch/data/samplers.h",
                "torch/data/samplers/base.h",
//                "torch/data/samplers/custom_batch_request.h",
//                "torch/data/samplers/distributed.h",
                "torch/data/samplers/random.h",
//                "torch/data/samplers/sequential.h",
//                "torch/data/samplers/serialize.h",
//                "torch/data/samplers/stream.h",
                "torch/data/transforms.h",
                "torch/data/transforms/base.h",
                "torch/data/transforms/collate.h",
                "torch/data/transforms/lambda.h",
                "torch/data/transforms/stack.h",
                "torch/data/transforms/tensor.h",

                "torch/serialize.h",
                "torch/serialize/archive.h",
                "torch/serialize/input-archive.h",
                "torch/serialize/output-archive.h",
                "torch/serialize/tensor.h",

                "torch/nn.h",
                "torch/nn/cloneable.h",
                "torch/nn/init.h",
                "torch/nn/pimpl.h",
                "torch/nn/utils.h",
                "torch/nn/utils/clip_grad.h",
                "torch/nn/utils/convert_parameters.h",
                "torch/nn/utils/rnn.h",

                "torch/nn/options.h",
                "torch/nn/options/activation.h",
                "torch/nn/options/adaptive.h",
                "torch/nn/options/batchnorm.h",
                "torch/nn/options/conv.h",
                "torch/nn/options/distance.h",
                "torch/nn/options/dropout.h",
                "torch/nn/options/embedding.h",
                "torch/nn/options/fold.h",
                "torch/nn/options/linear.h",
                "torch/nn/options/loss.h",
                "torch/nn/options/normalization.h",
                "torch/nn/options/padding.h",
                "torch/nn/options/pixelshuffle.h",
                "torch/nn/options/pooling.h",
                "torch/nn/options/rnn.h",
                "torch/nn/options/upsampling.h",
                "torch/nn/options/vision.h",
                "torch/nn/options/instancenorm.h",
                "torch/nn/options/transformerlayer.h",
                "torch/nn/options/transformercoder.h",
                "torch/nn/options/transformer.h",

                "torch/nn/functional.h",
                "torch/nn/functional/activation.h",
                "torch/nn/functional/batchnorm.h",
                "torch/nn/functional/conv.h",
                "torch/nn/functional/distance.h",
                "torch/nn/functional/dropout.h",
                "torch/nn/functional/embedding.h",
                "torch/nn/functional/fold.h",
                "torch/nn/functional/linear.h",
                "torch/nn/functional/loss.h",
                "torch/nn/functional/normalization.h",
                "torch/nn/functional/padding.h",
                "torch/nn/functional/pixelshuffle.h",
                "torch/nn/functional/pooling.h",
                "torch/nn/functional/upsampling.h",
                "torch/nn/functional/vision.h",
                "torch/nn/functional/instancenorm.h",

                "torch/nn/module.h",
                "torch/nn/modules.h",
                "torch/nn/modules/common.h",

                "torch/nn/modules/container/any.h",
//                "torch/nn/modules/container/functional.h",
                "torch/nn/modules/container/moduledict.h",
                "torch/nn/modules/container/modulelist.h",
                "torch/nn/modules/container/named_any.h",
                "torch/nn/modules/container/sequential.h",
                "torch/nn/modules/container/parameterdict.h",
                "torch/nn/modules/container/parameterlist.h",

                "torch/nn/modules/adaptive.h",
                "torch/nn/modules/batchnorm.h",
                "torch/nn/modules/instancenorm.h",
                "torch/nn/modules/conv.h",
                "torch/nn/modules/dropout.h",
                "torch/nn/modules/distance.h",
                "torch/nn/modules/embedding.h",
                "torch/nn/modules/fold.h",
                "torch/nn/modules/linear.h",
                "torch/nn/modules/loss.h",
                "torch/nn/modules/padding.h",
                "torch/nn/modules/pooling.h",
                "torch/nn/modules/rnn.h",
                "torch/nn/modules/pixelshuffle.h",
                "torch/nn/modules/upsampling.h",
                "torch/nn/modules/activation.h",
                "torch/nn/modules/normalization.h",
                "torch/nn/modules/transformerlayer.h",
                "torch/nn/modules/transformercoder.h",
                "torch/nn/modules/transformer.h",

                "torch/optim.h",
                "torch/optim/optimizer.h",
                "torch/optim/serialize.h",
                "torch/optim/adagrad.h",
                "torch/optim/adam.h",
                "torch/optim/adamw.h",
                "torch/optim/lbfgs.h",
                "torch/optim/rmsprop.h",
                "torch/optim/sgd.h",
            },
            exclude = {
                "ATen/core/UnsafeFromTH.h",
            },
            link = {"c10", "torch_cpu", "torch"},
            preload = {"gomp@.1", "iomp5", "omp", "tbb@.2", "asmjit", "fbgemm"}
        ),
        @Platform(
            value = {"linux", "macosx", "windows"},
            link = {"c10", "c10_cuda", "torch_cpu", "torch_cuda", "torch"},
            extension = "-gpu"
        ),
    },
    target = "org.bytedeco.pytorch",
    global = "org.bytedeco.pytorch.global.torch"
)
public class torch implements LoadEnabled, InfoMapper {
    static { Loader.checkVersion("org.bytedeco", "pytorch"); }

    @Override public void init(ClassProperties properties) {
        String platform = properties.getProperty("platform");
        String extension = properties.getProperty("platform.extension");
        List<String> preloads = properties.get("platform.preload");
        List<String> resources = properties.get("platform.preloadresource");

        // Only apply this at load time since we don't want to copy the CUDA libraries here
        if (!Loader.isLoadLibraries() || extension == null || !extension.endsWith("-gpu")) {
            return;
        }
        int i = 0;
        String[] libs = {"cudart", "cublasLt", "cublas", "cufft", "curand", "cusolver", "cusparse", "cudnn", "nccl", "nvrtc", "myelin", "nvinfer",
                         "cudnn_ops_infer", "cudnn_ops_train", "cudnn_adv_infer", "cudnn_adv_train", "cudnn_cnn_infer", "cudnn_cnn_train"};
        for (String lib : libs) {
            if (platform.startsWith("linux")) {
                lib += lib.startsWith("cudnn") ? "@.8"
                     : lib.equals("nccl") ? "@.2"
                     : lib.equals("myelin") ? "@.1"
                     : lib.equals("nvinfer") ? "@.7"
                     : lib.equals("cufft") || lib.equals("curand") ? "@.10"
                     : lib.equals("cudart") ? "@.11.0"
                     : lib.equals("nvrtc") ? "@.11.2"
                     : "@.11";
            } else if (platform.startsWith("windows")) {
                lib += lib.startsWith("cudnn") ? "64_8"
                     : lib.equals("nccl") ? "64_2"
                     : lib.equals("myelin") ? "64_1"
                     : lib.equals("nvinfer") ? "64_7"
                     : lib.equals("cufft") || lib.equals("curand") ? "64_10"
                     : lib.equals("cudart") ? "64_110"
                     : lib.equals("nvrtc") ? "64_112_0"
                     : "64_11";
            } else {
                continue; // no CUDA
            }
            if (!preloads.contains(lib)) {
                preloads.add(i++, lib);
            }
        }
        if (i > 0) {
            resources.add("/org/bytedeco/cuda/");
            resources.add("/org/bytedeco/tensorrt/");
        }
    }

    public void mapModule(InfoMap infoMap, String name) {
        mapModule(infoMap, name, false);
    }
    public void mapModule(InfoMap infoMap, String name, String base) {
        mapModule(infoMap, name, base, false);
    }
    public void mapModule(InfoMap infoMap, String name, String base, String baseBase) {
        mapModule(infoMap, name, base, baseBase, false);
    }
    public void mapModule(InfoMap infoMap, String name, boolean hasDefaultConstructor) {
        mapModule(infoMap, name, null, hasDefaultConstructor);
    }
    public void mapModule(InfoMap infoMap, String name, String base, boolean hasDefaultConstructor) {
        mapModule(infoMap, name, base, null, hasDefaultConstructor);
    }
    public void mapModule(InfoMap infoMap, String name, String base, String baseBase, boolean hasDefaultConstructor) {
        if (baseBase != null) {
            infoMap.put(new Info(baseBase).pointerTypes(name + "ImplBaseBase"));
        }

        if (base != null) {
            int template = base.indexOf('<');
            int namespace = base.lastIndexOf("::", template);
            infoMap.put(new Info(base + base.substring(namespace, template)).annotations("@NoDeallocator"))
                   .put(new Info(base, base.replace("torch::nn::" + name + "Impl", name + "Impl")).purify(baseBase != null).pointerTypes(name + "ImplBase"));
        }

        infoMap.put(new Info("torch::nn::" + name + "Impl::" + name + "Impl").annotations("@NoDeallocator"))
               .put(new Info("std::shared_ptr<torch::nn::" + name + "Impl>").annotations("@SharedPtr")
                       .valueTypes("@Cast({\"\", \"std::shared_ptr<torch::nn::" + name + "Impl>\"}) " + name + "Impl").pointerTypes(name + "Impl"))
               .put(new Info("torch::nn::Cloneable<torch::nn::" + name + "Impl>",
                             "torch::nn::Cloneable<" + name + "Impl>").pointerTypes(name + "ImplCloneable"))
               .put(new Info("torch::nn::ModuleHolder<torch::nn::" + name + "Impl>").pointerTypes(name + "ImplModuleHolder"))
               .put(new Info("torch::nn::Module::register_module<torch::nn::" + name + "Impl>").javaNames("register_module"));

        if (!hasDefaultConstructor) {
            infoMap.put(new Info("torch::nn::ModuleHolder<torch::nn::" + name + "Impl>()").skip());
        }
    }

    public void map(InfoMap infoMap) {
        infoMap.put(new Info().enumerate())
               .put(new Info().javaText("import org.bytedeco.pytorch.Allocator;"))
               .put(new Info().javaText("import org.bytedeco.pytorch.Function;"))
               .put(new Info().javaText("import org.bytedeco.pytorch.Module;"))

               .put(new Info("basic/containers").cppTypes("c10::optional", "c10::Dict", "torch::optional", "torch::OrderedDict"))
               .put(new Info("std::nullptr_t").cast().pointerTypes("PointerPointer"))
               .put(new Info("auto", "c10::reverse_iterator", "c10::variant", "ska::flat_hash_map", "std::conditional",
                             "std::initializer_list", "std::integral_constant", "std::mutex", "std::reverse_iterator", "std::weak_ptr").skip())
               .put(new Info("at::CheckedFrom").cast().valueTypes("BytePointer", "String").pointerTypes("PointerPointer"))
               .put(new Info("c10::ScalarType", "at::ScalarType", "torch::Dtype").enumerate().valueTypes("ScalarType").pointerTypes("@Cast(\"c10::ScalarType*\") BytePointer"))
               .put(new Info("std::size_t").cast().valueTypes("long").pointerTypes("SizeTPointer"))
               .put(new Info("std::tuple<int64_t,int64_t>", "std::tuple<double,int64_t>",
                             "torch::ExpandingArray<1>", "torch::ExpandingArray<2>", "torch::ExpandingArray<3>", "torch::ExpandingArray<4>",
                             "torch::ExpandingArray<D*2>", "torch::ExpandingArray<1*2>", "torch::ExpandingArray<2*2>", "torch::ExpandingArray<3*2>",
                             "torch::ExpandingArrayWithOptionalElem<2>", "torch::ExpandingArrayWithOptionalElem<3>").cast().pointerTypes("LongPointer"))
               .put(new Info("torch::ExpandingArray<1,double>", "torch::ExpandingArray<2,double>", "torch::ExpandingArray<3,double>").cast().pointerTypes("DoublePointer"))
               .put(new Info("std::array<bool,2>", "std::array<bool,3>", "std::array<bool,4>").cast().pointerTypes("BoolPointer"))
               .put(new Info("c10::optional<bool>").pointerTypes("BoolOptional").define())
               .put(new Info("c10::optional<int64_t>").pointerTypes("LongOptional").define())
               .put(new Info("c10::optional<double>").pointerTypes("DoubleOptional").define())
               .put(new Info("c10::optional<size_t>").pointerTypes("SizeTOptional").define())
               .put(new Info("c10::optional<std::string>").pointerTypes("StringOptional").define())
               .put(new Info("c10::optional<std::vector<int64_t> >").pointerTypes("LongVectorOptional").define())
               .put(new Info("c10::optional<std::vector<double> >").pointerTypes("DoubleVectorOptional").define())
               .put(new Info("c10::optional<std::vector<size_t> >").pointerTypes("SizeTVectorOptional").define())
               .put(new Info("c10::optional<std::vector<at::Tensor> >").pointerTypes("TensorVectorOptional").define())
               .put(new Info("c10::optional<c10::Device>", "c10::optional<torch::Device>").pointerTypes("DeviceOptional").define())
               .put(new Info("c10::optional<c10::ArrayRef<int64_t> >", "c10::optional<c10::IntArrayRef>", "c10::optional<at::IntArrayRef>").pointerTypes("LongArrayRefOptional").define())
               .put(new Info("c10::optional<c10::ArrayRef<double> >").pointerTypes("DoubleArrayRefOptional").define())
               .put(new Info("c10::optional<c10::Layout>").pointerTypes("LayoutOptional").define())
               .put(new Info("c10::optional<c10::MemoryFormat>").pointerTypes("MemoryFormatOptional").define())
               .put(new Info("c10::optional<c10::Scalar>").pointerTypes("ScalarOptional").define())
               .put(new Info("c10::optional<c10::ScalarType>", "c10::optional<at::ScalarType>", "c10::optional<torch::Dtype>").pointerTypes("ScalarTypeOptional").define())
               .put(new Info("c10::optional<at::Dimname>").pointerTypes("DimnameOptional").define())
               .put(new Info("c10::optional<at::DimnameList>").pointerTypes("DimnameListOptional").define())
               .put(new Info("c10::optional<at::Generator>").pointerTypes("GeneratorOptional").define())
               .put(new Info("c10::optional<at::Tensor>").pointerTypes("TensorOptional").define())
               .put(new Info("c10::optional<at::TensorList>").pointerTypes("TensorListOptional").define())
               .put(new Info("c10::optional<torch::ExpandingArray<1> >",
                             "c10::optional<torch::ExpandingArray<2> >",
                             "c10::optional<torch::ExpandingArray<3> >").cast().pointerTypes("LongExpandingArrayOptional").define())
               .put(new Info("c10::optional<torch::ExpandingArray<1,double> >",
                             "c10::optional<torch::ExpandingArray<2,double> >",
                             "c10::optional<torch::ExpandingArray<3,double> >",
                             "c10::optional<torch::nn::FractionalMaxPoolOptions<1>::ExpandingArrayDouble>",
                             "c10::optional<torch::nn::FractionalMaxPoolOptions<2>::ExpandingArrayDouble>",
                             "c10::optional<torch::nn::FractionalMaxPoolOptions<3>::ExpandingArrayDouble>").cast().pointerTypes("DoubleExpandingArrayOptional").define())
               .put(new Info("torch::optional<std::tuple<at::Tensor,at::Tensor> >").pointerTypes("TensorTensorOptional").define())
               .put(new Info("std::vector<std::array<bool,2> >").pointerTypes("Bool2Vector").define())
               .put(new Info("std::vector<int64_t>", "std::tuple<std::vector<int64_t>,std::vector<int64_t> >").cast().pointerTypes("LongVector").define())
               .put(new Info("std::vector<double>").cast().pointerTypes("DoubleVector").define())
               .put(new Info("std::vector<size_t>").cast().pointerTypes("SizeTVector").define())
               .put(new Info("std::vector<std::string>").pointerTypes("StringVector").define())
               .put(new Info("std::vector<std::pair<std::string,int64_t> >").pointerTypes("StringLongVector").define())
               .put(new Info("std::vector<c10::QEngine>", "std::vector<at::QEngine>").pointerTypes("QEngineVector").define())
               .put(new Info("std::vector<c10::ScalarType>").pointerTypes("ScalarTypeVector").define())
               .put(new Info("c10::Dict<c10::IValue,c10::IValue>").pointerTypes("IValueIValueDict").define())
               .put(new Info("std::unordered_set<c10::IValue,c10::IValue::HashAliasedIValue,c10::IValue::CompAliasedIValues>").pointerTypes("IValueSet").define())
               .put(new Info("std::unordered_map<c10::IValue,c10::IValue,c10::IValue::HashAliasedIValue,c10::IValue::CompAliasedIValues>").pointerTypes("IValueIValueMap").define())
               .put(new Info("std::unordered_map<std::string,std::function<PyObject*(void*)> >").pointerTypes("StringFunctionMap").define())
//               .put(new Info("std::vector<std::shared_ptr<c10::Type> >", "std::vector<c10::TypePtr>").pointerTypes("TypeVector").define())
               .put(new Info("const std::vector<at::Dimname>", "std::vector<at::Dimname>").valueTypes("@StdMove DimnameVector").pointerTypes("DimnameVector").define())
               .put(new Info("std::vector<c10::TensorImpl*>").pointerTypes("TensorImplVector").define())
               .put(new Info("std::vector<at::Tensor>").valueTypes("@StdMove TensorVector").pointerTypes("TensorVector").define())
               .put(new Info("std::vector<at::indexing::TensorIndex>", "std::vector<at::indexing::TensorIndex,A>").pointerTypes("TensorIndexVector").define())
               .put(new Info("std::vector<torch::autograd::Variable>").pointerTypes("TensorVector"))
               .put(new Info("std::vector<std::shared_ptr<torch::autograd::FunctionPreHook> >").pointerTypes("FunctionPreVector").define())
               .put(new Info("std::deque<at::Tensor>").pointerTypes("TensorDeque").define())
               .put(new Info("std::tuple<at::Tensor>", "std::tuple<at::Tensor,at::Tensor>", "std::tuple<at::Tensor,at::Tensor,at::Tensor>",
                             "std::tuple<at::Tensor,at::Tensor,at::Tensor,at::Tensor>", "std::tuple<at::Tensor,at::Tensor,at::Tensor,at::Tensor,at::Tensor>",
                             "std::tuple<at::Tensor,at::Tensor,double,int64_t>", "std::tuple<at::Tensor,at::Tensor,at::Tensor,at::Tensor,int64_t>",
                             "std::tuple<at::Tensor,at::Tensor,at::Tensor,std::vector<at::Tensor> >").cast().pointerTypes("Tensor"))
               .put(new Info("std::tuple<at::Tensor&,at::Tensor&>", "std::tuple<at::Tensor&,at::Tensor&,at::Tensor&>").cast().pointerTypes("PointerPointer<Tensor>"))
               .put(new Info("torch::OrderedDict<std::string,at::Tensor>", "torch::OrderedDict<std::string,torch::Tensor>").pointerTypes("StringTensorDict").define())
               .put(new Info("torch::OrderedDict<std::string,at::Tensor>::Iterator").pointerTypes("StringTensorDict.Iterator"))
               .put(new Info("torch::OrderedDict<std::string,torch::nn::Module>").pointerTypes("StringModuleDict").define())
               .put(new Info("torch::OrderedDict<std::string,torch::nn::AnyModule>")
                       .valueTypes("@Cast({\"\", \"torch::OrderedDict<std::string,torch::nn::AnyModule>&&\"}) @StdMove StringAnyModuleDict").pointerTypes("StringAnyModuleDict").define())
               .put(new Info("torch::OrderedDict<std::string,std::shared_ptr<torch::nn::Module> >").pointerTypes("StringSharedModuleDict").define())
               .put(new Info("torch::OrderedDict<std::string,std::shared_ptr<torch::nn::Module> >::Iterator").pointerTypes("StringSharedModuleDict.Iterator"))
               .put(new Info("std::pair<std::string,torch::Tensor>", "torch::OrderedDict<std::string,torch::Tensor>::Item",
                             "std::vector<torch::OrderedDict<std::string,torch::Tensor>::Item>::iterator").cast().pointerTypes("StringTensorPair").define())
               .put(new Info("std::vector<torch::nn::Module>").pointerTypes("ModuleVector").define())
               .put(new Info("std::vector<torch::nn::Module>::iterator").pointerTypes("ModuleVector.Iterator"))
               .put(new Info("std::vector<torch::nn::AnyModule>").pointerTypes("AnyModuleVector").define())
               .put(new Info("std::vector<torch::nn::AnyModule>::iterator").pointerTypes("AnyModuleVector.Iterator"))
               .put(new Info("std::vector<std::shared_ptr<torch::nn::Module> >").pointerTypes("SharedModuleVector").define())
               .put(new Info("std::vector<std::shared_ptr<torch::nn::Module> >::iterator").pointerTypes("SharedModuleVector.Iterator"))
               .put(new Info("std::vector<std::shared_ptr<torch::nn::AnyModule> >").pointerTypes("SharedAnyModuleVector").define())
               .put(new Info("std::vector<std::shared_ptr<torch::nn::AnyModule> >::iterator").pointerTypes("SharedAnyModuleVector.Iterator"))
               .put(new Info("std::vector<std::pair<std::string,std::shared_ptr<torch::nn::Module> > >").pointerTypes("StringSharedModulePairVector").define())

               .put(new Info("C10_EXPORT", "C10_HIDDEN", "C10_IMPORT", "C10_API", "C10_API_ENUM",
                             "TORCH_API", "TORCH_CUDA_CU_API", "TORCH_CUDA_CPP_API", "TORCH_HIP_API", "TORCH_PYTHON_API",
                             "__ubsan_ignore_float_divide_by_zero__", "__ubsan_ignore_undefined__", "__ubsan_ignore_signed_int_overflow__",
                             "C10_UID", "C10_NODISCARD", "C10_UNUSED", "C10_RESTRICT", "C10_NOINLINE", "C10_ALWAYS_INLINE",
                             "C10_HOST_DEVICE", "C10_DEVICE", "C10_HOST", "C10_LAUNCH_BOUNDS_0", "C10_HIP_HOST_DEVICE",
                             "C10_HOST_CONSTEXPR", "CONSTEXPR_EXCEPT_WIN_CUDA", "C10_HOST_CONSTEXPR_EXCEPT_WIN_CUDA",
                             "alignas", "COMPLEX_INTEGER_OP_TEMPLATE_CONDITION", "C10_DEVICE_HOST_FUNCTION", "FORCE_INLINE_APPLE",
                             "ERROR_UNSUPPORTED_CAST", "LEGACY_CONTIGUOUS_MEMORY_FORMAT", "GFLAGS_DLL_DEFINE_FLAG", "GFLAGS_DLL_DECLARE_FLAG",
                             "AT_X", "DEFINE_KEY").cppTypes().annotations())

               .put(new Info("defined(__CUDACC__) || defined(__HIPCC__)",
                             "defined(_MSC_VER) && _MSC_VER <= 1900",
                             "defined(NDEBUG)",
                             "defined(__ANDROID__)",
                             "defined(__APPLE__)",
                             "defined(__HIP_PLATFORM_HCC__)",
                             "defined(_MSC_VER)", "_WIN32",
                             "defined(CUDA_VERSION) && CUDA_VERSION >= 11000").define(false))

               .put(new Info("C10_DEFINE_DEPRECATED_USING").cppText("#define C10_DEFINE_DEPRECATED_USING(TypeName, TypeThingy)").cppTypes())
               .put(new Info("C10_DEPRECATED_MESSAGE").cppText("#define C10_DEPRECATED_MESSAGE() deprecated").cppTypes())
               .put(new Info("C10_DEPRECATED").cppText("#define C10_DEPRECATED deprecated").cppTypes())
               .put(new Info("deprecated").annotations("@Deprecated"))

               .put(new Info("CAFFE2_LOG_THRESHOLD").translate(false))

               .put(new Info("DEFINE_SYMBOL").cppText("#define DEFINE_SYMBOL(ns, s) namespace ns { constexpr Symbol s; }").define())
               .put(new Info("TORCH_ENUM_DECLARE").cppText("#define TORCH_ENUM_DECLARE(name) namespace torch { namespace enumtype { struct k##name { k##name() {} }; } }").define())

               .put(new Info("c10::Error", "c10::IndexError", "c10::ValueError", "c10::TypeError", "c10::EnforceFiniteError",
                             "c10::OnnxfiBackendSystemError", "c10::Capsule", "c10::OperatorNameView", "c10::StrongTypePtr",
                             "torch::autograd::CppFunctionPreHook", "torch::autograd::DifferentiableViewMeta").purify())

               .put(new Info("c10::intrusive_ptr", "c10::guts::is_fundamental", "c10::operator !=", "c10::operator ==", "c10::operator <<",
                             "c10::domain_prefix", "c10::C10FlagsRegistry", "c10::enforce_detail::EnforceFailMessage",
                             "c10::complex_literals::operator \"\"_if", "c10::complex_literals::operator \"\"_id", "c10::complex<c10::Half>",
                             "c10::InefficientStdFunctionContext", "c10::DataPtr::move_context",
                             "c10::impl::ExcludeDispatchKeyGuard", "c10::impl::ScalarTypeToCPPType",
                             "c10::StorageImpl(c10::StorageImpl)", "c10::StorageImpl::operator =",
                             "c10::TensorImpl(c10::TensorImpl)", "c10::TensorImpl::operator =",
                             "caffe2::Blob(caffe2::Blob)", "caffe2::Blob::operator =",
                             "torch::serialize::InputArchive(torch::serialize::InputArchive)", "torch::serialize::InputArchive::operator =",
                             "torch::serialize::OutputArchive(torch::serialize::OutputArchive)", "torch::serialize::OutputArchive::operator =",
                             "at::impl::check_names_valid_for", "at::internal::launch_no_thread_state",
                             "at::checkSameNumel", "at::check_names_valid_for", "at::default_names", "at::get_device", "at::detail::scalar_fill",
                             "at::namedinference::compute_diagonal_outnames", "torch::optim::serialize",
                             "torch::jit::CompilationUnit", "QuantizerPtr", "c10::IValue::toModule",
                             "at::Tensor::packed_accessor", "c10::List<c10::optional<at::Tensor> >").skip())

               .put(new Info("c10::requires_grad", "at::range").skipDefaults())
               .put(new Info("c10::prim::requires_grad").javaNames("requires_grad"))
               .put(new Info("c10::fetch_and_cast<c10::qint8>").javaNames("fetch_and_cast_qint8"))
               .put(new Info("c10::cast_and_store<c10::qint8>").javaNames("cast_and_store_qint8"))
               .put(new Info("c10::fetch_and_cast<c10::quint8>").javaNames("fetch_and_cast_quint8"))
               .put(new Info("c10::cast_and_store<c10::quint8>").javaNames("cast_and_store_quint8"))
               .put(new Info("c10::fetch_and_cast<c10::qint32>").javaNames("fetch_and_cast_qint32"))
               .put(new Info("c10::cast_and_store<c10::qint32>").javaNames("cast_and_store_qint32"))
               .put(new Info("c10::fetch_and_cast<c10::quint4x2>").javaNames("fetch_and_cast_quint4x2"))
               .put(new Info("c10::cast_and_store<c10::quint4x2>").javaNames("cast_and_store_quint4x2"))
               .put(new Info("c10::aten::clone").javaNames("_clone"))
               .put(new Info("at::Tensor::data_ptr<jbyte>").javaNames("data_ptr_byte"))
               .put(new Info("at::Tensor::data_ptr<jshort>").javaNames("data_ptr_short"))
               .put(new Info("at::Tensor::data_ptr<jint>").javaNames("data_ptr_int"))
               .put(new Info("at::Tensor::data_ptr<jlong>").javaNames("data_ptr_long"))
               .put(new Info("at::Tensor::data_ptr<float>").javaNames("data_ptr_float"))
               .put(new Info("at::Tensor::data_ptr<double>").javaNames("data_ptr_double"))
               .put(new Info("at::Tensor::item<jbyte>").javaNames("item_byte"))
               .put(new Info("at::Tensor::item<jshort>").javaNames("item_short"))
               .put(new Info("at::Tensor::item<jint>").javaNames("item_int"))
               .put(new Info("at::Tensor::item<jlong>").javaNames("item_long"))
               .put(new Info("at::Tensor::item<float>").javaNames("item_float"))
               .put(new Info("at::Tensor::item<double>").javaNames("item_double"))

//               .put(new Info("c10::complex<double>").pointerTypes("DoubleComplex").define())
//               .put(new Info("c10::complex<float>").pointerTypes("FloatComplex").define())
//               .put(new Info("c10::complex<c10::Half>").pointerTypes("HalfComplex").define())
//               .put(new Info("c10::complex<double>::real", "c10::complex<double>::imag",
//                             "c10::complex<float>::real", "c10::complex<float>::imag",
//                             "c10::complex<c10::Half>::real", "c10::complex<c10::Half>::imag").annotations("@Function"))
               .put(new Info("c10::ArrayRef<jbyte>", "c10::ArrayRef<int8_t>", "c10::ArrayRef<uint8_t>").cast().pointerTypes("ByteArrayRef"))
               .put(new Info("c10::ArrayRef<jbyte>::iterator", "c10::ArrayRef<jbyte>::const_iterator").cast().pointerTypes("BytePointer"))
               .put(new Info("c10::ArrayRef<jshort>", "c10::ArrayRef<int16_t>", "c10::ArrayRef<uint16_t>").cast().pointerTypes("ShortArrayRef"))
               .put(new Info("c10::ArrayRef<jshort>::iterator", "c10::ArrayRef<jshort>::const_iterator").cast().pointerTypes("ShortPointer"))
               .put(new Info("c10::ArrayRef<jint>", "c10::ArrayRef<int>", "c10::ArrayRef<int32_t>", "c10::ArrayRef<uint32_t>").cast().pointerTypes("IntArrayRef"))
               .put(new Info("c10::ArrayRef<jint>::iterator", "c10::ArrayRef<jint>::const_iterator").cast().pointerTypes("IntPointer"))
               .put(new Info("c10::ArrayRef<int64_t>", "c10::IntArrayRef").pointerTypes("@Cast(\"c10::ArrayRef<int64_t>*\") LongArrayRef", "@Cast({\"int64_t*\", \"std::vector<int64_t>&\"}) @StdVector long..."))
               .put(new Info("c10::ArrayRef<jlong>::iterator", "c10::ArrayRef<jlong>::const_iterator").cast().pointerTypes("LongPointer"))
               .put(new Info("c10::ArrayRef<float>").pointerTypes("FloatArrayRef"))
               .put(new Info("c10::ArrayRef<float>::iterator", "c10::ArrayRef<float>::const_iterator").cast().pointerTypes("FloatPointer"))
               .put(new Info("c10::ArrayRef<double>").pointerTypes("DoubleArrayRef"))
               .put(new Info("c10::ArrayRef<double>::iterator", "c10::ArrayRef<double>::const_iterator").cast().pointerTypes("DoublePointer"))
               .put(new Info("c10::ArrayRef<size_t>", "at::ArrayRef<size_t>").pointerTypes("SizeTArrayRef"))
               .put(new Info("c10::ArrayRef<size_t>::iterator", "c10::ArrayRef<size_t>::const_iterator").cast().pointerTypes("SizeTPointer"))
               .put(new Info("c10::ArrayRef<decltype(::c10::impl::ScalarTypeToCPPType<::c10::ScalarType::Bool>::t)>").pointerTypes("BoolArrayRef"))
               .put(new Info("c10::ArrayRef<decltype(::c10::impl::ScalarTypeToCPPType<::c10::ScalarType::Bool>::t)>::iterator",
                             "c10::ArrayRef<decltype(::c10::impl::ScalarTypeToCPPType<::c10::ScalarType::Bool>::t)>::const_iterator").cast().pointerTypes("BoolPointer"))
               .put(new Info("c10::ArrayRef<decltype(::c10::impl::ScalarTypeToCPPType<::c10::ScalarType::Half>::t)>").pointerTypes("HalfArrayRef"))
               .put(new Info("c10::ArrayRef<decltype(::c10::impl::ScalarTypeToCPPType<::c10::ScalarType::Half>::t)>::iterator",
                             "c10::ArrayRef<decltype(::c10::impl::ScalarTypeToCPPType<::c10::ScalarType::Half>::t)>::const_iterator").cast().pointerTypes("ShortPointer"))
               .put(new Info("c10::ArrayRef<decltype(::c10::impl::ScalarTypeToCPPType<::c10::ScalarType::BFloat16>::t)>").pointerTypes("BFloat16ArrayRef"))
               .put(new Info("c10::ArrayRef<decltype(::c10::impl::ScalarTypeToCPPType<::c10::ScalarType::BFloat16>::t)>::iterator",
                             "c10::ArrayRef<decltype(::c10::impl::ScalarTypeToCPPType<::c10::ScalarType::BFloat16>::t)>::const_iterator").cast().pointerTypes("ShortPointer"))
               .put(new Info("c10::ArrayRef<c10::complex<float> >", "at::ArrayRef<c10::complex<float> >").pointerTypes("FloatComplexrrayRef"))
               .put(new Info("c10::ArrayRef<c10::complex<float> >::iterator", "c10::ArrayRef<c10::complex<float> >::const_iterator").cast().pointerTypes("FloatPointer"))
               .put(new Info("c10::ArrayRef<c10::complex<double> >", "at::ArrayRef<c10::complex<double> >").pointerTypes("DoubleComplexrrayRef"))
               .put(new Info("c10::ArrayRef<c10::complex<double> >::iterator", "c10::ArrayRef<c10::complex<double> >::const_iterator").cast().pointerTypes("DoublePointer"))
               .put(new Info("c10::ArrayRef<c10::ScalarType>", "at::ArrayRef<c10::ScalarType>", "at::ArrayRef<at::ScalarType>").pointerTypes("ScalarTypeArrayRef"))
               .put(new Info("c10::ArrayRef<c10::ScalarType>::iterator", "c10::ArrayRef<c10::ScalarType>::const_iterator").cast().pointerTypes("BytePointer"))
               .put(new Info("c10::ArrayRef<c10::IValue>").pointerTypes("IValueArrayRef"))
               .put(new Info("c10::ArrayRef<c10::IValue>::iterator", "c10::ArrayRef<c10::IValue>::const_iterator").cast().pointerTypes("IValue"))
//               .put(new Info("c10::ArrayRef<c10::TypePtr>", "at::ArrayRef<c10::TypePtr>").pointerTypes("TypeArrayRef"))
//               .put(new Info("c10::ArrayRef<c10::TypePtr>::iterator", "c10::ArrayRef<c10::TypePtr>::const_iterator").cast().pointerTypes("@SharedPtr Type"))
               .put(new Info("c10::ArrayRef<at::Dimname>", "at::DimnameList").pointerTypes("DimnameArrayRef"))
               .put(new Info("c10::ArrayRef<at::Dimname>::iterator", "c10::ArrayRef<at::Dimname>::const_iterator").cast().pointerTypes("Dimname"))
               .put(new Info("c10::ArrayRef<at::Tensor>", "at::ArrayRef<at::Tensor>", "at::TensorList").pointerTypes("TensorArrayRef"))
               .put(new Info("c10::ArrayRef<at::Tensor>::iterator", "c10::ArrayRef<at::Tensor>::const_iterator").cast().pointerTypes("Tensor"))
               .put(new Info("c10::ArrayRef<at::TensorArg>", "at::ArrayRef<at::TensorArg>").pointerTypes("TensorArgArrayRef"))
               .put(new Info("c10::ArrayRef<at::TensorArg>::iterator", "c10::ArrayRef<at::TensorArg>::const_iterator").cast().pointerTypes("TensorArg"))
               .put(new Info("c10::ArrayRef<at::indexing::TensorIndex>").pointerTypes("TensorIndexArrayRef"))
               .put(new Info("c10::ArrayRef<at::indexing::TensorIndex>(std::vector<at::indexing::TensorIndex,A>&)").javaText(
                       "public TensorIndexArrayRef(@ByRef TensorIndexVector Vec) { super((Pointer)null); allocate(Vec); }\n"
                     + "private native void allocate(@ByRef TensorIndexVector Vec);"))
               .put(new Info("c10::ArrayRef<at::indexing::TensorIndex>::iterator", "c10::ArrayRef<at::indexing::TensorIndex>::const_iterator").cast().pointerTypes("TensorIndex"))
               .put(new Info("c10::ArrayRef<at::TensorArg>::equals", "c10::ArrayRef<at::Tensor>::equals", "c10::ArrayRef<at::indexing::TensorIndex>::equals").skip())

               .put(new Info("std::hash<c10::DeviceType>").pointerTypes("DeviceTypeHash"))
               .put(new Info("std::hash<c10::Device>").pointerTypes("DeviceHash"))
               .put(new Info("std::hash<c10::Stream>").pointerTypes("StreamHash"))
               .put(new Info("std::hash<c10::Symbol>").pointerTypes("SymbolHash"))
               .put(new Info("decltype(::c10::impl::ScalarTypeToCPPType<::c10::ScalarType::Bool>::t)").cast().valueTypes("boolean").pointerTypes("BoolPointer"))
               .put(new Info("decltype(::c10::impl::ScalarTypeToCPPType<::c10::ScalarType::Half>::t)").pointerTypes("Half"))
               .put(new Info("decltype(::c10::impl::ScalarTypeToCPPType<::c10::ScalarType::BFloat16>::t)").pointerTypes("BFloat16"))
               .put(new Info("c10::DataPtr", "at::DataPtr").valueTypes("@Cast({\"\", \"c10::DataPtr&&\"}) @StdMove DataPtr").pointerTypes("DataPtr"))
               .put(new Info("c10::Storage", "at::Storage").valueTypes("@Cast({\"\", \"c10::Storage&&\"}) @StdMove Storage").pointerTypes("Storage"))
//               .put(new Info("std::shared_ptr<c10::Type>", "c10::TypePtr").annotations("@SharedPtr").valueTypes("Type").pointerTypes("Type"))
               .put(new Info("at::namedinference::TensorName").valueTypes("@Cast({\"\", \"at::namedinference::TensorName&&\"}) @StdMove TensorName").pointerTypes("TensorName"))
               .put(new Info("std::shared_ptr<torch::autograd::FunctionPreHook>").annotations("@SharedPtr").valueTypes("FunctionPreHook").pointerTypes("FunctionPreHook"))

               .put(new Info("std::vector<torch::data::Example<> >",
                             "std::vector<torch::data::datasets::Dataset<torch::data::datasets::MNIST,torch::data::Example<> >::ExampleType>").pointerTypes("ExampleVector").define())
               .put(new Info("torch::data::Example<torch::Tensor,torch::Tensor>", "torch::data::Example<>").pointerTypes("Example"))
//               .put(new Info("torch::data::Example<torch::Tensor,torch::data::example::NoTarget>").pointerTypes("TensorExample"))
//               .put(new Info("torch::data::detail::SentinelIterator<std::vector<torch::data::Example<> > >").pointerTypes("ExampleSentinelIterator"))
//               .put(new Info("torch::data::detail::ValidIterator<std::vector<torch::data::Example<> > >").pointerTypes("ExampleValidIterator"))
//               .put(new Info("torch::data::detail::IteratorImpl<std::vector<torch::data::Example<> > >").pointerTypes("ExampleIteratorImpl"))
               .put(new Info("torch::data::Iterator<torch::data::Example<> >").purify().pointerTypes("ExampleIterator"))
               .put(new Info("torch::data::Iterator<std::vector<torch::data::Example<> > >").purify().pointerTypes("ExampleVectorIterator"))
               .put(new Info("torch::data::samplers::Sampler<std::vector<size_t> >", "torch::data::samplers::Sampler<>").pointerTypes("Sampler"))
               .put(new Info("torch::data::transforms::BatchTransform<std::vector<torch::data::Example<> >, torch::data::Example<> >",
                             "torch::data::transforms::Collation<torch::data::Example<> >").pointerTypes("ExampleCollation"))
               .put(new Info("torch::data::transforms::Stack<torch::data::Example<> >").pointerTypes("ExampleStack"))

               .put(new Info("torch::data::DataLoaderBase<torch::data::datasets::MapDataset<torch::data::datasets::MNIST,torch::data::transforms::Stack<torch::data::Example<> > >,torch::data::Example<>,std::vector<size_t> >",
                             "torch::data::DataLoaderBase<torch::data::datasets::MapDataset<torch::data::datasets::MNIST,torch::data::transforms::Stack<torch::data::Example<> > >,torch::data::datasets::MapDataset<torch::data::datasets::MNIST,torch::data::transforms::Stack<torch::data::Example<> > >::BatchType,torch::data::samplers::RandomSampler::BatchRequestType>")
                       .purify().pointerTypes("MNISTRandomDataLoaderBase"))
               .put(new Info("torch::data::StatelessDataLoader<torch::data::datasets::MapDataset<torch::data::datasets::MNIST,torch::data::transforms::Stack<torch::data::Example<> > >,torch::data::samplers::RandomSampler>").pointerTypes("MNISTRandomDataLoader"))
               .put(new Info("torch::data::datasets::Dataset<torch::data::datasets::MNIST,torch::data::Example<> >",
                             "torch::data::datasets::Dataset<MNIST>").pointerTypes("MNISTDataSet"))
               .put(new Info("torch::data::datasets::BatchDataset<torch::data::datasets::MNIST,std::vector<torch::data::Example<> >,at::ArrayRef<size_t> >",
                             "torch::data::datasets::BatchDataset<torch::data::datasets::MNIST,std::vector<torch::data::Example<> > >").pointerTypes("MNISTBatchDataset"))
               .put(new Info("torch::data::datasets::BatchDataset<torch::data::datasets::MNIST,std::vector<torch::data::Example<> >,at::ArrayRef<size_t> >::map")
                       .javaText("public native @ByVal MNISTMapDataset map(@ByVal ExampleStack transform);"))
//               .put(new Info("torch::data::datasets::BatchDataset<torch::data::datasets::MNIST,std::vector<torch::data::Example<> >,at::ArrayRef<size_t> >::map<torch::data::transforms::Stack<torch::data::Example<> > >")
//                       .javaNames("map"))
               .put(new Info("torch::data::datasets::MapDataset<torch::data::datasets::MNIST,torch::data::transforms::Stack<torch::data::Example<> > >").pointerTypes("MNISTMapDataset"))
               .put(new Info("torch::data::datasets::MapDataset<torch::data::datasets::MNIST,torch::data::transforms::Stack<torch::data::Example<> > >::reset").skip())
               .put(new Info("torch::data::datasets::MapDataset<torch::data::datasets::MNIST,torch::data::transforms::Stack<torch::data::Example<> > >::DatasetType").pointerTypes("MNIST"))
               .put(new Info("torch::data::datasets::BatchDataset<torch::data::datasets::MapDataset<torch::data::datasets::MNIST,torch::data::transforms::Stack<torch::data::Example<> > >,std::vector<torch::data::Example<> >,at::ArrayRef<size_t> >",
                             "torch::data::datasets::BatchDataset<torch::data::datasets::MapDataset<torch::data::datasets::MNIST,torch::data::transforms::Stack<torch::data::Example<> > >,torch::data::datasets::detail::optional_if_t<torch::data::datasets::MNIST::is_stateful,torch::data::transforms::Stack<torch::data::Example<> >::OutputBatchType>,torch::data::datasets::MNIST::BatchRequestType>")
                       .pointerTypes("MNISTMapBatchDataset"))
//               .put(new Info("torch::data::datasets::MapDataset<torch::data::datasets::MNIST,torch::data::transforms::Stack<torch::data::Example<> > >::BatchRequestType").pointerTypes("SizeTArrayRef"))
//               .put(new Info("torch::data::datasets::MapDataset<torch::data::datasets::MNIST,torch::data::transforms::Stack<torch::data::Example<> > >::OutputBatchType").pointerTypes("Example"))
               .put(new Info("torch::data::datasets::MapDataset<torch::data::datasets::MNIST,torch::data::transforms::Stack<torch::data::Example<> > >::get_batch")
                       .javaText("public native @Name(\"get_batch\") @ByVal Example get_batch_example(@ByVal SizeTArrayRef indices);"))

               .put(new Info("torch::nn::detail::ConvNdOptions<1>").pointerTypes("DetailConv1dOptions"))
               .put(new Info("torch::nn::detail::ConvNdOptions<2>").pointerTypes("DetailConv2dOptions"))
               .put(new Info("torch::nn::detail::ConvNdOptions<3>").pointerTypes("DetailConv3dOptions"))
               .put(new Info("torch::nn::ConvOptions<1>").pointerTypes("Conv1dOptions"))
               .put(new Info("torch::nn::ConvOptions<2>").pointerTypes("Conv2dOptions"))
               .put(new Info("torch::nn::ConvOptions<3>").pointerTypes("Conv3dOptions"))
               .put(new Info("torch::nn::functional::ConvFuncOptions<1>").pointerTypes("Conv1dFuncOptions"))
               .put(new Info("torch::nn::functional::ConvFuncOptions<2>").pointerTypes("Conv2dFuncOptions"))
               .put(new Info("torch::nn::functional::ConvFuncOptions<3>").pointerTypes("Conv3dFuncOptions"))
               .put(new Info("torch::nn::ConvTransposeOptions<1>").pointerTypes("ConvTranspose1dOptions"))
               .put(new Info("torch::nn::ConvTransposeOptions<2>").pointerTypes("ConvTranspose2dOptions"))
               .put(new Info("torch::nn::ConvTransposeOptions<3>").pointerTypes("ConvTranspose3dOptions"))
               .put(new Info("torch::nn::functional::ConvTransposeFuncOptions<1>").pointerTypes("ConvTranspose1dFuncOptions"))
               .put(new Info("torch::nn::functional::ConvTransposeFuncOptions<2>").pointerTypes("ConvTranspose2dFuncOptions"))
               .put(new Info("torch::nn::functional::ConvTransposeFuncOptions<3>").pointerTypes("ConvTranspose3dFuncOptions"))

               .put(new Info("torch::nn::ReflectionPadOptions<1>").pointerTypes("ReflectionPad1dOptions"))
               .put(new Info("torch::nn::ReflectionPadOptions<2>").pointerTypes("ReflectionPad2dOptions"))
               .put(new Info("torch::nn::ReplicationPadOptions<1>").pointerTypes("ReplicationPad1dOptions"))
               .put(new Info("torch::nn::ReplicationPadOptions<2>").pointerTypes("ReplicationPad2dOptions"))
               .put(new Info("torch::nn::ReplicationPadOptions<3>").pointerTypes("ReplicationPad3dOptions"))
               .put(new Info("torch::nn::ConstantPadOptions<1>").pointerTypes("ConstantPad1dOptions"))
               .put(new Info("torch::nn::ConstantPadOptions<2>").pointerTypes("ConstantPad2dOptions"))
               .put(new Info("torch::nn::ConstantPadOptions<3>").pointerTypes("ConstantPad3dOptions"))

               .put(new Info("torch::nn::AvgPoolOptions<1>", "torch::nn::functional::AvgPool1dFuncOptions").pointerTypes("AvgPool1dOptions"))
               .put(new Info("torch::nn::AvgPoolOptions<2>", "torch::nn::functional::AvgPool2dFuncOptions").pointerTypes("AvgPool2dOptions"))
               .put(new Info("torch::nn::AvgPoolOptions<3>", "torch::nn::functional::AvgPool3dFuncOptions").pointerTypes("AvgPool3dOptions"))
               .put(new Info("torch::nn::MaxPoolOptions<1>", "torch::nn::functional::MaxPool1dFuncOptions").pointerTypes("MaxPool1dOptions"))
               .put(new Info("torch::nn::MaxPoolOptions<2>", "torch::nn::functional::MaxPool2dFuncOptions").pointerTypes("MaxPool2dOptions"))
               .put(new Info("torch::nn::MaxPoolOptions<3>", "torch::nn::functional::MaxPool3dFuncOptions").pointerTypes("MaxPool3dOptions"))
               .put(new Info("torch::nn::AdaptiveAvgPoolOptions<torch::ExpandingArray<1> >", "torch::nn::functional::AdaptiveAvgPool1dFuncOptions").pointerTypes("AdaptiveAvgPool1dOptions"))
               .put(new Info("torch::nn::AdaptiveAvgPoolOptions<torch::ExpandingArrayWithOptionalElem<2> >", "torch::nn::functional::AdaptiveAvgPool2dFuncOptions").pointerTypes("AdaptiveAvgPool2dOptions"))
               .put(new Info("torch::nn::AdaptiveAvgPoolOptions<torch::ExpandingArrayWithOptionalElem<3> >", "torch::nn::functional::AdaptiveAvgPool3dFuncOptions").pointerTypes("AdaptiveAvgPool3dOptions"))
               .put(new Info("torch::nn::AdaptiveMaxPoolOptions<torch::ExpandingArray<1> >", "torch::nn::functional::AdaptiveMaxPool1dFuncOptions").pointerTypes("AdaptiveMaxPool1dOptions"))
               .put(new Info("torch::nn::AdaptiveMaxPoolOptions<torch::ExpandingArrayWithOptionalElem<2> >", "torch::nn::functional::AdaptiveMaxPool2dFuncOptions").pointerTypes("AdaptiveMaxPool2dOptions"))
               .put(new Info("torch::nn::AdaptiveMaxPoolOptions<torch::ExpandingArrayWithOptionalElem<3> >", "torch::nn::functional::AdaptiveMaxPool3dFuncOptions").pointerTypes("AdaptiveMaxPool3dOptions"))
               .put(new Info("torch::nn::MaxUnpoolOptions<1>").pointerTypes("MaxUnpool1dOptions"))
               .put(new Info("torch::nn::MaxUnpoolOptions<2>").pointerTypes("MaxUnpool2dOptions"))
               .put(new Info("torch::nn::MaxUnpoolOptions<3>").pointerTypes("MaxUnpool3dOptions"))
               .put(new Info("torch::nn::functional::MaxUnpoolFuncOptions<1>").pointerTypes("MaxUnpool1dFuncOptions"))
               .put(new Info("torch::nn::functional::MaxUnpoolFuncOptions<2>").pointerTypes("MaxUnpool2dFuncOptions"))
               .put(new Info("torch::nn::functional::MaxUnpoolFuncOptions<3>").pointerTypes("MaxUnpool3dFuncOptions"))
               .put(new Info("torch::nn::FractionalMaxPoolOptions<1>", "torch::nn::functional::FractionalMaxPool1dFuncOptions").pointerTypes("FractionalMaxPool1dOptions"))
               .put(new Info("torch::nn::FractionalMaxPoolOptions<2>", "torch::nn::functional::FractionalMaxPool2dFuncOptions").pointerTypes("FractionalMaxPool2dOptions"))
               .put(new Info("torch::nn::FractionalMaxPoolOptions<3>", "torch::nn::functional::FractionalMaxPool3dFuncOptions").pointerTypes("FractionalMaxPool3dOptions"))
               .put(new Info("torch::nn::LPPoolOptions<1>", "torch::nn::functional::LPPool1dFuncOptions").pointerTypes("LPPool1dOptions"))
               .put(new Info("torch::nn::LPPoolOptions<2>", "torch::nn::functional::LPPool2dFuncOptions").pointerTypes("LPPool2dOptions"))
               .put(new Info("torch::nn::LPPoolOptions<3>", "torch::nn::functional::LPPool3dFuncOptions").pointerTypes("LPPool3dOptions"))

               .put(new Info("std::shared_ptr<torch::nn::Module>").annotations("@SharedPtr")
                       .valueTypes("@Cast({\"\", \"std::shared_ptr<torch::nn::Module>\"}) Module").pointerTypes("Module"))
               .put(new Info("torch::nn::ModuleHolder<torch::nn::Module>").pointerTypes("ModuleHolder"))
               .put(new Info("torch::nn::Module::register_module<torch::nn::Module>").javaNames("register_module"))
               .put(new Info("std::shared_ptr<torch::nn::AnyModule>").annotations("@SharedPtr")
                       .valueTypes("@Cast({\"\", \"std::shared_ptr<torch::nn::AnyModule>\"}) AnyModule").pointerTypes("AnyModule"));

        mapModule(infoMap, "ModuleDict", true);
        mapModule(infoMap, "ModuleList", true);
        mapModule(infoMap, "Sequential", true);
        mapModule(infoMap, "ParameterDict", true);
        mapModule(infoMap, "ParameterList", true);

        mapModule(infoMap, "AdaptiveLogSoftmaxWithLoss", false);

        for (int i = 1; i <= 3; i++) {
            mapModule(infoMap, "BatchNorm" + i + "d", "torch::nn::BatchNormImplBase<" + i + ",torch::nn::BatchNorm" + i + "dImpl>",
                                                      "torch::nn::NormImplBase<" + i + ",torch::nn::BatchNorm" + i + "dImpl,torch::nn::BatchNormOptions>");
            mapModule(infoMap, "InstanceNorm" + i + "d", "torch::nn::InstanceNormImpl<" + i + ",torch::nn::InstanceNorm" + i + "dImpl>",
                                                         "torch::nn::NormImplBase<" + i + ",torch::nn::InstanceNorm" + i + "dImpl,torch::nn::InstanceNormOptions>");

            mapModule(infoMap, "Conv" + i + "d", "torch::nn::ConvNdImpl<" + i + ",torch::nn::Conv" + i + "dImpl>");
            mapModule(infoMap, "ConvTranspose" + i + "d", "torch::nn::ConvTransposeNdImpl<" + i + ",torch::nn::ConvTranspose" + i + "dImpl>",
                                                          "torch::nn::ConvNdImpl<" + i + ",torch::nn::ConvTranspose" + i + "dImpl>");

            mapModule(infoMap, "Dropout" + (i > 1 ? i + "d" : ""), "torch::nn::detail::_DropoutNd<torch::nn::Dropout" + (i > 1 ? i + "d" : "") + "Impl>");
        }
        mapModule(infoMap, "AlphaDropout", "torch::nn::detail::_DropoutNd<torch::nn::AlphaDropoutImpl>");
        mapModule(infoMap, "FeatureAlphaDropout", "torch::nn::detail::_DropoutNd<torch::nn::FeatureAlphaDropoutImpl>");

        mapModule(infoMap, "CosineSimilarity");
        mapModule(infoMap, "PairwiseDistance");

        mapModule(infoMap, "Embedding");
        mapModule(infoMap, "EmbeddingBag");

        mapModule(infoMap, "Fold");
        mapModule(infoMap, "Unfold");

        mapModule(infoMap, "Identity");
        mapModule(infoMap, "Linear");
        mapModule(infoMap, "Bilinear");
        mapModule(infoMap, "Flatten");
        mapModule(infoMap, "Unflatten");

        mapModule(infoMap, "L1Loss");
        mapModule(infoMap, "KLDivLoss");
        mapModule(infoMap, "MSELoss");
        mapModule(infoMap, "BCELoss");
        mapModule(infoMap, "HingeEmbeddingLoss");
        mapModule(infoMap, "MultiMarginLoss");
        mapModule(infoMap, "CosineEmbeddingLoss");
        mapModule(infoMap, "SmoothL1Loss");
        mapModule(infoMap, "MultiLabelMarginLoss");
        mapModule(infoMap, "SoftMarginLoss");
        mapModule(infoMap, "MultiLabelSoftMarginLoss");
        mapModule(infoMap, "TripletMarginLoss");
        mapModule(infoMap, "TripletMarginWithDistanceLoss");
        mapModule(infoMap, "CTCLoss");
        mapModule(infoMap, "PoissonNLLLoss");
        mapModule(infoMap, "MarginRankingLoss");
        mapModule(infoMap, "NLLLoss");
        mapModule(infoMap, "CrossEntropyLoss");
        mapModule(infoMap, "BCEWithLogitsLoss");

        for (int i = 1; i <= 3; i++) {
            if (i < 3) {
                mapModule(infoMap, "ReflectionPad" + i + "d", "torch::nn::ReflectionPadImpl<" + i + ",torch::nn::ReflectionPad" + i + "dImpl>");
            }
            mapModule(infoMap, "ReplicationPad" + i + "d", "torch::nn::ReplicationPadImpl<" + i + ",torch::nn::ReplicationPad" + i + "dImpl>");
            mapModule(infoMap, "ConstantPad" + i + "d", "torch::nn::ConstantPadImpl<" + i + ",torch::nn::ConstantPad" + i + "dImpl>");
            if (i == 2) {
                mapModule(infoMap, "ZeroPad" + i + "d");
            }

            mapModule(infoMap, "AvgPool" + i + "d", "torch::nn::AvgPoolImpl<" + i + ",torch::nn::AvgPool" + i + "dImpl>");
            mapModule(infoMap, "MaxPool" + i + "d", "torch::nn::MaxPoolImpl<" + i + ",torch::nn::MaxPool" + i + "dImpl>");
            mapModule(infoMap, "AdaptiveAvgPool" + i + "d", "torch::nn::AdaptiveAvgPoolImpl<" + i + ",torch::ExpandingArray" + (i > 1 ? "WithOptionalElem<" : "<") + i + ">,torch::nn::AdaptiveAvgPool" + i + "dImpl>");
            mapModule(infoMap, "AdaptiveMaxPool" + i + "d", "torch::nn::AdaptiveMaxPoolImpl<" + i + ",torch::ExpandingArray" + (i > 1 ? "WithOptionalElem<" : "<") + i + ">,torch::nn::AdaptiveMaxPool" + i + "dImpl>");
            mapModule(infoMap, "MaxUnpool" + i + "d", "torch::nn::MaxUnpoolImpl<" + i + ",torch::nn::MaxUnpool" + i + "dImpl>");
            if (i > 1) {
                mapModule(infoMap, "FractionalMaxPool" + i + "d", "torch::nn::FractionalMaxPoolImpl<" + i + ",torch::nn::FractionalMaxPool" + i + "dImpl>");
            }
            if (i < 3) {
                mapModule(infoMap, "LPPool" + i + "d", "torch::nn::LPPoolImpl<" + i + ",torch::nn::LPPool" + i + "dImpl>");
            }
        }

        mapModule(infoMap, "RNN", "torch::nn::detail::RNNImplBase<torch::nn::RNNImpl>");
        mapModule(infoMap, "LSTM", "torch::nn::detail::RNNImplBase<torch::nn::LSTMImpl>");
        mapModule(infoMap, "GRU", "torch::nn::detail::RNNImplBase<torch::nn::GRUImpl>");
        mapModule(infoMap, "RNNCell", "torch::nn::detail::RNNCellImplBase<torch::nn::RNNCellImpl>");
        mapModule(infoMap, "LSTMCell", "torch::nn::detail::RNNCellImplBase<torch::nn::LSTMCellImpl>");
        mapModule(infoMap, "GRUCell", "torch::nn::detail::RNNCellImplBase<torch::nn::GRUCellImpl>");

        mapModule(infoMap, "PixelShuffle");
        mapModule(infoMap, "PixelUnshuffle");
        mapModule(infoMap, "Upsample");

        mapModule(infoMap, "ELU");
        mapModule(infoMap, "SELU");
        mapModule(infoMap, "Hardshrink");
        mapModule(infoMap, "Hardtanh");
        mapModule(infoMap, "LeakyReLU");
        mapModule(infoMap, "LogSigmoid");
        mapModule(infoMap, "Softmax");
        mapModule(infoMap, "Softmin");
        mapModule(infoMap, "LogSoftmax");
        mapModule(infoMap, "Softmax2d");
        mapModule(infoMap, "PReLU");
        mapModule(infoMap, "ReLU");
        mapModule(infoMap, "ReLU6");
        mapModule(infoMap, "RReLU");
        mapModule(infoMap, "CELU");
        mapModule(infoMap, "GLU");
        mapModule(infoMap, "GELU");
        mapModule(infoMap, "SiLU");
        mapModule(infoMap, "Sigmoid");
        mapModule(infoMap, "Softplus");
        mapModule(infoMap, "Softshrink");
        mapModule(infoMap, "Softsign");
        mapModule(infoMap, "Tanh");
        mapModule(infoMap, "Tanhshrink");
        mapModule(infoMap, "Threshold");
        mapModule(infoMap, "MultiheadAttention");

        mapModule(infoMap, "LayerNorm");
        mapModule(infoMap, "LocalResponseNorm");
        mapModule(infoMap, "CrossMapLRN2d");
        mapModule(infoMap, "GroupNorm");

        mapModule(infoMap, "TransformerEncoderLayer");
        mapModule(infoMap, "TransformerDecoderLayer");
        mapModule(infoMap, "TransformerEncoder");
        mapModule(infoMap, "TransformerDecoder");
        mapModule(infoMap, "Transformer");

        infoMap.put(new Info("torch::optim::OptimizerCloneableOptions<torch::optim::AdagradOptions>",
                             "torch::optim::OptimizerCloneableOptions<AdagradOptions>").pointerTypes("OptimizerCloneableAdagradOptions"))
               .put(new Info("torch::optim::OptimizerCloneableParamState<torch::optim::AdagradParamState>",
                             "torch::optim::OptimizerCloneableParamState<AdagradParamState>").pointerTypes("OptimizerCloneableAdagradParamState"))
               .put(new Info("torch::optim::OptimizerCloneableOptions<torch::optim::AdamOptions>",
                             "torch::optim::OptimizerCloneableOptions<AdamOptions>").pointerTypes("OptimizerCloneableAdamOptions"))
               .put(new Info("torch::optim::OptimizerCloneableParamState<torch::optim::AdamParamState>",
                             "torch::optim::OptimizerCloneableParamState<AdamParamState>").pointerTypes("OptimizerCloneableAdamParamState"))
               .put(new Info("torch::optim::OptimizerCloneableOptions<torch::optim::AdamWOptions>",
                             "torch::optim::OptimizerCloneableOptions<AdamWOptions>").pointerTypes("OptimizerCloneableAdamWOptions"))
               .put(new Info("torch::optim::OptimizerCloneableParamState<torch::optim::AdamWParamState>",
                             "torch::optim::OptimizerCloneableParamState<AdamWParamState>").pointerTypes("OptimizerCloneableAdamWParamState"))
               .put(new Info("torch::optim::OptimizerCloneableOptions<torch::optim::LBFGSOptions>",
                             "torch::optim::OptimizerCloneableOptions<LBFGSOptions>").pointerTypes("OptimizerCloneableLBFGSOptions"))
               .put(new Info("torch::optim::OptimizerCloneableParamState<torch::optim::LBFGSParamState>",
                             "torch::optim::OptimizerCloneableParamState<LBFGSParamState>").pointerTypes("OptimizerCloneableLBFGSParamState"))
               .put(new Info("torch::optim::OptimizerCloneableOptions<torch::optim::RMSpropOptions>",
                             "torch::optim::OptimizerCloneableOptions<RMSpropOptions>").pointerTypes("OptimizerCloneableRMSpropOptions"))
               .put(new Info("torch::optim::OptimizerCloneableParamState<torch::optim::RMSpropParamState>",
                             "torch::optim::OptimizerCloneableParamState<RMSpropParamState>").pointerTypes("OptimizerCloneableRMSpropParamState"))
               .put(new Info("torch::optim::OptimizerCloneableOptions<torch::optim::SGDOptions>",
                             "torch::optim::OptimizerCloneableOptions<SGDOptions>").pointerTypes("OptimizerCloneableSGDOptions"))
               .put(new Info("torch::optim::OptimizerCloneableParamState<torch::optim::SGDParamState>",
                             "torch::optim::OptimizerCloneableParamState<SGDParamState>").pointerTypes("OptimizerCloneableSGDParamState"))

               .put(new Info("c10::intrusive_ptr_target", "c10::nullopt", "c10::nullopt_t", "c10::string_view", "caffe2::TypeMeta", "c10::GeneratorImpl", "c10::impl::DeviceGuardImplInterface",
                             "PyObject", "std::function<PyObject*(void*)>", "std::chrono::milliseconds", "std::exception_ptr", "std::type_info",
//                             "std::enable_shared_from_this<c10::Type>", "c10::SingleElementType<c10::TypeKind::ListType,c10::ListType>",
                             "at::cuda::NVRTC", "THCState", "THHState", "std::enable_shared_from_this<torch::autograd::ForwardGrad>", "torch::autograd::ViewInfo",
                             "torch::nn::init::NonlinearityType", "torch::nn::init::FanModeType", "torch::nn::detail::conv_padding_mode_t",
                             "torch::nn::ConvOptions<1>::padding_mode_t", "torch::nn::ConvTransposeOptions<1>::padding_mode_t",
                             "torch::nn::ConvOptions<2>::padding_mode_t", "torch::nn::ConvTransposeOptions<2>::padding_mode_t",
                             "torch::nn::ConvOptions<3>::padding_mode_t", "torch::nn::ConvTransposeOptions<3>::padding_mode_t",
                             "torch::nn::EmbeddingBagMode", "torch::nn::functional::PadFuncOptions::mode_t",

                             "torch::nn::L1LossOptions::reduction_t", "torch::nn::functional::L1LossFuncOptions::reduction_t",
                             "torch::nn::KLDivLossOptions::reduction_t", "torch::nn::functional::KLDivFuncOptions::reduction_t",
                             "torch::nn::MSELossOptions::reduction_t", "torch::nn::functional::MSELossFuncOptions::reduction_t",
                             "torch::nn::BCELossOptions::reduction_t", "torch::nn::functional::BinaryCrossEntropyFuncOptions::reduction_t",
                             "torch::nn::HingeEmbeddingLossOptions::reduction_t", "torch::nn::functional::HingeEmbeddingLossFuncOptions::reduction_t",
                             "torch::nn::MultiMarginLossOptions::reduction_t", "torch::nn::functional::MultiMarginLossFuncOptions::reduction_t",
                             "torch::nn::CosineEmbeddingLossOptions::reduction_t", "torch::nn::functional::CosineEmbeddingLossFuncOptions::reduction_t",
                             "torch::nn::MultiLabelMarginLossOptions::reduction_t", "torch::nn::functional::MultilabelMarginLossFuncOptions::reduction_t",
                             "torch::nn::SoftMarginLossOptions::reduction_t", "torch::nn::functional::SoftMarginLossFuncOptions::reduction_t",
                             "torch::nn::MultiLabelSoftMarginLossOptions::reduction_t", "torch::nn::functional::MultilabelSoftMarginLossFuncOptions::reduction_t",
                             "torch::nn::TripletMarginLossOptions::reduction_t", "torch::nn::functional::TripletMarginLossFuncOptions::reduction_t",
                             "torch::nn::TripletMarginWithDistanceLossOptions::reduction_t", "torch::nn::functional::TripletMarginWithDistanceLossFuncOptions::reduction_t",
                             "torch::nn::CTCLossOptions::reduction_t", "torch::nn::functional::CTCLossFuncOptions::reduction_t",
                             "torch::nn::SmoothL1LossOptions::reduction_t", "torch::nn::functional::SmoothL1LossFuncOptions::reduction_t",
                             "torch::nn::PoissonNLLLossOptions::reduction_t", "torch::nn::functional::PoissonNLLLossFuncOptions::reduction_t",
                             "torch::nn::MarginRankingLossOptions::reduction_t", "torch::nn::functional::MarginRankingLossFuncOptions::reduction_t",
                             "torch::nn::NLLLossOptions::reduction_t", "torch::nn::functional::NLLLossFuncOptions::reduction_t",
                             "torch::nn::CrossEntropyLossOptions::reduction_t", "torch::nn::functional::CrossEntropyFuncOptions::reduction_t",
                             "torch::nn::BCEWithLogitsLossOptions::reduction_t", "torch::nn::functional::BinaryCrossEntropyWithLogitsFuncOptions::reduction_t",

                             "torch::nn::detail::RNNOptionsBase::rnn_options_base_mode_t", "torch::nn::detail::RNNOptionsBase::rnn_options_base_mode_t",
                             "torch::nn::RNNOptions::nonlinearity_t", "torch::nn::RNNOptions::nonlinearity_t",
                             "torch::nn::RNNCellOptions::nonlinearity_t", "torch::nn::RNNCellOptions::nonlinearity_t",
                             "torch::nn::UpsampleOptions::mode_t", "torch::nn::UpsampleOptions::mode_t",
                             "torch::nn::functional::InterpolateFuncOptions::mode_t", "torch::nn::functional::InterpolateFuncOptions::mode_t",
                             "torch::nn::functional::GridSampleFuncOptions::mode_t", "torch::nn::functional::GridSampleFuncOptions::mode_t",
                             "torch::nn::functional::GridSampleFuncOptions::padding_mode_t", "torch::nn::functional::GridSampleFuncOptions::padding_mode_t",
                             "torch::nn::TransformerEncoderLayerOptions::activation_t", "torch::nn::TransformerEncoderLayerOptions::activation_t",
                             "torch::nn::TransformerDecoderLayerOptions::activation_t", "torch::nn::TransformerDecoderLayerOptions::activation_t",
                             "torch::nn::TransformerOptions::activation_t", "torch::nn::TransformerOptions::activation_t",

                             "c10::optional<c10::string_view>", "c10::optional<caffe2::TypeMeta>", "c10::optional<std::chrono::milliseconds>",
                             "c10::optional<torch::autograd::ViewInfo>", "c10::optional<std::reference_wrapper<const std::string> >",
                             "c10::optional<torch::nn::TripletMarginWithDistanceLossOptions::distance_function_t>",
                             "c10::optional<torch::nn::functional::TripletMarginWithDistanceLossFuncOptions::distance_function_t>",
                             "std::tuple<at::Tensor,c10::optional<std::vector<int64_t> >,c10::optional<std::vector<double> >,c10::optional<bool> >",
                             "std::tuple<at::Tensor,std::tuple<at::Tensor,at::Tensor> >",
                             "std::tuple<torch::nn::utils::rnn::PackedSequence,at::Tensor>",
                             "std::tuple<torch::nn::utils::rnn::PackedSequence,std::tuple<at::Tensor,at::Tensor> >",

                             "std::enable_shared_from_this<torch::nn::Module>", "std::enable_shared_from_this<Module>"
                             ).cast().pointerTypes("Pointer"))

               .put(new Info("at::Tensor::toString", "at::DeprecatedTypeProperties::toString").javaText("public native @StdString String toString();"))
               .put(new Info("at::indexing::slicePrefix1sSize").javaText(
                       "@Namespace(\"at::indexing\") public static native @ByVal @Cast(\"c10::ArrayRef<int64_t>*\") LongArrayRef slicePrefix1sSize(@ByRef @Cast(\"c10::ArrayRef<int64_t>*\") LongArrayRef sizes);"))
               .put(new Info("torch::optim::AdamOptions::betas", "torch::optim::AdamWOptions::betas").javaText(
                       "public native @Cast(\"std::tuple<double,double>*\") @ByRef @NoException DoublePointer betas();"))
               .put(new Info("torch::optim::Adagrad::step", "torch::optim::Adam::step", "torch::optim::AdamW::step",
                             "torch::optim::LBFG::step", "torch::optim::RMSprop::step", "torch::optim::SGD::step").javaText(
                       "public native @ByVal Tensor step(@ByVal(nullValue = \"torch::optim::Optimizer::LossClosure(nullptr)\") LossClosure closure);\n"
                     + "public native @ByVal Tensor step();\n"))

               .put(new Info("c10::DeleterFnPtr").valueTypes("Deleter"))
               .put(new Info("std::function<void()>").pointerTypes("Func"))
               .put(new Info("std::function<void(void*)>").pointerTypes("Deleter"))
               .put(new Info("std::function<std::string(void)>").pointerTypes("Fetcher"))
               .put(new Info("std::function<void(const std::string&)>").pointerTypes("Logger"))
               .put(new Info("std::function<void(const c10::DDPLoggingData&)>").pointerTypes("DataLogger"))
               .put(new Info("std::function<bool(std::ostream&,const IValue&v)>").pointerTypes("CustomFormatter"))
               .put(new Info("std::function<bool(const IValue&)>").pointerTypes("IValueVisitor"))
               .put(new Info("std::function<size_t(uint64_tpos,void*buf,size_tnbytes)>").pointerTypes("ReadFunction"))
               .put(new Info("std::function<size_t(const void*,size_t)>").pointerTypes("WriteFunction"))
               .put(new Info("std::function<size_t(void)>").pointerTypes("SizeFunction"))
               .put(new Info("std::function<Tensor()>").pointerTypes("LossClosure"))
               .put(new Info("std::function<Tensor(const Tensor&,const Tensor&)>",
                             "torch::nn::TripletMarginWithDistanceLossOptions::distance_function_t",
                             "torch::nn::functional::TripletMarginWithDistanceLossFuncOptions::distance_function_t").pointerTypes("DistanceFunction"))
        ;
    }

    public static class Deleter extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Deleter(Pointer p) { super(p); }
        protected Deleter() { allocate(); }
        private native void allocate();
        public native void call(Pointer p);
    }

    public static class Func extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Func(Pointer p) { super(p); }
        protected Func() { allocate(); }
        private native void allocate();
        public native void call();
    }

    public static class Fetcher extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Fetcher(Pointer p) { super(p); }
        protected Fetcher() { allocate(); }
        private native void allocate();
        public native @StdString String call();
    }

    public static class Logger extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Logger(Pointer p) { super(p); }
        protected Logger() { allocate(); }
        private native void allocate();
        public native void call(@Cast({"", "const std::string&"}) @StdString String s);
    }

    public static class DataLogger extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    DataLogger(Pointer p) { super(p); }
        protected DataLogger() { allocate(); }
        private native void allocate();
        public native void call(@ByRef @Cast("const c10::DDPLoggingData*") Pointer d);
    }

    public static class CustomFormatter extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    CustomFormatter(Pointer p) { super(p); }
        protected CustomFormatter() { allocate(); }
        private native void allocate();
        public native boolean call(@ByRef @Cast("std::ostream*") Pointer o, @ByRef @Cast("const c10::IValue*") Pointer v);
    }

    public static class IValueVisitor extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    IValueVisitor(Pointer p) { super(p); }
        protected IValueVisitor() { allocate(); }
        private native void allocate();
        public native boolean call(@ByRef @Cast("const c10::IValue*") Pointer v);
    }

    public static class ReadFunction extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    ReadFunction(Pointer p) { super(p); }
        protected ReadFunction() { allocate(); }
        private native void allocate();
        public native @Cast("size_t") long call(@Cast("uint64_t") long pos, Pointer buf, @Cast("size_t") long nbytes);
    }

    public static class WriteFunction extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    WriteFunction(Pointer p) { super(p); }
        protected WriteFunction() { allocate(); }
        private native void allocate();
        public native @Cast("size_t") long call(@Const Pointer buf, @Cast("size_t") long nbytes);
    }

    public static class SizeFunction extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    SizeFunction(Pointer p) { super(p); }
        protected SizeFunction() { allocate(); }
        private native void allocate();
        public native @Cast("size_t") long call();
    }

    public static class LossClosure extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    LossClosure(Pointer p) { super(p); }
        protected LossClosure() { allocate(); }
        private native void allocate();
        public native @ByVal @Cast("at::Tensor*") Pointer call();
    }

    public static class DistanceFunction extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    DistanceFunction(Pointer p) { super(p); }
        protected DistanceFunction() { allocate(); }
        private native void allocate();
        public native @ByVal @Cast("at::Tensor*") Pointer call(@ByRef @Cast("const at::Tensor*") Pointer t1, @ByRef @Cast("const at::Tensor*") Pointer t2);
    }

    @Namespace("std") public static native @MemberGetter @ByRef @Cast("std::istream*") Pointer cin();
    @Namespace("std") public static native @MemberGetter @ByRef @Cast("std::ostream*") Pointer cout();
    @Namespace("std") public static native @MemberGetter @ByRef @Cast("std::ostream*") Pointer cerr();
    @Namespace("std") public static native @MemberGetter @ByRef @Cast("std::ostream*") Pointer clog();
}
