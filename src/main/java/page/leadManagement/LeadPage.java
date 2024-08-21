package page.leadManagement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LeadPage {
    @FindBy(xpath = "//span[text()='Lead Management']")
    public static WebElement leadManagementMenu;
    @FindBy(xpath = "//span[text()='Lead Listing']")
    public static WebElement leadListingMenu;
    @FindBy(xpath = "//button[text()='Add ']")
    public static WebElement leadAddButton;
    @FindBy(name = "studentName")
    public static WebElement studentNameInput;
    @FindBy(xpath = "//select[@name='subjectId']")
    public static WebElement subjectDropDown;
    @FindBy(xpath = "//input[@name='gender' and @value='Male']")
    public static WebElement maleGenderRadioButton;
    @FindBy(name = "dateOfBirth")
    public static WebElement dateOfBirthInput;
    @FindBy(name = "medicalCondition")
    public static WebElement medicalConditionInput;
    @FindBy(name = "ethnicGroup")
    public static WebElement ethnicGroupDropDown;
    @FindBy(name = "nameOfSchool")
    public static WebElement nameOfSchoolInput;
    @FindBy(xpath = "//input[@value='KINDERGARTEN']")
    public static WebElement kinderGardenSchoolTypeRadioButton;
    @FindBy(name = "centerId")
    public static WebElement centerNameDropDown;
    @FindBy(xpath = "//div[text()='Lead information created successfully']")
    public static WebElement studentInformationToaster;
    @FindBy(name = "pencilGrip")
    public static WebElement pencilGripDropDown;
    @FindBy(name = "writing")
    public static WebElement writingDropDown;
    @FindBy(name = "recognizeAToZ")
    public static WebElement recognizeAToZDropDown;
    @FindBy(xpath = "//input[@name='writeUpperAToZ' and @value='Yes']")
    public static WebElement yesWriteUpperAToZRadio;
    @FindBy(xpath = "//input[@name='writeLowerAToZ' and @value='Yes']")
    public static WebElement yesWriteLowerAToZRadio;
    @FindBy(xpath = "//input[@name='soundOfAToZ' and @value='Yes']")
    public static WebElement yesSoundOfAToZRadio;
    @FindBy(xpath = "//input[@name='canReadSimpleSentence' and @value='Yes']")
    public static WebElement yesCanReadSimpleSentenceRadio;
    @FindBy(xpath = "//div[text()='Lead information updated successfully']")
    public static WebElement leadInfoUpdatedToaster;
    @FindBy(name = "mothersFullName")
    public static WebElement mothersFullNameInput;
    @FindBy(name = "mothersOccupation")
    public static WebElement mothersOccupationInput;
    @FindBy(name = "mothersDateOfBirth")
    public static WebElement mothersDateOfBirthInput;
    @FindBy(name = "mothersMobileNumber")
    public static WebElement mothersMobileNumberInput;
    @FindBy(name = "mothersEmailAddress")
    public static WebElement mothersEmailAddressInput;
    @FindBy(name = "monthlyIncomeOfMother")
    public static WebElement monthlyIncomeOfMotherDropDown;
    @FindBy(xpath = "//input[@value='mother']")
    public static WebElement motherPrimaryRadioButton;
    @FindBy(name = "fathersFullName")
    public static WebElement fathersFullNameInput;
    @FindBy(name = "fathersOccupation")
    public static WebElement fathersOccupationInput;
    @FindBy(name = "fathersDateOfBirth")
    public static WebElement fathersDateOfBirthInput;
    @FindBy(name = "fathersMobileNumber")
    public static WebElement fathersMobileNumberInput;
    @FindBy(name = "fathersEmailAddress")
    public static WebElement fathersEmailAddressInput;
    @FindBy(name = "monthlyIncomeOfFather")
    public static WebElement monthlyIncomeOfFatherDropDown;
    @FindBy(name = "address")
    public static WebElement addressInput;
    @FindBy(name = "postalCode")
    public static WebElement postalCodeInput;
    @FindBy(name = "nameOfEmergency")
    public static WebElement nameOfEmergencyInput;
    @FindBy(name = "emergencyNric")
    public static WebElement emergencyNricInput;
    @FindBy(name = "emergencyContact")
    public static WebElement emergencyContactInput;
    @FindBy(xpath = "//input[@value='AUNTY']")
    public static WebElement auntyRelationRadio;
    @FindBy(xpath = "//button[text()=' Save And Next']")
    public static WebElement saveAndNextButton;
    @FindBy(xpath = "//input[@name='preferredDay' and @value='TUESDAY']")
    public static WebElement tuesdayCheckBox;
    @FindBy(xpath = "//input[@name='preferredDay' and @value='WEDNESDAY']")
    public static WebElement wednesdayCheckBox;
    @FindBy(xpath = "//input[@name='preferredDay' and @value='THURSDAY']")
    public static WebElement thursdayCheckBox;
    @FindBy(xpath = "//input[@name='preferredDay' and @value='FRIDAY']")
    public static WebElement fridayCheckBox;
    @FindBy(xpath = "//input[@name='preferredDay' and @value='SATURDAY']")
    public static WebElement saturdayCheckBox;
    @FindBy(id = "SUNDAY")
    public static WebElement sundayCheckBox;
    @FindBy(id = "3PM - 6PM")
    public static WebElement preferredTimeSlotCheckboxOne;
    @FindBy(id = "6PM - 9PM")
    public static WebElement preferredTimeSlotCheckboxTwo;
    @FindBy(id = "9AM - 12NN")
    public static WebElement preferredTimeSlotCheckboxThree;
    @FindBy(id = "12NN - 3PM")
    public static WebElement preferredTimeSlotCheckboxFour;
    @FindBy(id = "3AM - 6AM")
    public static WebElement preferredTimeSlotCheckboxFive;
    @FindBy(name = "enquiryDate")
    public static WebElement enquiryDateInput;
    @FindBy(id = "agreeConditionOne")
    public static WebElement agreeConditionOneCheckBox;
    @FindBy(id = "agreeConditionTwo")
    public static WebElement agreeConditionTwoCheckBox;
    @FindBy(id = "agreeConditionThree")
    public static WebElement agreeConditionThreeCheckBox;
    @FindBy(xpath = "//button[text()='Submit']")
    public static WebElement lastSubmitButton;
    @FindBy(xpath = "//span[text()='New/WaitList']")
    public static WebElement newOrWaitListStatusButton;
    @FindBy(xpath = "//button[@aria-expanded='true']/following::ul[@class='dropdown-menu text-capitalize leadStatuslist show']/li/li/button[text()='Arranging Assesment']")
    public static WebElement arrangingAssesmentButton;
    @FindBy(xpath = "//button[@aria-expanded='true']/following::ul[@class='dropdown-menu text-capitalize leadStatuslist show']")
    public static List<WebElement> totalStatusPopup;
    @FindBy(tagName = "td")
    public static List<WebElement> leadListingColumn;
    @FindBy(name = "assessmentDate")
    public static WebElement assessmentDateInput;
    @FindBy(xpath = "//button[text()='Submit']")
    public static WebElement arrangeAssessmentSaveButton;
    @FindBy(xpath = "//div[text()='Assessment created successfully']")
    public static WebElement arrangeAssessmentToaster;
    @FindBy(xpath = "//span[text()='Arranging Assesment']")
    public static WebElement arrangeAssesmentTableButton;
    @FindBy(xpath = "//button[@aria-expanded='true']/following::ul[@class='dropdown-menu text-capitalize leadStatuslist show']/li/a/button[text()='Do Assesment']")
    public static WebElement doAssesmentPopupButton;
    @FindBy(xpath = "//input[@id='levelAssessed'][1]")
    public static WebElement artyDreamerRadio;
    @FindBy(xpath = "//div[text()='Lead do assessment created successfully']")
    public static WebElement doAssessmentToaster;
    @FindBy(xpath = "//img[@alt='FISTED']")
    public static WebElement fistedPencilGrip;
    @FindBy(xpath = "//input[@value='STEADY']")
    public static WebElement steadyOption;
    @FindBy(xpath = "//input[@value='Yes']")
    public static WebElement yesComprehensionOfInstructions;
    @FindBy(name = "artyRemarks")
    public static WebElement artyRemarksInputs;
    @FindBy(xpath = "//input[@name='verbalLanguageDevelopment' and @value ='SINGLE_WORD']")
    public static WebElement singleWordRadio;
    @FindBy(xpath = "//input[@name='attentionMilestone' and @value ='FLEETING']")
    public static WebElement fleetingRadio;
    @FindBy(xpath = "//label[@for='uppercaseA']")
    public static WebElement upperCaseA;
    @FindBy(xpath = "//label[@for='uppercaseB']")
    public static WebElement uppercaseB;
    @FindBy(xpath = "//label[@for='uppercaseC']")
    public static WebElement uppercaseC;
    @FindBy(xpath = "//label[@for='uppercaseD']")
    public static WebElement uppercaseD;
    @FindBy(xpath = "//label[@for='uppercaseE']")
    public static WebElement uppercaseE;
    @FindBy(xpath = "//label[@for='uppercaseF']")
    public static WebElement uppercaseF;
    @FindBy(xpath = "//label[@for='uppercaseG']")
    public static WebElement uppercaseG;
    @FindBy(xpath = "//label[@for='uppercaseH']")
    public static WebElement uppercaseH;
    @FindBy(xpath = "//input[@name = 'sightWords' and @value='NIL']")
    public static WebElement sighWordsNilCheckbox;
    @FindBy(xpath = "//input[@name = 'hbrothersSightWords' and @value='NIL']")
    public static WebElement hBrothersSighWordsNilCheckbox;
    @FindBy(xpath = "//div[text()='Lead Do Assessment Arty Pursuers created successfully']")
    public static WebElement doAssessmentArtyPursuersToaster;
    @FindBy(xpath = "//button[text()='Submit']")
    public static WebElement submitButton;
    @FindBy(xpath = "//a[contains(@href, 'lead/lead/view')]/button[@class='btn btn-sm']")
    public static WebElement viewButtonLeadTable;
    @FindBy(xpath = "//span[text()='Do Assessment']")
    public static WebElement doAssessmentPageButton;
    @FindBy(xpath = "//span[text()='Assesment Done']")
    public static WebElement assessmentDoneButton;
    @FindBy(xpath = "//button[@aria-expanded='true']/following::ul[@class='dropdown-menu text-capitalize leadStatuslist show']/li[4]")
    public static WebElement enrollLeadButton;
    @FindBy(name = "studentChineseName")
    public static WebElement studentChineseNameInput;
    @FindBy(name = "file")
    public static WebElement profileImageFileInput;
    @FindBy(xpath = "//input[@value='Kindergarten']")
    public static WebElement kinderGardenSchoolType;
    @FindBy(name = "primaryLanguage")
    public static WebElement primaryLanguageDropDown;
    @FindBy(xpath = "//input[@name ='allowMagazine' and @value='yes']")
    public static WebElement yesAllowMagazineRadioButton;
    @FindBy(xpath = "//input[@name ='allowSocialMedia' and @value='yes']")
    public static WebElement yesAllowSocialMediaRadioButton;

    @FindBy(name = "parentInformation[0].addresses")
    public static WebElement addressAreaOne;
    @FindBy(name = "parentInformation[0].postalCodes")
    public static WebElement postalCodeOne;
    @FindBy(name = "parentInformation[1].addresses")
    public static WebElement addressAreaTwo;
    @FindBy(name = "parentInformation[1].postalCodes")
    public static WebElement postalCodeTwo;
    @FindBy(name = "emergencyContactName")
    public static WebElement emergencyContactNameInput;
    @FindBy(name = "emergencyContactInformation[0].authorizedRelation")
    public static WebElement emergencyContactAuthorizedRelationInput;
   /* @FindBy(name = "files")
    public static WebElement profilePicOfEmergencyContact;*/
    @FindBy(name = "emergencyContactInformation[0].emergencyContactAddress")
    public static WebElement emergencyContactAddressInput;
}
