/*
 Copyright 2020 the original author(s)

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
 */
package br.ufrrj.labweb.campussocial;

import org.springframework.data.elasticsearch.core.geo.GeoPoint;

/**
 * @author P.J. Meisch (pj.meisch@sothawo.com)
 */

public class ResultData {
    private String title;
    private String text;
    private GeoPoint location;

    public ResultData(String title, String text, GeoPoint location) {
        this.title = title;
        this.text = text;
        this.location = location;
    }

    public ResultData(String title, GeoPoint location) {
        this.title = title;
        this.location = location;
    }

    public ResultData(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public GeoPoint getLocation() {
        return location;
    }

    public void setLocation(GeoPoint location) {
        this.location = location;
    }

}
