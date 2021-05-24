public class SallaryPerYear {
    public static double CalculateSalaryPerWeek(int HoursPerWeek,
                                                double AmountPerHour,
                                                int WeeksPerYear,
                                                int VacationHours
    ) {
        double TotalVacationPayment = VacationHours * AmountPerHour;
        double AmountPerWeek = HoursPerWeek * AmountPerHour;
        double TotalAmountPerYear = AmountPerWeek * WeeksPerYear;
        double result = TotalAmountPerYear - TotalVacationPayment;
        return result;
    }

    ;

    public static void main(String[] args) {

        double AmountPerYear = CalculateSalaryPerWeek(40, 5, 48, 16);
        System.out.println("SalaryPerYear = " + AmountPerYear);
    }
}