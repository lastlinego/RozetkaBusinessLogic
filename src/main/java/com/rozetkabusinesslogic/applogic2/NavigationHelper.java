package com.rozetkabusinesslogic.applogic2;

import com.rozetkabusinesslogic.applogic.INavigationHelper;
import com.rozetkabusinesslogic.pages.AsusPage;
import com.rozetkabusinesslogic.pages.CreditPage;
import com.rozetkabusinesslogic.pages.MyProfilePage;
import com.rozetkabusinesslogic.pages.NoteBookPage;

public class NavigationHelper extends DriverBasedHelper implements INavigationHelper {
    private String baseUrl;


    public NavigationHelper(ApplicationManager manager) {
        super(manager.getWebDriver());
        this.baseUrl = manager.getBaseUrl();
    }

    @Override
    public void openMainPage() {
        driver.get(baseUrl);
    }

    @Override
    public void navigateToHomePage() {

    }

    @Override
    public void navigateToCreditPage() {
        pages.homePage.openCreditLink();
    }

    public void navigateToRegistrationPage() {
        pages.homePage.openRegistrationPage();
    }

    public void navigateToLoginPopUp() {
        pages.homePage.clickSignInBtnHomePage();
    }

    public String getTitleOfPage() {
        return pages.creditPage.getTitle();
    }

    public String getHeadingOfTheCart() {
        return pages.homePage.cartTitle();
    }

    public String getHeadingMyProfile() {
        return pages.myProfilePage.myProfileTitle();
    }

    public MyProfilePage navigateToMyProfileAsLogged() {
        return pages.homePage.openPageAsLoggedUser();
    }

    public void pressButtonCart() {
        pages.homePage.openCart();
    }

    public int getNumberOfElementsCredit() {
        return pages.creditPage.listOfCreditRules();
    }

    public String getTitleOfCrediTable() {
        return pages.creditPage.creditTableTitle();
    }

    public String getAgeAlfaBank() {
        return pages.creditPage.creditAgeAlfaBank();
    }

    public CreditPage scrollToAlfaAge() {
        return pages.creditPage.scrollCreditPage();
    }

    public String getTheTableItemsInformation() {
        return pages.creditPage.creditTableItems("0,01% на 15 месяцев", "Льготный период");
    }

    public NoteBookPage navigateToNoteBookPage() {
        return pages.homePage.clickNoteBookBtn();
    }

    public int getSizeOfTheBrands() {
        return pages.noteBookPage.numberOfTheBrands();
    }

    public AsusPage clickAsusBtn() {
        return pages.noteBookPage.asusBtn();
    }

    public int getDefaultAsusItems() {
        return pages.asusPage.listOfTheAsusDefault();
    }

    public AsusPage changeViewToList() {
        return pages.asusPage.cliclListViewBtn();
    }

    public int getAsusItemsInTheListView() {
        return pages.asusPage.itemsInTheListView();
    }

    public AsusPage clickLoadMoreBtn() {
        return pages.asusPage.loadMoreBtn();
    }

    public int getItemsAfterLoadMore() throws InterruptedException {
        return pages.asusPage.itemsAfterLoadMore();
    }


}
