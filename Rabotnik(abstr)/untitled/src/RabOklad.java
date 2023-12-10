class RabOklad extends Rabotnik{
    int days;
    int moneyByDay;
    RabOklad(int days, int moneyByDay){
        this.days = days;
        this.moneyByDay = moneyByDay;
    }

    @Override int salary(){
        return days * moneyByDay;
    }
    @Override void print(){
        System.out.println("Дней отработано: " + days + " " + "Оплата за день: " + moneyByDay);
    }

}
