
---

# 🕰️ Calendar/Clock Mod

[![Minecraft Version](https://img.shields.io/badge/Minecraft-1.8.8%2B-blue)](https://www.minecraft.net/)
[![Fabric](https://img.shields.io/badge/Fabric-Compatible-green)](https://fabricmc.net/)

**Calendar/Clock** is a lightweight Minecraft mod that adds an in-game **day counter, digital clock, and calendar system**. Perfect for SMP servers, long-term survival worlds, or roleplay servers, allowing players to track in-game time, special events, and milestones without any textures.

---

## ✨ Features

* **Day Counter** – Displays how many in-game days have passed since world creation.
* **Clock Overlay** – Right-click a normal clock to see digital time (HH\:MM) and current day.
* **Calendar System** – Virtual calendar with configurable months and special events.
* **Event Notifications** – Pop-ups or messages when reaching milestones or special days.
* **Admin Commands** – Control the calendar and events:

  * `/setday <number>` → Change the current day.
  * `/addevent <day> <message>` → Schedule custom events.
  * `/today` → Display the current calendar date and time.
* **Lightweight & Vanilla-Friendly** – Works without texture packs, minimal impact on performance.

---

## ⚡ Commands

### Player Commands

| Command  | Description                                             |
| -------- | ------------------------------------------------------- |
| `/today` | Shows the current in-game day, time, and calendar date. |

### Admin Commands

| Command                     | Description                           |
| --------------------------- | ------------------------------------- |
| `/setday <number>`          | Set the current day of the world.     |
| `/addevent <day> <message>` | Add a custom event to a specific day. |
| `/events`                   | List upcoming events.                 |

---

## ⚙️ Configuration

Example `config.yml`:

```yaml
calendar:
  days_per_month: 30
  months:
    - Spring
    - Summer
    - Autumn
    - Winter

events:
  100: "Server Milestone: Day 100!"
  150: "Double XP Weekend"
  365: "Server Anniversary Event"
messages:
  event_announcement: "&aEvent Today: %message%"
  day_count: "&eDay %day% | %time%"
```

---

## 🛠️ Project Structure

```
CalendarClock/
 ├── build.gradle
 ├── settings.gradle
 ├── src/main/java/com/dammnranaah/calendarclock/
 │   ├── CalendarClockMod.java
 │   ├── commands/
 │   │   └── CalendarCommand.java
 │   ├── managers/
 │   │   ├── DayManager.java
 │   │   └── EventManager.java
 │   └── utils/
 │       └── TimeUtils.java
 └── src/main/resources/
     ├── fabric.mod.json
     └── config.yml
```

---

## 📌 Why Use Calendar/Clock?

* Adds **immersion** by tracking the passage of time.
* Great for **SMP servers, hardcore survival, or roleplay worlds**.
* Enables **custom events and milestones** easily.
* Lightweight, no additional textures or heavy dependencies.

---

## 📄 License

MIT License © dammnranaah

---

If you want, I can also make a **ready-to-use AI prompt** for generating this Calendar/Clock mod with commands, day manager, and event system skeleton. Do you want me to do that?
