/*
 * Copyright (C) 2016 RoboVM AB
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
package org.robovm.pods.dialog;

abstract class DialogBuilder<T extends DialogBuilder<T, R>, R extends Dialog> {
    String title;
    String message;

    DialogBuilder() {}

    DialogBuilder(String title, String message) {
        this.title = title;
        this.message = message;
    }

    @SuppressWarnings("unchecked")
    public T setTitle(String title) {
        this.title = title;
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    public T setMessage(String message) {
        this.message = message;
        return (T) this;
    }

    public abstract R build();

    public R show() {
        R dialog = build();
        dialog.show();
        return dialog;
    }
}
