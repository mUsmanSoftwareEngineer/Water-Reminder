package com.waterdiary.drinkreminder.utils;

import android.media.Ringtone;

import java.text.DecimalFormat;

public class URLFactory
{
    public static String PRIVACY_POLICY_ULR = "https://privacy-policy.html";

    public static String APP_SHARE_URL = "https://share.html";

    public static String DATE_FORMAT="dd-MM-yyyy";

    public static float DAILY_WATER_VALUE=0;
    public static String WATER_UNIT_VALUE="ML";

    // Preferences
    public static String DAILY_WATER="daily_water";
    public static String WATER_UNIT="water_unit";

    public static String SELECTED_CONTAINER="selected_container";

    public static String HIDE_WELCOME_SCREEN="hide_welcome_screen";



    //========

    public static String USER_NAME="user_name";
    public static String USER_GENDER="user_gender";
    public static String USER_PHOTO="user_photo";

    public static String PERSON_HEIGHT="person_height";
    public static String PERSON_HEIGHT_UNIT="person_height_unit";

    public static String PERSON_WEIGHT="person_weight";
    public static String PERSON_WEIGHT_UNIT="person_weight_unit";


    public static String SET_MANUALLY_GOAL="set_manually_goal";
    public static String SET_MANUALLY_GOAL_VALUE="set_manually_goal_value";


    public static String WAKE_UP_TIME="wakeup_time";
    public static String WAKE_UP_TIME_HOUR="wakeup_time_hour";
    public static String WAKE_UP_TIME_MINUTE="wakeup_time_minute";

    public static String BED_TIME="bed_time";
    public static String BED_TIME_HOUR="bed_time_hour";
    public static String BED_TIME_MINUTE="bed_time_minute";

    public static String INTERVAL="interval";

    public static String REMINDER_OPTION="reminder_option"; // o for auto, 1 for off, 2 for silent
    public static String REMINDER_VIBRATE="reminder_vibrate";
    public static String REMINDER_SOUND="reminder_sound";

    public static String DISABLE_NOTIFICATION="disable_notification";
    public static String IS_MANUAL_REMINDER="manual_reminder_active";

    public static String DISABLE_SOUND_WHEN_ADD_WATER="disable_sound_when_add_water";

    public static String IGNORE_NEXT_STEP="ignore_next_step";


    // precision
    public static DecimalFormat decimalFormat = new DecimalFormat("#0.00");
    public static DecimalFormat decimalFormat2 = new DecimalFormat("#0.0");


    public static Ringtone notification_ringtone;


    public static boolean RELOAD_DASHBOARD=true;

    public static boolean LOAD_VIDEO_ADS=false;

    public static String APP_DIRECTORY_NAME="Water Diary";
    public static String APP_PROFILE_DIRECTORY_NAME="profile";

    public static String AUTO_BACK_UP="auto_backup";
    public static String AUTO_BACK_UP_TYPE="auto_backup_type";
    public static String AUTO_BACK_UP_ID="auto_backup_id";

    public static String IS_ACTIVE="is_active";
    public static String IS_PREGNANT="is_pregnant";
    public static String IS_BREATFEEDING="is_breastfeeding";

    public static String WEATHER_CONSITIONS="weather_conditions";

    public static double MALE_WATER=35.71;
    public static double ACTIVE_MALE_WATER=50;
    public static double DEACTIVE_MALE_WATER=14.29;

    public static double FEMALE_WATER=28.57;
    public static double ACTIVE_FEMALE_WATER=40;
    public static double DEACTIVE_FEMALE_WATER=11.43;

    public static double PREGNANT_WATER=700;
    public static double BREASTFEEDING_WATER=700;

    public static double WEATHER_SUNNY=1;
    public static double WEATHER_CLOUDY=0.85;
    public static double WEATHER_RAINY=0.68;
    public static double WEATHER_SNOW=0.88;
}