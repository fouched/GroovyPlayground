package oop

import java.util.concurrent.ConcurrentHashMap

class UssdHandler {
    private final String sessionId
    private ConcurrentHashMap<String, Person> sessionMap = new ConcurrentHashMap<>()

    UssdHandler(String sessionId) {
        this.sessionId = sessionId
    }

    void addSession(Person p) {
        sessionMap.put(sessionId, p)
    }


}
