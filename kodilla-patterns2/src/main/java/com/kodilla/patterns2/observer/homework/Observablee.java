package com.kodilla.patterns2.observer.homework;

public interface Observablee {
    void registerObserver(Observerr observer);
    void notifyObserver();
    void removeObserver(Observerr observerr);
}
