/*
 * Copyright 2017 Tran Le Duy
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.duy.calculator.evaluator.exceptions;

/**
 * Error when handling large numbers or small numers
 * <p>
 * Created by Duy on 24-Jan-17.
 */
public class TooBigNumberException extends Exception {

    /**
     * Constructor
     * @param isTooBig - is value too big
     */
    public TooBigNumberException(boolean isTooBig) {
        super(isTooBig ? "Number too big" : "Number to small");
    }

}
