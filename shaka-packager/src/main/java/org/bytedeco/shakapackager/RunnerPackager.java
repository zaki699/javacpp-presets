/*
 * Copyright (C) 2024 Zaki Ahmed
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

 package org.bytedeco.shakapackager;

 import org.bytedeco.javacpp.Loader;
 import org.bytedeco.javacpp.annotation.Platform;
 import org.bytedeco.javacpp.annotation.Properties;
 
 import org.bytedeco.shakapackager.presets.*;
 
 /**
  * Shaka Packager is a tool and a media packaging SDK for DASH and HLS packaging and encryption. It can transmux input media files from one container to another container.
  * https://shaka-project.github.io/shaka-packager/html/documentation.html:
  * Synopsys: packager <stream_descriptor> ... \
           [--dump_stream_info] \
           [--quiet] \
           [Chunking Options] \
           [MP4 Output Options] \
           [encryption / decryption options] \
           [DASH options] \
           [HLS options] \
           [Ads options]
  * <pre>{@code
  *     String packager = Loader.load(org.bytedeco.shakapackager.packager.class);
  *     ProcessBuilder pb = new ProcessBuilder(packager, "in=some_content.mp4,stream=video,out=video.mp4", "in=some_content.mp4,stream=audio,out=audio.mp4");
  *     pb.inheritIO().start().waitFor();
  * }</pre>
  *
  * @author Zaki Ahmed
  */
 @Properties(
     value = @Platform(executable = "packager")
 )
 public class RunnerPackager {
     static { Loader.load(); }
 }