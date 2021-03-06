/**
 * Copyright 2017 Tilman Ginzel, AOE GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.aoe.gebspockreports.report

import com.aoe.gebspockreports.GebReportUtils

class GebArtifact {

    int number
    long timestamp
    String label
    String pageObject
    String url
    List<String> files

    GebArtifact() {
        files = new ArrayList<>()
    }

    def addFiles(List<File> newFiles) {
        newFiles.each { File file ->
            String path = GebReportUtils.removeReportDirFromPath(file.path)
            if (!(path in files)) {
                files.add(path)
            }
        }
    }
}
