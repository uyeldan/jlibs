/**
 * Copyright 2015 Santhosh Kumar Tekuri
 *
 * The JLibs authors license this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package jlibs.xml.sax.dog.path.tests;

import jlibs.xml.sax.dog.path.Constraint;
import jlibs.xml.sax.dog.sniff.Event;

/**
 * @author Santhosh Kumar T
 */
public final class Node extends Constraint{
    public static final Node INSTANCE = new Node();

    private Node(){
        super(ID_NODE);
    }

    @Override
    public boolean matches(Event event){
        return true;
    }

    @Override
    public String toString(){
        return "node()";
    }
}