package com.vmware.vim25;

/**
 * Created by Michael Rice on Thu May 21 01:07:54 CDT 2015
 *
 * Copyright 2015 Michael Rice
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * @since 6.0
 */

public class CannotComputeFTCompatibleHosts extends VmFaultToleranceIssue {
    public ManagedObjectReference vm;

    public String vmName;

    public ManagedObjectReference getVm() {
        return vm;
    }

    public void setVm(ManagedObjectReference vm) {
        this.vm = vm;
    }

    public String getVmName() {
        return vmName;
    }

    public void setVmName(String vmName) {
        this.vmName = vmName;
    }

}