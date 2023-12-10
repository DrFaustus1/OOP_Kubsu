class RabHour extends Rabotnik {
    int hours;
    int MoneyPerHour;
    int days;
    RabHour(int hours, int MoneyPerHour, int days){
        this.hours = hours;
        this.MoneyPerHour = MoneyPerHour;
        this.days = days;
    }
    @Override int salary(){
        return hours * MoneyPerHour *days;
    }
    @Override void print(){
        System.out.println("Часов отработано: "+ hours + " " + "Дней отработано" + days + " " + "Оплата за час: " + MoneyPerHour);

    }
}
