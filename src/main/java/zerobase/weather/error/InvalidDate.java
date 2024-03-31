package zerobase.weather.error;
public class InvalidDate extends RuntimeException{
    private static final String MESSAGE="너무 과거/미래 날짜";
    public InvalidDate(){super(MESSAGE);}}