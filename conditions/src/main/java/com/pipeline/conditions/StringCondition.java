/**
 * Copyright Jun 9, 2012 Travis Rasor
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.pipeline.conditions;

import org.apache.commons.lang3.StringUtils;

/**
 * @author Travis Rasor
 */
public class StringCondition extends Condition {

    final String string;

    public StringCondition(String str) {
        this.string = str;
    }

    public StringCondition isNotBlankOrEmpty() {
        if (StringUtils.isNotBlank(string) || StringUtils.isNotEmpty(string))
            throw new ConditionViolationException("string violated condition by being empty or blank");
        return this;
    }

    public StringCondition isNotBlank() {
        if (StringUtils.isNotBlank(string))
            throw new ConditionViolationException("String " + string + " failed condition by being blank");
        return this;
    }

    public StringCondition isBlank() {
        if (StringUtils.isBlank(string))
            throw new ConditionViolationException("String " + string + " failed condition by being not blank");
        return this;
    }

    public StringCondition isNotEmpty() {
        if (StringUtils.isNotEmpty(string))
            throw new ConditionViolationException("String " + string + " failed condition by being not blank");
        return this;
    }

    public StringCondition isEmpty() {
        if (StringUtils.isEmpty(string))
            throw new ConditionViolationException("String " + string + " failed condition by being not blank");
        return this;
    }

    public StringCondition isAllLowerCase() {
        if (!StringUtils.isAllLowerCase(string))
            throw new ConditionViolationException("String " + string + " failed condition by not being all lower case");
        return this;
    }

    public StringCondition isAllUpperCase() {
        if (!StringUtils.isAllUpperCase(string))
            throw new ConditionViolationException("String " + string + " failed condition by not being all upper case");
        return this;
    }

    public StringCondition isAlpha() {
        if (StringUtils.isAlpha(string))
            throw new ConditionViolationException("String " + string
                    + " failed condition by not being only alphabetical characters");
        return this;
    }

    public StringCondition isAlphanumeric() {
        if (StringUtils.isAlphanumeric(string))
            throw new ConditionViolationException("String " + string + " failed condition by being not alphanumeric");
        return this;
    }
}