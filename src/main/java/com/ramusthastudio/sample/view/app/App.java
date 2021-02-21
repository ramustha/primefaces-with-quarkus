/*
 * Copyright 2009-2021 PrimeTek.
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
package com.ramusthastudio.sample.view.app;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class App implements Serializable {
    private String theme = "saga";
    private boolean darkMode = false;
    private String inputStyle = "outlined";

    public String getTheme() {
        return theme;
    }

    public boolean isDarkMode() {
        return darkMode;
    }

    public void setDarkMode(boolean darkMode) {
        this.darkMode = darkMode;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getInputStyle() {
        return inputStyle;
    }

    public void setInputStyle(String inputStyle) {
        this.inputStyle = inputStyle;
    }

    public String getInputStyleClass() {
        return this.inputStyle.equals("filled") ? "ui-input-filled" : "";
    }

    public void changeTheme(String theme, boolean darkMode) {
        this.theme = theme;
        this.darkMode = darkMode;
    }
    
    public String getThemeImage() {
    	String result = getTheme();
    	switch (result) {
		case "nova-light":
			result = "nova";
			break;
		case "nova-colored":
			result = "nova-accent";
			break;
		case "nova-dark":
			result = "nova-alt";
			break;
		default:
			break;
		}
    	return result + ".png";
    }
}
