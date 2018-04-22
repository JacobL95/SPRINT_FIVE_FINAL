package Utility;

import android.util.Log;

import com.example.jacob.weatherornot.R;

import java.text.DecimalFormat;

public class DISPLAY_Utility {

    int Icon, PreMadeInt;
    private String Description;


    public void setIcon(int icon) {
        this.Icon = icon;
    }

    public int getIcon() {
        return this.Icon;
    }

    public int applyIcon(String iconinfo) {

        if (iconinfo.equals("Rain")) {
           Icon = R.drawable.rain;
        }
        if (iconinfo.equals("Snow")) {
            Icon = R.drawable.snow;
        }
        if (iconinfo.equals("Mist")) {
            Icon = R.drawable.mist;
        }
        if (iconinfo.equals("Clear")) {
            Icon = R.drawable.clear_sky;
        }
        if (iconinfo.equals("Clouds")) {
            Icon = R.drawable.partly_cloudy;
        }
        return Icon;
    }

    public String formatDescription(String DisplayFormat) {

        if (DisplayFormat.equals("clear sky")) {
            Description = "Clear Skys";
        }
        if (DisplayFormat.equals("rain and drizzle")) {
            Description = "Rain and Drizzle";
        }
        if (DisplayFormat.equals("haze")) {
            Description = "Haze";
        }
        if (DisplayFormat.equals("light rain and snow")) {
            Description = "Light Rain and Snow";
        }
        if (DisplayFormat.equals("scattered clouds")) {
            Description = "Scattered Clouds";
        }
        if (DisplayFormat.equals("overcast clouds")) {
            Description = "Overcast Clouds";
        }
        if (DisplayFormat.equals("broken clouds")) {
            Description = "Broken Clouds";
        }
        if (DisplayFormat.equals("moderate rain")) {
            Description = "Moderate Rain";
        }
        if (DisplayFormat.equals("light rain")) {
            Description = "Light Rain";
        }
        if (DisplayFormat.equals("few clouds")) {
            Description = "Few Clouds";
        }
        if (DisplayFormat.equals("mist")) {
            Description = "Mist";
        }
        if (DisplayFormat.equals("light snow")) {
            Description = "Light Snow";
        }
        if (DisplayFormat.equals("snow")) {
            Description = "Snow";
        }
        if (DisplayFormat.equals("heavy snow")) {
            Description = "Heavy Snow";
        }
        return Description;
    }

    public int ICON_CORRECTION_CHECK(String DisplayFormat, int CurrentIcon){
        if (DisplayFormat.equals("haze")) {
            CurrentIcon = R.drawable.mist;
        }
        if (DisplayFormat.equals("scattered clouds")) {
            CurrentIcon = R.drawable.partly_cloudy;
        }
        if (DisplayFormat.equals("overcast clouds")) {
            CurrentIcon = R.drawable.partly_cloudy;
        }
        if (DisplayFormat.equals("broken clouds")) {
            CurrentIcon = R.drawable.partly_cloudy;
        }
        if (DisplayFormat.equals("few clouds")) {
            CurrentIcon = R.drawable.partly_cloudy;
        }
        return CurrentIcon;
    }

    public String KELVIN_TO_FAHRENHEIT (double KelvinTemp){
        double Temp = ((KelvinTemp * 1.8) - 459.67);
        DecimalFormat decimalFormat = new DecimalFormat("#");
        String NewTemp = decimalFormat.format(Temp);
        return NewTemp;
    }

    public int KELVIN_TO_FAHRENHEIT_INTEGER (double KelvinTemp){
        double Temp = ((KelvinTemp * 1.8) - 459.67);
        int NewTemp = (int) Temp;
        return NewTemp;
    }

    public String FloatToString(float number){
        PreMadeInt = (int)number;
        String NewNumber = String.valueOf(PreMadeInt);
        return NewNumber;
    }

    public int FloatToInteger(float number){
        PreMadeInt = (int)number;
        return PreMadeInt;
    }

    public String date_modifier(String a){
        return ChangeDate(a);
    }

    private String ChangeDate (String a){

        String Year = a.substring(0,4);
        String Month = a.substring(5,7);
        String Date = a.substring(8,10);

        String newdate = new String(Date_Number_to_Name(Month) + ", " + Date + ", " + Year);
        return newdate;
    }

    private String Date_Number_to_Name (String b){

        if (b.equals("01")){
            b = "January";
        }
        if (b.equals("02")){
            b = "February";
        }
        if (b.equals("03")){
            b = "March";
        }
        if (b.equals("04")){
            b = "April";
        }
        if (b.equals("05")){
            b = "May";
        }
        if (b.equals("06")){
            b = "June";
        }
        if (b.equals("07")){
            b = "July";
        }
        if (b.equals("08")){
            b = "August";
        }
        if (b.equals("09")){
            b = "September";
        }
        if (b.equals("10")){
            b = "October";
        }
        if (b.equals("11")){
            b = "November";
        }
        if (b.equals("12")){
            b = "December";
        }
        return b;
    }
}
