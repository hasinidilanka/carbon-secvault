/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *   * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */
package org.wso2.securevault;

import org.apache.commons.logging.Log;

/**
 * Common exception for all  within secure vault module - TODO create fine grain exceptions
 */
public class SecureVaultException extends RuntimeException {

    private static final long serialVersionUID = -7361599095528938812L;

    public SecureVaultException(String string) {
        super(string);
    }

    public SecureVaultException(String msg, Throwable e) {
        super(msg, e);
    }

    public SecureVaultException(Throwable t) {
        super(t);
    }

    public SecureVaultException(String msg, Log synLog) {
        super(msg);
        synLog.error(msg);
    }

    public SecureVaultException(String msg, Throwable cause, Log synLog) {
        super(msg, cause);
        synLog.error(msg, cause);
    }
}