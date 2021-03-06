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

package com.microsoft.windowsazure.management.mediaservices.models;

/**
* The Get Media Services Account operation response.
*/
public class MediaServicesAccount {
    private String accountKey;
    
    /**
    * Optional. The Key of the Media Services account.
    * @return The AccountKey value.
    */
    public String getAccountKey() {
        return this.accountKey;
    }
    
    /**
    * Optional. The Key of the Media Services account.
    * @param accountKeyValue The AccountKey value.
    */
    public void setAccountKey(final String accountKeyValue) {
        this.accountKey = accountKeyValue;
    }
    
    private String accountName;
    
    /**
    * Optional. The Name of the Media Services account.
    * @return The AccountName value.
    */
    public String getAccountName() {
        return this.accountName;
    }
    
    /**
    * Optional. The Name of the Media Services account.
    * @param accountNameValue The AccountName value.
    */
    public void setAccountName(final String accountNameValue) {
        this.accountName = accountNameValue;
    }
    
    private String accountRegion;
    
    /**
    * Optional. The Region of the  Media Services account.
    * @return The AccountRegion value.
    */
    public String getAccountRegion() {
        return this.accountRegion;
    }
    
    /**
    * Optional. The Region of the  Media Services account.
    * @param accountRegionValue The AccountRegion value.
    */
    public void setAccountRegion(final String accountRegionValue) {
        this.accountRegion = accountRegionValue;
    }
    
    private MediaServicesAccount.AccountKeys storageAccountKeys;
    
    /**
    * Optional. The Storage Account keys of the Media Services account.
    * @return The StorageAccountKeys value.
    */
    public MediaServicesAccount.AccountKeys getStorageAccountKeys() {
        return this.storageAccountKeys;
    }
    
    /**
    * Optional. The Storage Account keys of the Media Services account.
    * @param storageAccountKeysValue The StorageAccountKeys value.
    */
    public void setStorageAccountKeys(final MediaServicesAccount.AccountKeys storageAccountKeysValue) {
        this.storageAccountKeys = storageAccountKeysValue;
    }
    
    private String storageAccountName;
    
    /**
    * Optional. The Storage Account Name of the Media Services account.
    * @return The StorageAccountName value.
    */
    public String getStorageAccountName() {
        return this.storageAccountName;
    }
    
    /**
    * Optional. The Storage Account Name of the Media Services account.
    * @param storageAccountNameValue The StorageAccountName value.
    */
    public void setStorageAccountName(final String storageAccountNameValue) {
        this.storageAccountName = storageAccountNameValue;
    }
    
    /**
    * The key information associated with a Media Services Account.
    */
    public static class AccountKeys {
        private String primary;
        
        /**
        * Optional. The Primary key of the storage account associated with the
        * Media Services account.
        * @return The Primary value.
        */
        public String getPrimary() {
            return this.primary;
        }
        
        /**
        * Optional. The Primary key of the storage account associated with the
        * Media Services account.
        * @param primaryValue The Primary value.
        */
        public void setPrimary(final String primaryValue) {
            this.primary = primaryValue;
        }
        
        private String secondary;
        
        /**
        * Optional. The Secondary key of the sotrage account associated with
        * the Media Services account.
        * @return The Secondary value.
        */
        public String getSecondary() {
            return this.secondary;
        }
        
        /**
        * Optional. The Secondary key of the sotrage account associated with
        * the Media Services account.
        * @param secondaryValue The Secondary value.
        */
        public void setSecondary(final String secondaryValue) {
            this.secondary = secondaryValue;
        }
    }
}
