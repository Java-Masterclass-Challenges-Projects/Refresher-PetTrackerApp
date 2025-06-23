# 🐾 Pet Tracker Console App

An interactive Java console application for tracking pets, practicing object-oriented programming, `ArrayList` manipulation, and user-driven logic through console input. This challenge was created as a hands-on way to reinforce Java fundamentals like classes, objects, arrays, user input, control flow, and searching.

---

## 🧠 Challenge Goal

The purpose of this challenge was to build a functional **Pet Tracker** application that allows users to:

1. Add new pets (name and weight)  
2. Remove pets by name  
3. List all pets in the tracker  
4. Identify the lightest pet  

The challenge was also an opportunity to:
- Practice using `ArrayList` and object comparison
- Work with loops, conditions, and `Scanner` input
- Override `.equals()` and `.toString()` in a custom class

---

## 🔎 Key Features & Learning Points

### ✅ Pet Class
- Custom `Pet` class with `name` and `weight`
- Encapsulated fields and proper getters
- `.equals()` overridden to prevent duplicates by name
- `.toString()` overridden for clean output formatting

### ✅ PetTracker Class
- Holds the main logic and data using an `ArrayList<Pet>`
- Methods for adding, removing, listing, and finding the lightest pet
- A loop-driven menu system in the `main()` method for interaction

### ✅ Console Menu
- Loops until user quits
- Supports:
  - Adding new pets
  - Removing existing ones
  - Viewing the entire list
  - Finding and displaying the lightest pet

---

## 📆 Sample Menu
