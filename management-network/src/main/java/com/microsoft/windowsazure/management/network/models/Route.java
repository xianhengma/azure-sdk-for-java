/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.network.models;

public class Route {
    private String addressPrefix;
    
    /**
    * Optional.
    * @return The AddressPrefix value.
    */
    public String getAddressPrefix() {
        return this.addressPrefix;
    }
    
    /**
    * Optional.
    * @param addressPrefixValue The AddressPrefix value.
    */
    public void setAddressPrefix(final String addressPrefixValue) {
        this.addressPrefix = addressPrefixValue;
    }
    
    private int metric;
    
    /**
    * Optional.
    * @return The Metric value.
    */
    public int getMetric() {
        return this.metric;
    }
    
    /**
    * Optional.
    * @param metricValue The Metric value.
    */
    public void setMetric(final int metricValue) {
        this.metric = metricValue;
    }
    
    private String name;
    
    /**
    * Optional.
    * @return The Name value.
    */
    public String getName() {
        return this.name;
    }
    
    /**
    * Optional.
    * @param nameValue The Name value.
    */
    public void setName(final String nameValue) {
        this.name = nameValue;
    }
    
    private NextHop nextHop;
    
    /**
    * Optional.
    * @return The NextHop value.
    */
    public NextHop getNextHop() {
        return this.nextHop;
    }
    
    /**
    * Optional.
    * @param nextHopValue The NextHop value.
    */
    public void setNextHop(final NextHop nextHopValue) {
        this.nextHop = nextHopValue;
    }
    
    private RouteState state;
    
    /**
    * Optional.
    * @return The State value.
    */
    public RouteState getState() {
        return this.state;
    }
    
    /**
    * Optional.
    * @param stateValue The State value.
    */
    public void setState(final RouteState stateValue) {
        this.state = stateValue;
    }
}
