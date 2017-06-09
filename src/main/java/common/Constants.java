package common;

public interface Constants {
    public static String RESOURCES_FOLDER = "resources";
    public static String IMPORTUSER_FOLDER = "importuser";
    public static String DOWNLOADS_FOLDER = "downloads";
    public static String TESTDATA_FOLDER = "testdata";
    public static String IMAGES_FOLDER = "images";
    public static String LMSEXAMMODULE_FOLDER = "LMSExamModule";
    public static String TRAINING_IMAGES_FOLDER = "LMSTrainingModule";
    public static String PROJECT_IMAGES_FOLDER = "LMSProjectModule";
    public static String LMSSAMPATHMODULE_FOLDER = "LMSSAMPathModule";
    public static String LMSRESULTSPAGEMODULE_FOLDER = "LMSResultsPageModule";
    public static String LMSSECTIONMODULE_FOLDER = "LMSSectionModule";
    public static String LMSSTUDYCENTERMODULE_FOLDER = "LMSStudyCenterModule";
    public static String LMSKEYBOARDMODULE_FOLDER = "LMSKeyboardModule";
    public static String DROPBOX_FOLDER = "DropBox";
    public static String DRIVERS_FOLDER = "drivers";
    public static String CONFIG_FOLDER = "config";
    public static String EXECUTION_CONFIG_FILE = "execution-config.yml";
    public static String SAUCE_CONFIG_FILE = "sauce-config.yml";
    public static String DEFAULT_TESTDATA_FILE = "testdata.yml";
    public static String ENVIRONMENT = "ENVIRONMENT";
    public static String DEFAULT_ENVIRONMENT = "QA2";
    public static String BROWSER = "BROWSER";
    public static String FIREFOX = "firefox";
    public static String CHROME = "chrome";
    public static String GOOGLE_CHROME = "googlechrome";
    public static String INTERNET_EXPLORER = "internet explorer";
    public static String IE = "ie";
    public static String SAMSUNGS4 = "samsungs4";
    public static String SAMSUNGTAB = "samsungtab";
    public static String IPHONE5 = "iphone5";
    public static String IPHONE6 = "iphone6";
    public static String IPAD2 = "iPad2";
    public static String EXECUTION_MODE = "MODE";
    public static String MODE_LOCAL = "local";
    public static String MODE_REMOTE = "remote";
    public static String MODE_SAUCE = "sauce";
    public static String REMOTE_IP = "IP";
    public static String REMOTE_PORT = "PORT";
    public static String DEFAULT_REMOTE_IP = "localhost";
    public static String DEFAULT_REMOTE_PORT = "4444";
    public static String CHROME_WINDOWS_DRIVER = "chromedriver_win.exe";
    public static String CHROME_MAC_DRIVER = "chromedriver_mac";
    public static String CHROME_LINUX32_DRIVER = "chromedriver_linux_32";
    public static String CHROME_LINUX64_DRIVER = "chromedriver_linux_64";
    public static String IE_32_DRIVER = "IEDriverServer_win32.exe";
    public static String IE_64_DRIVER = "IEDriverServer_win64.exe";
    public static String WINIUM_DRIVER = "Winium.Desktop.Driver.exe";
    public static String PAGELOAD_WAIT_TIME = "PAGELOAD_WAIT_TIME";
    public static String SCRIPT_WAIT_TIME = "SCRIPT_WAIT_TIME";
    public static String OBJECT_WAIT_TIME = "OBJECT_WAIT_TIME";
    public static String ALERT_WAIT_TIME = "ALERT_WAIT_TIME";
    public static String FLUENT_WAIT_FLAG = "FLUENT_WAIT_FLAG";
    public static String FLUENT_WAIT_POLLING_SECONDS = "FLUENT_WAIT_POLLING_SECONDS";
    public static String MAILNATOR = "@mailnator.com";
    public static String WAIT_TIME1 = "WAIT_TIME1";
    public static String WAIT_TIME2 = "WAIT_TIME2";
    public static String WAIT_TIME3 = "WAIT_TIME3";
    public static String WAIT_TIME4 = "WAIT_TIME4";
    public static String WAIT_TIME5 = "WAIT_TIME5";
    public static String WAIT_TIME6 = "WAIT_TIME6";
    public static String WAIT_FOR_SECOND = "WAIT_FOR_SECOND";
    public static String WAIT_UNIT = "WAIT_UNIT";
    public static String LMSTRAININGMODULE_FOLDER = "LMSTrainingModule";
    public static String IMPORT_FILENAME = "import.csv";
    public static String IMPORT_STUDENT1_USERNAME = "&STUDENTS.IMPORTSTUDENT.STUDENTUSERNAME1&";
    public static String IMPORT_STUDENT2_USERNAME = "DP:STUDENTS.IMPORTSTUDENT.STUDENTUSERNAME2";
    public static String IMPORT_STUDENT1_FIRSTNAME = "student1";
    public static String IMPORT_STUDENT2_FIRSTNAME = "student2";
    public static String IMPORT_STUDENT1_LASTNAME = "import";
    public static String IMPORT_STUDENT2_LASTNAME = "import";
    public static String IMPORT_STUDENT1_PASSWORD = "&PASSWORD&";
    public static String IMPORT_STUDENT2_PASSWORD = "DP:STUDENTS.IMPORTSTUDENT.STUDENTPASSWORD2";
    public static String KEYCODE_URL = "http://samadmin.private.course.com/SAMQAKeycodes/";
    public static String CHROME_LOG = "chromedriver.log";
    public static String STATIC_NAME = "STATIC_NAME";
    public static String MS_OFFICE_VERSION = "MS_OFFICE_VERSION";
    public static String OPERATING_SYSTEM = "OPERATING_SYSTEM";
    public static String LMSNEWLOGINPAGEMODULE_FOLDER = "LMSNewUserLoginPage";
    public static String strGreyBorder = "rgb(152, 152, 152) 0px 0px 0px 2px";
    public static String DEFAULTGREYBGCOLOR = "rgba(238, 238, 238, 1)";
    public static String DEFAULTBLUETEXTCOLOR = "rgba(7, 66, 106, 1)";
    public static String DEFAULTBLUEBGCOLOR = "rgba(88, 188, 235, 1)";
    public static String STRDATEFORMAT = "MM/dd/yyyy";
    public static String DODGERBLUEBGCOLOR = "rgba(7, 66, 106, 1)";
    public static String ADD_TIMEPERIOD_COLOR = "rgba(0, 118, 177, 1)";
    public static String WHITETEXTCOLOR = "rgba(255, 255, 255, 1)";
    public static String BLACKBGCOLOR = "rgb(34, 34, 34) 0px 0px 0px 1px inset";
    public static String DARKBLUEBGCOLOR = "rgba(0, 98, 147, 1)";
    public static int INT255 = 255;
    public static int INT5000 = 5000;
    public static int INT18 = 18;
    public static int INT50 = 50;
    public static String KEYBOARDING = "Keyboarding";
    public static String QA4_TESTDATA_FILE = "qa4_testdata.yml";
    public static String QA4_ENVIRONMENT = "QA4";
    public static String QA3_TESTDATA_FILE = "qa3_testdata.yml";
    public static String QA3_ENVIRONMENT = "QA3";
    public static String QA2_TESTDATA_FILE = "qa2_testdata.yml";
    public static String QA2_ENVIRONMENT = "QA2";
    public static String STG_TESTDATA_FILE = "Stg_testdata.yml";
    public static String STG_ENVIRONMENT = "STG";
    public static String PROD_TESTDATA_FILE = "prod_testdata.yml";
    public static String PROD_ENVIRONMENT = "PROD";
    public static String KEYBOARD_PROJECTLIST = "Lesson31,L31PalmettoEventSolutionsKeyingDrills,L31PalmettoEventSolutionsProject1,L31PalmettoEventSolutionsProject2,Lesson36,L36PalmettoEventSolutionsKeyingDrills,L36PalmettoEventSolutionsProject1,L36PalmettoEventSolutionsProject2,Lesson42,L42PalmettoEventSolutionsKeyingDrills,L42PalmettoEventSolutionsProject1,L42PalmettoEventSolutionsProject2,L42PalmettoEventSolutionsProject3,Lesson48,L48PalmettoEventSolutionsKeyingDrills,L48PalmettoEventSolutionsProject1,L48PalmettoEventSolutionsProject2,Lesson53,L53PalmettoEventSolutionsKeyingDrills,L53PalmettoEventSolutionsProject1,L53PalmettoEventSolutionsProject2,L53PalmettoEventSolutionsProject3,Lessons54-55,L54-55PalmettoEventSolutionsKeyingDrills,L54-55PalmettoEventSolutionsProject1,L54-55PalmettoEventSolutionsProject2,L54-55PalmettoEventSolutionsProject3,L54-55PalmettoEventSolutionsProject5";
    public static String PPT_FOLDER = "Projectpptfiles";
    public static String OBJECT_WAIT_TIME1 = "OBJECT_WAIT_TIME1";
    public static String KEYBOARDING_LESSON11_TASKLIST = "WarmupWarmupWarmupWarmupImprove KeystrokingImprove KeystrokingImprove KeystrokingImprove KeystrokingImprove KeystrokingImprove KeystrokingImprove KeystrokingImprove KeystrokingImprove KeystrokingImprove KeystrokingDevelop SkillDevelop SkillDevelop SkillDevelop SkillDevelop SkillDevelop SkillPractice KeyingTimed Writing";
    public static String KEYBOARDING_TIMEDWRITING_TASKGROUPLIST = "Timed WritingTimed WritingTimed Writing";
    public static String RED_BORDER_COLOR = "rgb(189, 54, 47) 0px 0px 0px 2px";
    public static String VALUE_ATTRIBUTE = "value";
    public static String BOX_SHADOW = "box-shadow";
    public static String SAM_ASSIGNMENTS = "Assign123 Review Home Row, Space Bar, Enter, and i Learn e and n Review Keys Learned in Lessons 1-2 Review Home Row, Space Bar, Enter, i, e and n Learn Left Shift, h, t, and period (.) Review Left Shift, h, t, and period (.) Learn r, Right Shift, c, and o Review r, Right Shift, c, and o Learn w, comma (,), b, and p Review Keys Learned in Lessons 1-6 Learn g, question mark (?), x, and u Learn q, m, v, and apostrophe (') Learn z, y, quotation mark ( Review 1 of Keys Learned in Lessons 1 - 10  Review 2 of  Keys Learned in Lessons 1 - 10 Review 3 of Keys Learned in Lessons 1 - 10  Learn 1 and 8 Learn 5 and 0";
    public static String LB_ASSIGNMENT = "L3 Review Home Row, Space Bar, Enter, i, e and n";
    public static String LB_TIME_WRITING = "Timed Writing 1";
    public static String ZEUS_ASSIGNMENT = "L27 Text Formats Word Drills";
    public static String KB_PROJECT = "L42 Palmetto Event Solutions Project 1";
    public static String ON = "ON";
    public static String OFF = "OFF";
    public static String STUDENTLASTNAMEFIRSTNAME = "studentfullname";
    public static String SCOREINPERCENT = "scoreinpercent";
    public static String COMPLETEDSTATUS = "completedstatus";
    public static String INCORRECTANSWERS = "incorrectanswers";
    public static String CORRECTANSWERS = "correctanswers";
    public static String SKIPPEDQUESTIONS = "skippedquestions";
    public static String QUESTIONSNOTPRESENTED = "questionsnotpresented";
    public static String SECTIONNAME = "SectionName";
    public static String SECTIONTERM = "Term";
    public static String SECTIONYEAR = "Year";
    public static String KEYBOARDINGTASKNAME = "keyboardingtaskname";
    public static String MAX_STUDENTACCESSPASSWORD = "16";
    public static String LESSONS = "Lesson ";
    public static String CORRECT = "Correct";
    public static String INCORRECT = "Incorrect";
    public static String SKIPPED = "skipped";
    public static String GWAM = "GWAM";
    public static String ERRORS = "Errors";
    public static String ACCURACY = "Accuracy";
    public static String ERRORSALLOWED = "errorsallowed";
    public static String ATTENDEDASSIGNMENTNAME = "attendedassignmentname";
    public static String SPECIALARROW = " ▸ ";
    public static String TIMERVALUEFORKEYBOARDINGASSIGNMENT = "timervalueforkeyboardingassignment";
    public static String STR_HYPHEN = " - ";
    public static String LESSON27ZEUSASSIGNMENTTASKONENAME = "Typing Task Format Text with Font Commands L27 D1";
    public static String LESSON27ZEUSASSIGNMENTTASKONEINSTRUCTION = "Key the list of commands below. Tap ENTER after each command.";
    public static String LESSON27ZEUSASSIGNMENTTASKTWONAME = "Bold Text L27 D1";
    public static String LESSON27ZEUSASSIGNMENTTASKTWOINSTRUCTION = "Select Bold in the list you just keyed and apply the format to the name of the command.";
    public static String KEYBOARDINGTRAININGASSIGNMENTTASKID = "WIN83787WIN83783WIN83780WIN83781WIN83757CONCEPTS3215CONCEPTS3213CONCEPTS3214CONCEPTS3207CONCEPTS3212CONCEPTS3208CONCEPTS3210CONCEPTS3211CONCEPTS3252CONCEPTS3229CONCEPTS3230CONCEPTS3253CONCEPTS3228CONCEPTS3216CONCEPTS3245CONCEPTS3217CONCEPTS3218CONCEPTS3219CONCEPTS3220CONCEPTS3221CONCEPTS3193CONCEPTS3209CONCEPTS3231CONCEPTS3255";
    public static String KEYBOARDINGTRAININGASSIGNMENTTASKGROUP = "Activity 2Activity 2Activity 3Activity 4Activity 5Activity 1Activity 1Activity 1Activity 1Activity 1Activity 1Activity 1Activity 1Activity 1Activity 1Activity 1Activity 1Activity 1Activity 1Activity 1Activity 1Activity 1Activity 1Activity 1Activity 1Activity 1Activity 1Activity 1";
    public static String SELECTED_DATE_COLOR = "rgba(0, 118, 177, 1)";
    public static String TOMOROW="tomorowDate";
    public static String DAYAFTERTOMOROW="dayAfterTomorrow";
    public static String RANDOM_STRING = "_RANDOM";
    public static String STUDENT_USER = "STUDENT";
    public static String RESULTS="Results";
    public static String REPORTS="Reports";
    public static String RANDOM_GRACE_PERIOD = "_RANDOMGP";
    public static String KEYCODED = "KEYCODED";
    public static String ITYPE = "ITYPE";
    public static String EXAM = "EXAM";
    public static String SAMPATH = "SAMPATH";
    public static String FIRST = "first";
    public static String ROBOTIL="Robotil-1.10";
    public static String RGB_Red_Border = "rgba(148, 76, 76, 1)";
    public static String Border_Bottom = "border-bottom-color";
    public static String strKBImages = "LMSKeyboardModule";
}