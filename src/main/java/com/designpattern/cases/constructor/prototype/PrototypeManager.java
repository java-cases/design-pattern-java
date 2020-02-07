package com.designpattern.cases.constructor.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeManager {
    /**
     * 用来记录原型的编号和原型实例的对应关系
     */
    private static Map<String, Prototype> map = new HashMap<String, Prototype>();

    private PrototypeManager() {
    }

    public synchronized static void setPrototype(String prototypeId, Prototype prototype) {
        map.put(prototypeId, prototype);
    }

    public synchronized static void removePrototype(String prototypeId) {
        map.remove(prototypeId);
    }

    public synchronized static Prototype getPrototype(String prototypeId) {
        Prototype prototype = map.get(prototypeId);
        return prototype;
    }
}
