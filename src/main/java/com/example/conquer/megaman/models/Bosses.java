package com.example.conquer.megaman.models;

import org.springframework.data.annotation.Id;
import org.bson.types.ObjectId;

public class Bosses {
    @Id
    public ObjectId _id;
    public String name;
    public String weapon;
    public String strength;

    public Bosses() {}
    public Bosses(ObjectId _id, String name, String weapon, String strength) {
        this._id = _id;
        this.name = name;
        this.weapon = weapon;
        this.strength = strength;
    }

    public String get_id() {
        return _id.toHexString();
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }
}

