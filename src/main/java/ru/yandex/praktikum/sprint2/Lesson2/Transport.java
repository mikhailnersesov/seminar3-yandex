package ru.yandex.praktikum.sprint2.Lesson2;

public interface Transport {
    // we do not initiate here the fields, while they will be static final here in Interface
    boolean isGround();
    // we do not initiate gerWheelsCount here, while we do not need it for the direct child Boat, therefore can leave it to the level of GroundTransport
    //int getWheelsCount();
}
