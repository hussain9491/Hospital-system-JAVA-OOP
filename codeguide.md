# Code Guide — OOP Concepts (Short)

Where each OOP concept is used in this project.

---

## 1. Abstraction

**File:** `src/Staff.java`

- `abstract class Staff` — cannot create `new Staff()`
- `abstract void handleTreatment(String patientName)` — no body; subclasses must implement

---

## 2. Encapsulation

**Files:** `Patient`, `Staff`, `Doctor`, `Nurse`, `Treatment`, `Appointment`, `Hospital`

- All important fields are **private**
- Access via **getters/setters** (e.g. `getName()`, `setAssignedDoctorId()`)
- Example: `Hospital` uses `pat.getName()` not direct field access

---

## 3. Inheritance

**Files:** `Doctor.java`, `Nurse.java` → extend `Staff.java`

```
Staff (abstract)
 ├── Doctor  (+ specialization)
 └── Nurse   (+ shift)
```

- `extends Staff` and `super(id, name, department)` in constructors

---

## 4. Polymorphism

**Files:** `Doctor.java`, `Nurse.java`, `Hospital.java`

Same method, different behavior:

| Class  | Method              | Output                         |
|--------|---------------------|--------------------------------|
| Doctor | `handleTreatment()` | "Doctor ... is treating..."    |
| Nurse  | `handleTreatment()` | "Nurse ... is assisting..."    |

**Called from:**
- Menu **3** → `Hospital.assignDoctorToPatient()` → doctor version
- Menu **8** → `Hospital.nurseAssist()` → nurse version

---

## Quick Table

| Concept        | Where                          |
|----------------|--------------------------------|
| Abstraction    | `Staff.java` (abstract class)  |
| Encapsulation  | All classes (private + getters)|
| Inheritance    | `Doctor`, `Nurse` extend `Staff`|
| Polymorphism   | `handleTreatment()` override   |

---

## Collections

**File:** `Hospital.java`

- **ArrayList** — store patients, doctors, nurses, treatments, appointments
- **HashMap** — find patient/doctor/treatment by ID quickly

---

## Demo in Program

1. Menu **1** — Add patient (encapsulation)
2. Menu **3** — Assign doctor (polymorphism — doctor)
3. Menu **8** — Nurse assist (polymorphism — nurse)
4. Explain `Staff` is abstract — cannot instantiate (abstraction)
