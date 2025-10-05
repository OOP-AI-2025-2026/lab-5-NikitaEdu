package main.java.ua.opnu;

public class TimeSpan {

    private int hours;
    private int minutes;

    public TimeSpan() {
        this.hours = 0;
        this.minutes = 0;
    }

    public TimeSpan(int minutes) {
        if (minutes < 0) {
            throw new IllegalArgumentException("Хвилини повинні бути >= 0.");
        } else {
            this.hours = minutes / 60;
            this.minutes = minutes % 60;
        }
    }

    public TimeSpan(int hours, int minutes) {
        if (hours < 0 || minutes < 0 || minutes >= 60) {
            throw new IllegalArgumentException("Неправильний формат часу: години >= 0, хвилини від 0 до 59.");
        } else {
            this.hours = hours;
            this.minutes = minutes;
        }
    }

    public TimeSpan(TimeSpan timeSpan) {
        this.hours = timeSpan.hours;
        this.minutes = timeSpan.minutes;
    }

    public void add(int hours, int minutes) {
        if (hours < 0 || minutes < 0 || minutes >= 60) {
            throw new IllegalArgumentException("Неправильний формат часу: години >= 0, хвилини від 0 до 59.");
        } else {
            this.hours += hours;
            this.minutes += minutes;
            normalizeTime();
        }
    }

    public void add(int minutes) {
        if (minutes < 0) {
            throw new IllegalArgumentException("Хвилини повинні бути >= 0.");
        } else {
            this.hours += minutes / 60;
            this.minutes += minutes % 60;
            normalizeTime();
        }
    }

    public void add(TimeSpan timeSpan) {
        this.hours += timeSpan.hours;
        this.minutes += timeSpan.minutes;
        normalizeTime();
    }

    public void subtract(int hours, int minutes) {
        int totalMinutesThis = this.hours * 60 + this.minutes;
        int totalMinutesOther = hours * 60 + minutes;

        if (totalMinutesOther > totalMinutesThis) {
            throw new IllegalArgumentException("Вхідний інтервал більший за поточний.");
        }

        int remainingMinutes = totalMinutesThis - totalMinutesOther;
        this.hours = remainingMinutes / 60;
        this.minutes = remainingMinutes % 60;
    }

    public void subtract(int minutes) {
        int totalMinutesThis = this.hours * 60 + this.minutes;

        if (minutes > totalMinutesThis) {
            throw new IllegalArgumentException("Вхідний інтервал більший за поточний.");
        }

        int remainingMinutes = totalMinutesThis - minutes;
        this.hours = remainingMinutes / 60;
        this.minutes = remainingMinutes % 60;
    }

    public void subtract(TimeSpan timeSpan) {
        int totalMinutesThis = this.hours * 60 + this.minutes;
        int totalMinutesOther = timeSpan.hours * 60 + timeSpan.minutes;

        if (totalMinutesOther > totalMinutesThis) {
            throw new IllegalArgumentException("Вхідний інтервал більший за поточний.");
        }

        int remainingMinutes = totalMinutesThis - totalMinutesOther;
        this.hours = remainingMinutes / 60;
        this.minutes = remainingMinutes % 60;
    }

    private void normalizeTime() {
        if (minutes >= 60) {
            hours += minutes / 60;
            minutes = minutes % 60;
        }
    }

    // Геттери
    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    // Отримати загальну кількість годин
    public double getTotalHours() {
        return hours + (double) minutes / 60;
    }

    // Отримати загальну кількість хвилин
    public int getTotalMinutes() {
        return hours * 60 + minutes;
    }
}