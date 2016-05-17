/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gradle.api.internal.artifacts.ivyservice.resolveengine.excludes;

import org.gradle.api.artifacts.ModuleIdentifier;
import org.gradle.internal.component.model.IvyArtifactName;

class ExcludeNone extends AbstractModuleExcludeRuleFilter {
    @Override
    public String toString() {
        return "{accept-all}";
    }

    @Override
    protected boolean doEquals(Object o) {
        return true;
    }

    @Override
    protected int doHashCode() {
        return 0;
    }

    public boolean acceptModule(ModuleIdentifier element) {
        return true;
    }

    @Override
    protected boolean acceptsAllModules() {
        return true;
    }

    public boolean acceptArtifact(ModuleIdentifier module, IvyArtifactName artifact) {
        return true;
    }

    @Override
    public boolean acceptsAllArtifacts() {
        return true;
    }
}
