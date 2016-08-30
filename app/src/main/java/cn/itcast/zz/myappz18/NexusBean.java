/*
 * Copyright (c) 2016. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package cn.itcast.zz.myappz18;

/**
 * Created by Administrator on 2016/8/30.
 */
public class NexusBean {


    /**
     * AADAuthority : https://login.windows.net/common
     * AADProviderClientId : 268761a2-03f3-40df-8a8b-c3db24145b6b
     * AADProviderScope : www.microsoft.com::mbi_ssl
     * AADResource : https://onestore.microsoft.com
     * AlternateId : https://storeedgefd.dsx.mp.microsoft.com/channels/products/{productId}?idType={idType}&appversion={appVersion}&market={marketCode}&locale={localeCode}&deviceType={deviceType}&deviceFamily={deviceFamily}&catalogLocales={catalogLocaleCodes}&musicMarket={musicMarketCode}&hardware={hardware}&packageHardware={packageHardware}&deviceFamilyVersion={deviceFamilyVersion}&architecture={architecture}
     * AppsHomePage : https://storeedgefd.dsx.mp.microsoft.com/pages/appsHome?appversion={appVersion}&market={marketCode}&locale={localeCode}&deviceType={deviceType}&deviceFamily={deviceFamily}&catalogLocales={catalogLocaleCodes}&musicMarket={musicMarketCode}&screenSize={screenSize}&hardware={hardware}&packageHardware={packageHardware}&deviceFamilyVersion={deviceFamilyVersion}&architecture={architecture}&oemId={oemId}&scmId={scmId}&moId={moId}
     * BoomBoxSiteId : music.microsoft.com
     * BrowseCommandTargetByCategory : https://storeedgefd.dsx.mp.microsoft.com/pages/charts?{CommonParams}&listName=TopFree&category={CatId}&mediaType={MediaType}
     * BrowseCommandTargetBySubCategory : https://storeedgefd.dsx.mp.microsoft.com/pages/charts?{CommonParams}&listName=TopFree&category={CatId}&subCategory={SubCatId}&mediaType={MediaType}
     * BrowseCommandTargetByChart : https://storeedgefd.dsx.mp.microsoft.com/pages/charts?{CommonParams}&listName={ListId}&mediaType={MediaType}
     * BrowseCommandTargetByRelated : https://storeedgefd.dsx.mp.microsoft.com/pages/related?{CommonParams}&productId={ProductId}
     * BulkProductDetails : https://storeedgefd.dsx.mp.microsoft.com/channels/products?market={marketCode}&locale={localeCode}&deviceType={deviceType}&deviceFamily={deviceFamily}&catalogIds={catalogIds}&catalogTicketKeys={catalogTicketKeys}&catalogLocales={catalogLocaleCodes}&musicMarket={musicMarketCode}&hardware={hardware}&packageHardware={packageHardware}&deviceFamilyVersion={deviceFamilyVersion}&architecture={architecture}&oemId={oemId}&scmId={scmId}&moId={moId}
     * CallerSpecificData : https://storeedgefd.dsx.mp.microsoft.com/channels/callerspecificdata/?market={marketCode}&locale={localeCode}&appversion={appVersion}&deviceFamily={deviceFamily}&catalogLocales={catalogLocaleCodes}&musicMarket={musicMarketCode}&oemId={oemId}&scmId={scmId}&moId={moId}
     * ChartCommandTarget : https://storeedgefd.dsx.mp.microsoft.com/pages/chartResults?{CommonParams}&itemType=Apps{=FilterQueryString}&oemId={oemId}&scmId={scmId}&moId={moId}
     * CollectionList : https://storeedgefd.dsx.mp.microsoft.com/pages/collectionlist?collectionid={Id}&{CommonParams}
     * CollectionDetails : https://storeedgefd.dsx.mp.microsoft.com/pages/pages/collection?collectionId={Id}&{CommonParams}&oemId={oemId}&scmId={scmId}&moId={moId}
     * ErrorInfo : https://storeedgefd.dsx.mp.microsoft.com/channels/errorinfo?context={errorContext}&code={errorCode}&market={marketCode}&locale={localeCode}&deviceType={deviceType}&deviceFamily={deviceFamily}&catalogLocales={catalogLocaleCodes}&musicMarket={musicMarketCode}
     * GamesHomePage : https://storeedgefd.dsx.mp.microsoft.com/pages/gamesHome?appversion={appVersion}&market={marketCode}&locale={localeCode}&deviceType={deviceType}&deviceFamily={deviceFamily}&catalogLocales={catalogLocaleCodes}&musicMarket={musicMarketCode}&screenSize={screenSize}&hardware={hardware}&packageHardware={packageHardware}&deviceFamilyVersion={deviceFamilyVersion}&architecture={architecture}&oemId={oemId}&scmId={scmId}&moId={moId}
     * GetAllEntitlements : https://storeedgefd.dsx.mp.microsoft.com/channels/entitlements?
     * GetProductReviews : https://storeedgefd.dsx.mp.microsoft.com/channels/ratings/product/{productId}?systemType={systemType}&market={marketCode}&locale={localeCode}&deviceType={deviceType}&deviceFamily={deviceFamily}&catalogLocales={catalogLocaleCodes}&musicMarket={musicMarketCode}&deviceFamilyFilter={deviceFamilyFilter}
     * GetRatingsSummary : https://storeedgefd.dsx.mp.microsoft.com/channels/ratings/summary/product/{productId}?systemType={systemType}&market={marketCode}&locale={localeCode}&deviceType={deviceType}&deviceFamily={deviceFamily}&catalogLocales={catalogLocaleCodes}&musicMarket={musicMarketCode}&deviceFamilyFilter={deviceFamilyFilter}
     * GetUserReview : https://storeedgefd.dsx.mp.microsoft.com/channels/ratings/user/review/product/{productId}?market={marketCode}&locale={localeCode}&deviceType={deviceType}&deviceFamily={deviceFamily}&catalogLocales={catalogLocaleCodes}&musicMarket={musicMarketCode}
     * HomePage : https://storeedgefd.dsx.mp.microsoft.com/pages/home?appversion={appVersion}&market={marketCode}&locale={localeCode}&deviceType={deviceType}&deviceFamily={deviceFamily}&catalogLocales={catalogLocaleCodes}&musicMarket={musicMarketCode}&screenSize={screenSize}&hardware={hardware}&packageHardware={packageHardware}&deviceFamilyVersion={deviceFamilyVersion}&architecture={architecture}&oemId={oemId}&scmId={scmId}&moId={moId}
     * HttpTimeout : 30000
     * InAppPurchases : https://storeedgefd.dsx.mp.microsoft.com/channels/products/{productId}/addons?market={marketCode}&locale={localeCode}&deviceType={deviceType}&deviceFamily={deviceFamily}&catalogLocales={catalogLocaleCodes}
     * Licensing : https://licensing.mp.microsoft.com
     * LinkUriFormat : https://www.microsoft.com/store/{idType}/{id}
     * LiveTile : https://livetileedge.dsx.mp.microsoft.com/background/pages/livetile?appversion={appVersion}&market={marketCode}&locale={localeCode}&deviceType={deviceType}&deviceFamily={deviceFamily}&catalogLocales={catalogLocaleCodes}&musicMarket={musicMarketCode}&screenSize={screenSize}&hardware={hardware}&packageHardware={packageHardware}&deviceFamilyVersion={deviceFamilyVersion}&architecture={architecture}
     * MDCollections : https://collections.mp.microsoft.com/
     * MDCreateOrder : https://purchase.mp.microsoft.com/users/me/orders
     * MDDisplayCatalog : https://displaycatalog.mp.microsoft.com/
     * MDPaymentInstruments : https://paymentinstruments.mp.microsoft.com/
     * MDPurchase : https://purchase.mp.microsoft.com
     * MDPurchaseOrder : https://purchase.mp.microsoft.com/users/{userId}/orders/{orderId}
     * MDGetAppReceiptsDesktop : https://licensingwindows.mp.microsoft.com/Licensing/License/AcquireReceipt/6.2/0?productId={productId}&receiptType={receiptType}
     * MDGetAppReceiptsMobile : https://licensingphone.mp.microsoft.com/v9/purchases/appreceipts?os=8.10.12400.0&cc={cc}&lang={lang}&parentProductId={parentProductId}&installedPublisherId={installedPublisherId}
     * MDGetOneProductReceiptMobile : https://licensingphone.mp.microsoft.com/v9/purchases/receipts?os=8.10.12400.0&cc={cc}&lang={lang}&parentProductId={parentProductId}&featureName={featureName}&installedPublisherId={installedPublisherId}
     * MDProductDetails : https://displaycatalog.mp.microsoft.com/products/{productId}?market={marketCode}&language={localeCode}&fieldsTemplate={fieldsTemplate}
     * MDSearchAddOns : https://displaycatalog.mp.microsoft.com/products?rank={rank}&market={market}&language={language}&addOnParent={addOnParent}&fieldsTemplate={fieldsTemplate}{platformDependencyNameParam}
     * MDSearchProductsAlternateId : https://displaycatalog.mp.microsoft.com/products?rank={idType}&count={count}&alternateId={productId}&market={marketCode}&language={localeCode}&skipItems={skip}&fieldsTemplate={fieldsTemplate}
     * MDSearchSkusAlternateId : https://displaycatalog.mp.microsoft.com/skus?rank={idType}&count={count}&alternateId={productId}&market={marketCode}&language={localeCode}&skipItems={skip}&fieldsTemplate={fieldsTemplate}
     * MDv6PurchaseOrder : https://purchase.mp.microsoft.com/v6.0/users/{userId}/orders/{orderId}
     * MDv6ProductDetails : https://displaycatalog.mp.microsoft.com/v6.0/products/{productId}?market={marketCode}&languages={language}&fieldsTemplate={fieldsTemplate}
     * MDv6SearchProductsAlternateId : https://displaycatalog.mp.microsoft.com/v6.0/products?rank={idType}&alternateId={productId}&market={marketCode}&languages={language}&fieldsTemplate={fieldsTemplate}
     * MDv6SearchSkusAlternateId : https://displaycatalog.mp.microsoft.com/v6.0/skus?rank={idType}&alternateId={productId}&market={marketCode}&languages={language}&fieldsTemplate={fieldsTemplate}
     * MobiPIAdd : https://paymentinstruments.mp.microsoft.com/v6.0/users/{userId}/paymentInstruments?country={country}
     * MobiPIUpdate : https://paymentinstruments.mp.microsoft.com/v6.0/users/{userId}/paymentInstruments/{PIID}?country={country}
     * MOBillingAuthenticationDomain : mobilling.microsoft.com
     * MOIdentification : https://pmservices.cp.microsoft.com/MobileDiscoveryService/MobileOperator/Identifier?PhoneSerialNumber={PhoneSerialNumber}
     * MOConfiguration : https://pmservices.cp.microsoft.com/MobileDiscoveryService/MobileOperator/{MOID}/Configuration?PhoneSerialNumber={PhoneSerialNumber}
     * MOConfigVersions : https://pmservices.cp.microsoft.com/MobileDiscoveryService/MobileOperator/Versions?PhoneSerialNumber={PhoneSerialNumber}
     * MOPicksPage : https://storeedgefd.dsx.mp.microsoft.com/pages/mopicks?appversion={appVersion}&market={marketCode}&locale={localeCode}&deviceType={deviceType}&deviceFamily={deviceFamily}&catalogLocales={catalogLocaleCodes}&musicMarket={musicMarketCode}&screenSize={screenSize}&hardware={hardware}&packageHardware={packageHardware}&deviceFamilyVersion={deviceFamilyVersion}&architecture={architecture}&oemId={oemId}&scmId={scmId}&moId={moId}
     * MSAProfilePicture : https://cid-{cid}.users.storage.live.com/users/0x{cid}/myprofile/expressionprofile/profilephoto:UserTileStatic/ProfileImage?ck=1&ex=24
     * MSAProviderScope : www.microsoft.com::mbi_ssl
     * NavChrome : https://storeedgefd.dsx.mp.microsoft.com/pages/chrome?appversion={appVersion}&market={marketCode}&locale={localeCode}&deviceType={deviceType}&deviceFamily={deviceFamily}&catalogLocales={catalogLocaleCodes}&musicMarket={musicMarketCode}&screenSize={screenSize}&hardware={hardware}&packageHardware={packageHardware}&deviceFamilyVersion={deviceFamilyVersion}&architecture={architecture}&oemId={oemId}&scmId={scmId}&moId={moId}
     * NavItems : https://storeedgefd.dsx.mp.microsoft.com/navigations/?market={marketCode}&locale={localeCode}&oemId={oemId}&scmId={scmId}&moId={moId}&appversion={appVersion}&deviceFamily={deviceFamily}&catalogLocales={catalogLocaleCodes}&musicMarket={musicMarketCode}
     * OemIdentification : https://storeedgefd.dsx.mp.microsoft.com/configuration/oemdiscovery?oemId={oemId}&scmId={scmId}&phoneManufacturerName={phoneManufacturerName}&smBiosManufacturerName={smBiosManufacturerName}&phoneDeviceModel={phoneDeviceModel}&smBiosDm={smBiosDm}
     * OEMPicksPage : https://storeedgefd.dsx.mp.microsoft.com/pages/oempicks?appversion={appVersion}&market={marketCode}&locale={localeCode}&deviceType={deviceType}&deviceFamily={deviceFamily}&catalogLocales={catalogLocaleCodes}&musicMarket={musicMarketCode}&screenSize={screenSize}&hardware={hardware}&packageHardware={packageHardware}&deviceFamilyVersion={deviceFamilyVersion}&architecture={architecture}&oemId={oemId}&scmId={scmId}&moId={moId}
     * OneStoreAuthenticationDomain : www.microsoft.com
     * OneStoreAuthenticationPolicy : mbi_ssl
     * PaymentInstrumentsGetProfilePath : https://paymentinstruments.mp.microsoft.com/v6.0/users/{userId}/profiles?profileType={profileType}
     * PaymentInstrumentsAccountAddressesPath : https://paymentinstruments.mp.microsoft.com/v6.0/users/{userId}/addresses?country={country}
     * ProductDetails : https://storeedgefd.dsx.mp.microsoft.com/channels/products/{productId}?appversion={appVersion}&idType={idType}&market={marketCode}&locale={localeCode}&deviceType={deviceType}&deviceFamily={deviceFamily}&catalogLocales={catalogLocaleCodes}&musicMarket={musicMarketCode}&hardware={hardware}&packageHardware={packageHardware}&deviceFamilyVersion={deviceFamilyVersion}&architecture={architecture}
     * ProductDetailsBySku : https://storeedgefd.dsx.mp.microsoft.com/channels/products/{productId}/{skuId}?appversion={appVersion}&market={marketCode}&locale={localeCode}&deviceType={deviceType}&deviceFamily={deviceFamily}&catalogLocales={catalogLocaleCodes}&musicMarket={musicMarketCode}&hardware={hardware}&packageHardware={packageHardware}&deviceFamilyVersion={deviceFamilyVersion}&architecture={architecture}
     * ProductDetailsPage : https://storeedgefd.dsx.mp.microsoft.com/pages/pdp?productId={productId}&idType={idType}&skuId={skuId}&catalogIds={catalogIds}&catalogTicketKeys={catalogTicketKeys}&appversion={appVersion}&itemType=Apps&market={marketCode}&locale={localeCode}&deviceType={deviceType}&deviceFamily={deviceFamily}&catalogLocales={catalogLocaleCodes}&musicMarket={musicMarketCode}&screenSize={screenSize}&hardware={hardware}&packageHardware={packageHardware}&deviceFamilyVersion={deviceFamilyVersion}&architecture={architecture}&deviceFamilyFilter={deviceFamilyFilter}&oemId={oemId}&scmId={scmId}&moId={moId}
     * ProductRatingsAndReview : https://storeedgefd.dsx.mp.microsoft.com/pages/RNR?productId={ProductId}&{CommonParams}
     * ProductRatingsFiltered : https://storeedgefd.dsx.mp.microsoft.com/pages/Reviews?productId={ProductId}&{CommonParams}{=FilterQueryString}
     * Purchase : https://storeedgefd.dsx.mp.microsoft.com/api/purchase?appversion={appVersion}&market={marketCode}&locale={localeCode}&deviceType={deviceType}&deviceFamily={deviceFamily}&catalogLocales={catalogLocaleCodes}&musicMarket={musicMarketCode}
     * RelatedItems : https://storeedgefd.dsx.mp.microsoft.com/channels/recommendations/related/products/{productId}?market={marketCode}&locale={localeCode}&deviceType={deviceType}&deviceFamily={deviceFamily}&itemType=Apps&catalogLocales={catalogLocaleCodes}&musicMarket={musicMarketCode}&hardware={hardware}&packageHardware={packageHardware}&deviceFamilyVersion={deviceFamilyVersion}&architecture={architecture}
     * ReportReviewConcern : https://storeedgefd.dsx.mp.microsoft.com/channels/ratings/concern/review/{reviewId}?market={marketCode}&locale={localeCode}&deviceType={deviceType}&deviceFamily={deviceFamily}&catalogLocales={catalogLocaleCodes}&musicMarket={musicMarketCode}&hardware={hardware}&packageHardware={packageHardware}&deviceFamilyVersion={deviceFamilyVersion}&architecture={architecture}
     * ReportReviewResponseConcern : https://storeedgefd.dsx.mp.microsoft.com/channels/ratings/concern/response/{responseId}?market={marketCode}&locale={localeCode}&deviceType={deviceType}&deviceFamily={deviceFamily}&catalogLocales={catalogLocaleCodes}&musicMarket={musicMarketCode}&hardware={hardware}&packageHardware={packageHardware}&deviceFamilyVersion={deviceFamilyVersion}&architecture={architecture}
     * SearchAutoSuggest : https://storeedgefd.dsx.mp.microsoft.com/channels/autosuggest?prefix={prefix}&navItemId={navItemId}&market={marketCode}&locale={localeCode}&deviceType={deviceType}&deviceFamily={deviceFamily}&catalogLocales={catalogLocaleCodes}&musicMarket={musicMarketCode}&hardware={hardware}&packageHardware={packageHardware}&deviceFamilyVersion={deviceFamilyVersion}&architecture={architecture}
     * SearchAutoSuggestV5 : https://storeedgefd.dsx.mp.microsoft.com/v5.0/autosuggest?prefix={prefix}&navItemId={navItemId}&market={marketCode}&locale={localeCode}&deviceType={deviceType}&deviceFamily={deviceFamily}&catalogLocales={catalogLocaleCodes}&musicMarket={musicMarketCode}&hardware={hardware}&packageHardware={packageHardware}&deviceFamilyVersion={deviceFamilyVersion}&architecture={architecture}
     * SearchByExtensionPage : https://storeedgefd.dsx.mp.microsoft.com/pages/searchbyextension?extension={extension}&appversion={appVersion}&market={marketCode}&locale={localeCode}&deviceType={deviceType}&deviceFamily={deviceFamily}&catalogLocales={catalogLocaleCodes}&musicMarket={musicMarketCode}&screenSize={screenSize}&hardware={hardware}&packageHardware={packageHardware}&deviceFamilyVersion={deviceFamilyVersion}&architecture={architecture}&oemId={oemId}&scmId={scmId}&moId={moId}
     * SearchByName : https://storeedgefd.dsx.mp.microsoft.com/channels/search?query={searchTerm}&platformDependency={platformDependency}&market={marketCode}&locale={localeCode}&deviceType={deviceType}&deviceFamily={deviceFamily}&catalogLocales={catalogLocaleCodes}&musicMarket={musicMarketCode}&hardware={hardware}&packageHardware={packageHardware}&deviceFamilyVersion={deviceFamilyVersion}&architecture={architecture}&oemId={oemId}&scmId={scmId}&moId={moId}
     * SearchByProtocolPage : https://storeedgefd.dsx.mp.microsoft.com/pages/searchbyprotocol?protocol={protocol}&appversion={appVersion}&market={marketCode}&locale={localeCode}&deviceType={deviceType}&deviceFamily={deviceFamily}&catalogLocales={catalogLocaleCodes}&musicMarket={musicMarketCode}&screenSize={screenSize}&hardware={hardware}&packageHardware={packageHardware}&deviceFamilyVersion={deviceFamilyVersion}&architecture={architecture}&oemId={oemId}&scmId={scmId}&moId={moId}
     * SearchByPublisherPage : https://storeedgefd.dsx.mp.microsoft.com/pages/searchbypublisher?publisherId={publisherId}&publisherName={PublisherName}&appversion={appVersion}&market={marketCode}&locale={localeCode}&deviceType={deviceType}&deviceFamily={deviceFamily}&catalogLocales={catalogLocaleCodes}&musicMarket={musicMarketCode}&screenSize={screenSize}&hardware={hardware}&packageHardware={packageHardware}&deviceFamilyVersion={deviceFamilyVersion}&architecture={architecture}&oemId={oemId}&scmId={scmId}&moId={moId}
     * SearchByTagsPage : https://storeedgefd.dsx.mp.microsoft.com/pages/searchbytags?tags={tags}&appversion={appVersion}&market={marketCode}&locale={localeCode}&deviceType={deviceType}&deviceFamily={deviceFamily}&catalogLocales={catalogLocaleCodes}&musicMarket={musicMarketCode}&screenSize={screenSize}&hardware={hardware}&packageHardware={packageHardware}&deviceFamilyVersion={deviceFamilyVersion}&architecture={architecture}&oemId={oemId}&scmId={scmId}&moId={moId}
     * SearchCommandTarget : https://storeedgefd.dsx.mp.microsoft.com/pages/{PageName}?{CommonParams}&query={SearchQuery}{=FilterQueryString}&screenSize={screenSize}&hardware={hardware}&architecture={architecture}&packageHardware={packageHardware}&oemId={oemId}&scmId={scmId}&moId={moId}
     * SearchPage : https://storeedgefd.dsx.mp.microsoft.com/pages/search?appversion={appVersion}&market={marketCode}&locale={localeCode}&deviceType={deviceType}&deviceFamily={deviceFamily}&catalogLocales={catalogLocaleCodes}&musicMarket={musicMarketCode}&screenSize={screenSize}&hardware={hardware}&packageHardware={packageHardware}&deviceFamilyVersion={deviceFamilyVersion}&architecture={architecture}&oemId={oemId}&scmId={scmId}&moId={moId}&query={SearchQuery}&navItemId={navItemId}
     * ShareProductLink : https://www.microsoft.com/store/apps/{0}
     * StoreEnvironment : Production
     * SubmitHelpfulnessVote : https://storeedgefd.dsx.mp.microsoft.com/channels/ratings/vote/review/{reviewId}?market={marketCode}&locale={localeCode}&deviceType={deviceType}&deviceFamily={deviceFamily}&catalogLocales={catalogLocaleCodes}&musicMarket={musicMarketCode}&hardware={hardware}&packageHardware={packageHardware}&deviceFamilyVersion={deviceFamilyVersion}&architecture={architecture}
     * SubmitRating : https://storeedgefd.dsx.mp.microsoft.com/channels/ratings/user/rating/product/{productId}?market={marketCode}&locale={localeCode}&deviceType={deviceType}&deviceFamily={deviceFamily}&catalogLocales={catalogLocaleCodes}&musicMarket={musicMarketCode}&hardware={hardware}&packageHardware={packageHardware}&deviceFamilyVersion={deviceFamilyVersion}&architecture={architecture}
     * SubmitReview : https://storeedgefd.dsx.mp.microsoft.com/channels/ratings/user/review/product/{productId}?market={marketCode}&locale={localeCode}&deviceType={deviceType}&deviceFamily={deviceFamily}&catalogLocales={catalogLocaleCodes}&musicMarket={musicMarketCode}&hardware={hardware}&packageHardware={packageHardware}&deviceFamilyVersion={deviceFamilyVersion}&architecture={architecture}&oemId={oemId}&scmId={scmId}&moId={moId}
     * TermsOfUseWindows : http://windows.microsoft.com/{locale}/windows/windows-store-terms-of-use
     * TermsOfUseWindowsPhone : http://www.windowsphone.com/{locale}/store/terms-of-service
     * TermsOfUseXboxLive : http://www.xbox.com/{locale}/Legal/livetou
     * WebBlend : https://www.microsoft.com/webblend?client=Universal%20Store%20Native%20Client#/purchase/confirm
     * WebBlend2 : https://www.microsoft.com/webblend?client={client}#/purchase/confirm
     * WebBlendHost : https://www.microsoft.com/webblend/getClientView?clientType=DeviceStoreClient
     * XboxLiveAuthenticationDomain : user.auth.xboxlive.com
     */

    private String AADAuthority;
    private String AADProviderClientId;
    private String AADProviderScope;
    private String AADResource;
    private String AlternateId;
    private String AppsHomePage;
    private String BoomBoxSiteId;
    private String BrowseCommandTargetByCategory;
    private String BrowseCommandTargetBySubCategory;
    private String BrowseCommandTargetByChart;
    private String BrowseCommandTargetByRelated;
    private String BulkProductDetails;
    private String CallerSpecificData;
    private String ChartCommandTarget;
    private String CollectionList;
    private String CollectionDetails;
    private String ErrorInfo;
    private String GamesHomePage;
    private String GetAllEntitlements;
    private String GetProductReviews;
    private String GetRatingsSummary;
    private String GetUserReview;
    private String HomePage;
    private String HttpTimeout;
    private String InAppPurchases;
    private String Licensing;
    private String LinkUriFormat;
    private String LiveTile;
    private String MDCollections;
    private String MDCreateOrder;
    private String MDDisplayCatalog;
    private String MDPaymentInstruments;
    private String MDPurchase;
    private String MDPurchaseOrder;
    private String MDGetAppReceiptsDesktop;
    private String MDGetAppReceiptsMobile;
    private String MDGetOneProductReceiptMobile;
    private String MDProductDetails;
    private String MDSearchAddOns;
    private String MDSearchProductsAlternateId;
    private String MDSearchSkusAlternateId;
    private String MDv6PurchaseOrder;
    private String MDv6ProductDetails;
    private String MDv6SearchProductsAlternateId;
    private String MDv6SearchSkusAlternateId;
    private String MobiPIAdd;
    private String MobiPIUpdate;
    private String MOBillingAuthenticationDomain;
    private String MOIdentification;
    private String MOConfiguration;
    private String MOConfigVersions;
    private String MOPicksPage;
    private String MSAProfilePicture;
    private String MSAProviderScope;
    private String NavChrome;
    private String NavItems;
    private String OemIdentification;
    private String OEMPicksPage;
    private String OneStoreAuthenticationDomain;
    private String OneStoreAuthenticationPolicy;
    private String PaymentInstrumentsGetProfilePath;
    private String PaymentInstrumentsAccountAddressesPath;
    private String ProductDetails;
    private String ProductDetailsBySku;
    private String ProductDetailsPage;
    private String ProductRatingsAndReview;
    private String ProductRatingsFiltered;
    private String Purchase;
    private String RelatedItems;
    private String ReportReviewConcern;
    private String ReportReviewResponseConcern;
    private String SearchAutoSuggest;
    private String SearchAutoSuggestV5;
    private String SearchByExtensionPage;
    private String SearchByName;
    private String SearchByProtocolPage;
    private String SearchByPublisherPage;
    private String SearchByTagsPage;
    private String SearchCommandTarget;
    private String SearchPage;
    private String ShareProductLink;
    private String StoreEnvironment;
    private String SubmitHelpfulnessVote;
    private String SubmitRating;
    private String SubmitReview;
    private String TermsOfUseWindows;
    private String TermsOfUseWindowsPhone;
    private String TermsOfUseXboxLive;
    private String WebBlend;
    private String WebBlend2;
    private String WebBlendHost;
    private String XboxLiveAuthenticationDomain;

    public String getAADAuthority() {
        return AADAuthority;
    }

    public void setAADAuthority(String AADAuthority) {
        this.AADAuthority = AADAuthority;
    }

    public String getAADProviderClientId() {
        return AADProviderClientId;
    }

    public void setAADProviderClientId(String AADProviderClientId) {
        this.AADProviderClientId = AADProviderClientId;
    }

    public String getAADProviderScope() {
        return AADProviderScope;
    }

    public void setAADProviderScope(String AADProviderScope) {
        this.AADProviderScope = AADProviderScope;
    }

    public String getAADResource() {
        return AADResource;
    }

    public void setAADResource(String AADResource) {
        this.AADResource = AADResource;
    }

    public String getAlternateId() {
        return AlternateId;
    }

    public void setAlternateId(String AlternateId) {
        this.AlternateId = AlternateId;
    }

    public String getAppsHomePage() {
        return AppsHomePage;
    }

    public void setAppsHomePage(String AppsHomePage) {
        this.AppsHomePage = AppsHomePage;
    }

    public String getBoomBoxSiteId() {
        return BoomBoxSiteId;
    }

    public void setBoomBoxSiteId(String BoomBoxSiteId) {
        this.BoomBoxSiteId = BoomBoxSiteId;
    }

    public String getBrowseCommandTargetByCategory() {
        return BrowseCommandTargetByCategory;
    }

    public void setBrowseCommandTargetByCategory(String BrowseCommandTargetByCategory) {
        this.BrowseCommandTargetByCategory = BrowseCommandTargetByCategory;
    }

    public String getBrowseCommandTargetBySubCategory() {
        return BrowseCommandTargetBySubCategory;
    }

    public void setBrowseCommandTargetBySubCategory(String BrowseCommandTargetBySubCategory) {
        this.BrowseCommandTargetBySubCategory = BrowseCommandTargetBySubCategory;
    }

    public String getBrowseCommandTargetByChart() {
        return BrowseCommandTargetByChart;
    }

    public void setBrowseCommandTargetByChart(String BrowseCommandTargetByChart) {
        this.BrowseCommandTargetByChart = BrowseCommandTargetByChart;
    }

    public String getBrowseCommandTargetByRelated() {
        return BrowseCommandTargetByRelated;
    }

    public void setBrowseCommandTargetByRelated(String BrowseCommandTargetByRelated) {
        this.BrowseCommandTargetByRelated = BrowseCommandTargetByRelated;
    }

    public String getBulkProductDetails() {
        return BulkProductDetails;
    }

    public void setBulkProductDetails(String BulkProductDetails) {
        this.BulkProductDetails = BulkProductDetails;
    }

    public String getCallerSpecificData() {
        return CallerSpecificData;
    }

    public void setCallerSpecificData(String CallerSpecificData) {
        this.CallerSpecificData = CallerSpecificData;
    }

    public String getChartCommandTarget() {
        return ChartCommandTarget;
    }

    public void setChartCommandTarget(String ChartCommandTarget) {
        this.ChartCommandTarget = ChartCommandTarget;
    }

    public String getCollectionList() {
        return CollectionList;
    }

    public void setCollectionList(String CollectionList) {
        this.CollectionList = CollectionList;
    }

    public String getCollectionDetails() {
        return CollectionDetails;
    }

    public void setCollectionDetails(String CollectionDetails) {
        this.CollectionDetails = CollectionDetails;
    }

    public String getErrorInfo() {
        return ErrorInfo;
    }

    public void setErrorInfo(String ErrorInfo) {
        this.ErrorInfo = ErrorInfo;
    }

    public String getGamesHomePage() {
        return GamesHomePage;
    }

    public void setGamesHomePage(String GamesHomePage) {
        this.GamesHomePage = GamesHomePage;
    }

    public String getGetAllEntitlements() {
        return GetAllEntitlements;
    }

    public void setGetAllEntitlements(String GetAllEntitlements) {
        this.GetAllEntitlements = GetAllEntitlements;
    }

    public String getGetProductReviews() {
        return GetProductReviews;
    }

    public void setGetProductReviews(String GetProductReviews) {
        this.GetProductReviews = GetProductReviews;
    }

    public String getGetRatingsSummary() {
        return GetRatingsSummary;
    }

    public void setGetRatingsSummary(String GetRatingsSummary) {
        this.GetRatingsSummary = GetRatingsSummary;
    }

    public String getGetUserReview() {
        return GetUserReview;
    }

    public void setGetUserReview(String GetUserReview) {
        this.GetUserReview = GetUserReview;
    }

    public String getHomePage() {
        return HomePage;
    }

    public void setHomePage(String HomePage) {
        this.HomePage = HomePage;
    }

    public String getHttpTimeout() {
        return HttpTimeout;
    }

    public void setHttpTimeout(String HttpTimeout) {
        this.HttpTimeout = HttpTimeout;
    }

    public String getInAppPurchases() {
        return InAppPurchases;
    }

    public void setInAppPurchases(String InAppPurchases) {
        this.InAppPurchases = InAppPurchases;
    }

    public String getLicensing() {
        return Licensing;
    }

    public void setLicensing(String Licensing) {
        this.Licensing = Licensing;
    }

    public String getLinkUriFormat() {
        return LinkUriFormat;
    }

    public void setLinkUriFormat(String LinkUriFormat) {
        this.LinkUriFormat = LinkUriFormat;
    }

    public String getLiveTile() {
        return LiveTile;
    }

    public void setLiveTile(String LiveTile) {
        this.LiveTile = LiveTile;
    }

    public String getMDCollections() {
        return MDCollections;
    }

    public void setMDCollections(String MDCollections) {
        this.MDCollections = MDCollections;
    }

    public String getMDCreateOrder() {
        return MDCreateOrder;
    }

    public void setMDCreateOrder(String MDCreateOrder) {
        this.MDCreateOrder = MDCreateOrder;
    }

    public String getMDDisplayCatalog() {
        return MDDisplayCatalog;
    }

    public void setMDDisplayCatalog(String MDDisplayCatalog) {
        this.MDDisplayCatalog = MDDisplayCatalog;
    }

    public String getMDPaymentInstruments() {
        return MDPaymentInstruments;
    }

    public void setMDPaymentInstruments(String MDPaymentInstruments) {
        this.MDPaymentInstruments = MDPaymentInstruments;
    }

    public String getMDPurchase() {
        return MDPurchase;
    }

    public void setMDPurchase(String MDPurchase) {
        this.MDPurchase = MDPurchase;
    }

    public String getMDPurchaseOrder() {
        return MDPurchaseOrder;
    }

    public void setMDPurchaseOrder(String MDPurchaseOrder) {
        this.MDPurchaseOrder = MDPurchaseOrder;
    }

    public String getMDGetAppReceiptsDesktop() {
        return MDGetAppReceiptsDesktop;
    }

    public void setMDGetAppReceiptsDesktop(String MDGetAppReceiptsDesktop) {
        this.MDGetAppReceiptsDesktop = MDGetAppReceiptsDesktop;
    }

    public String getMDGetAppReceiptsMobile() {
        return MDGetAppReceiptsMobile;
    }

    public void setMDGetAppReceiptsMobile(String MDGetAppReceiptsMobile) {
        this.MDGetAppReceiptsMobile = MDGetAppReceiptsMobile;
    }

    public String getMDGetOneProductReceiptMobile() {
        return MDGetOneProductReceiptMobile;
    }

    public void setMDGetOneProductReceiptMobile(String MDGetOneProductReceiptMobile) {
        this.MDGetOneProductReceiptMobile = MDGetOneProductReceiptMobile;
    }

    public String getMDProductDetails() {
        return MDProductDetails;
    }

    public void setMDProductDetails(String MDProductDetails) {
        this.MDProductDetails = MDProductDetails;
    }

    public String getMDSearchAddOns() {
        return MDSearchAddOns;
    }

    public void setMDSearchAddOns(String MDSearchAddOns) {
        this.MDSearchAddOns = MDSearchAddOns;
    }

    public String getMDSearchProductsAlternateId() {
        return MDSearchProductsAlternateId;
    }

    public void setMDSearchProductsAlternateId(String MDSearchProductsAlternateId) {
        this.MDSearchProductsAlternateId = MDSearchProductsAlternateId;
    }

    public String getMDSearchSkusAlternateId() {
        return MDSearchSkusAlternateId;
    }

    public void setMDSearchSkusAlternateId(String MDSearchSkusAlternateId) {
        this.MDSearchSkusAlternateId = MDSearchSkusAlternateId;
    }

    public String getMDv6PurchaseOrder() {
        return MDv6PurchaseOrder;
    }

    public void setMDv6PurchaseOrder(String MDv6PurchaseOrder) {
        this.MDv6PurchaseOrder = MDv6PurchaseOrder;
    }

    public String getMDv6ProductDetails() {
        return MDv6ProductDetails;
    }

    public void setMDv6ProductDetails(String MDv6ProductDetails) {
        this.MDv6ProductDetails = MDv6ProductDetails;
    }

    public String getMDv6SearchProductsAlternateId() {
        return MDv6SearchProductsAlternateId;
    }

    public void setMDv6SearchProductsAlternateId(String MDv6SearchProductsAlternateId) {
        this.MDv6SearchProductsAlternateId = MDv6SearchProductsAlternateId;
    }

    public String getMDv6SearchSkusAlternateId() {
        return MDv6SearchSkusAlternateId;
    }

    public void setMDv6SearchSkusAlternateId(String MDv6SearchSkusAlternateId) {
        this.MDv6SearchSkusAlternateId = MDv6SearchSkusAlternateId;
    }

    public String getMobiPIAdd() {
        return MobiPIAdd;
    }

    public void setMobiPIAdd(String MobiPIAdd) {
        this.MobiPIAdd = MobiPIAdd;
    }

    public String getMobiPIUpdate() {
        return MobiPIUpdate;
    }

    public void setMobiPIUpdate(String MobiPIUpdate) {
        this.MobiPIUpdate = MobiPIUpdate;
    }

    public String getMOBillingAuthenticationDomain() {
        return MOBillingAuthenticationDomain;
    }

    public void setMOBillingAuthenticationDomain(String MOBillingAuthenticationDomain) {
        this.MOBillingAuthenticationDomain = MOBillingAuthenticationDomain;
    }

    public String getMOIdentification() {
        return MOIdentification;
    }

    public void setMOIdentification(String MOIdentification) {
        this.MOIdentification = MOIdentification;
    }

    public String getMOConfiguration() {
        return MOConfiguration;
    }

    public void setMOConfiguration(String MOConfiguration) {
        this.MOConfiguration = MOConfiguration;
    }

    public String getMOConfigVersions() {
        return MOConfigVersions;
    }

    public void setMOConfigVersions(String MOConfigVersions) {
        this.MOConfigVersions = MOConfigVersions;
    }

    public String getMOPicksPage() {
        return MOPicksPage;
    }

    public void setMOPicksPage(String MOPicksPage) {
        this.MOPicksPage = MOPicksPage;
    }

    public String getMSAProfilePicture() {
        return MSAProfilePicture;
    }

    public void setMSAProfilePicture(String MSAProfilePicture) {
        this.MSAProfilePicture = MSAProfilePicture;
    }

    public String getMSAProviderScope() {
        return MSAProviderScope;
    }

    public void setMSAProviderScope(String MSAProviderScope) {
        this.MSAProviderScope = MSAProviderScope;
    }

    public String getNavChrome() {
        return NavChrome;
    }

    public void setNavChrome(String NavChrome) {
        this.NavChrome = NavChrome;
    }

    public String getNavItems() {
        return NavItems;
    }

    public void setNavItems(String NavItems) {
        this.NavItems = NavItems;
    }

    public String getOemIdentification() {
        return OemIdentification;
    }

    public void setOemIdentification(String OemIdentification) {
        this.OemIdentification = OemIdentification;
    }

    public String getOEMPicksPage() {
        return OEMPicksPage;
    }

    public void setOEMPicksPage(String OEMPicksPage) {
        this.OEMPicksPage = OEMPicksPage;
    }

    public String getOneStoreAuthenticationDomain() {
        return OneStoreAuthenticationDomain;
    }

    public void setOneStoreAuthenticationDomain(String OneStoreAuthenticationDomain) {
        this.OneStoreAuthenticationDomain = OneStoreAuthenticationDomain;
    }

    public String getOneStoreAuthenticationPolicy() {
        return OneStoreAuthenticationPolicy;
    }

    public void setOneStoreAuthenticationPolicy(String OneStoreAuthenticationPolicy) {
        this.OneStoreAuthenticationPolicy = OneStoreAuthenticationPolicy;
    }

    public String getPaymentInstrumentsGetProfilePath() {
        return PaymentInstrumentsGetProfilePath;
    }

    public void setPaymentInstrumentsGetProfilePath(String PaymentInstrumentsGetProfilePath) {
        this.PaymentInstrumentsGetProfilePath = PaymentInstrumentsGetProfilePath;
    }

    public String getPaymentInstrumentsAccountAddressesPath() {
        return PaymentInstrumentsAccountAddressesPath;
    }

    public void setPaymentInstrumentsAccountAddressesPath(String PaymentInstrumentsAccountAddressesPath) {
        this.PaymentInstrumentsAccountAddressesPath = PaymentInstrumentsAccountAddressesPath;
    }

    public String getProductDetails() {
        return ProductDetails;
    }

    public void setProductDetails(String ProductDetails) {
        this.ProductDetails = ProductDetails;
    }

    public String getProductDetailsBySku() {
        return ProductDetailsBySku;
    }

    public void setProductDetailsBySku(String ProductDetailsBySku) {
        this.ProductDetailsBySku = ProductDetailsBySku;
    }

    public String getProductDetailsPage() {
        return ProductDetailsPage;
    }

    public void setProductDetailsPage(String ProductDetailsPage) {
        this.ProductDetailsPage = ProductDetailsPage;
    }

    public String getProductRatingsAndReview() {
        return ProductRatingsAndReview;
    }

    public void setProductRatingsAndReview(String ProductRatingsAndReview) {
        this.ProductRatingsAndReview = ProductRatingsAndReview;
    }

    public String getProductRatingsFiltered() {
        return ProductRatingsFiltered;
    }

    public void setProductRatingsFiltered(String ProductRatingsFiltered) {
        this.ProductRatingsFiltered = ProductRatingsFiltered;
    }

    public String getPurchase() {
        return Purchase;
    }

    public void setPurchase(String Purchase) {
        this.Purchase = Purchase;
    }

    public String getRelatedItems() {
        return RelatedItems;
    }

    public void setRelatedItems(String RelatedItems) {
        this.RelatedItems = RelatedItems;
    }

    public String getReportReviewConcern() {
        return ReportReviewConcern;
    }

    public void setReportReviewConcern(String ReportReviewConcern) {
        this.ReportReviewConcern = ReportReviewConcern;
    }

    public String getReportReviewResponseConcern() {
        return ReportReviewResponseConcern;
    }

    public void setReportReviewResponseConcern(String ReportReviewResponseConcern) {
        this.ReportReviewResponseConcern = ReportReviewResponseConcern;
    }

    public String getSearchAutoSuggest() {
        return SearchAutoSuggest;
    }

    public void setSearchAutoSuggest(String SearchAutoSuggest) {
        this.SearchAutoSuggest = SearchAutoSuggest;
    }

    public String getSearchAutoSuggestV5() {
        return SearchAutoSuggestV5;
    }

    public void setSearchAutoSuggestV5(String SearchAutoSuggestV5) {
        this.SearchAutoSuggestV5 = SearchAutoSuggestV5;
    }

    public String getSearchByExtensionPage() {
        return SearchByExtensionPage;
    }

    public void setSearchByExtensionPage(String SearchByExtensionPage) {
        this.SearchByExtensionPage = SearchByExtensionPage;
    }

    public String getSearchByName() {
        return SearchByName;
    }

    public void setSearchByName(String SearchByName) {
        this.SearchByName = SearchByName;
    }

    public String getSearchByProtocolPage() {
        return SearchByProtocolPage;
    }

    public void setSearchByProtocolPage(String SearchByProtocolPage) {
        this.SearchByProtocolPage = SearchByProtocolPage;
    }

    public String getSearchByPublisherPage() {
        return SearchByPublisherPage;
    }

    public void setSearchByPublisherPage(String SearchByPublisherPage) {
        this.SearchByPublisherPage = SearchByPublisherPage;
    }

    public String getSearchByTagsPage() {
        return SearchByTagsPage;
    }

    public void setSearchByTagsPage(String SearchByTagsPage) {
        this.SearchByTagsPage = SearchByTagsPage;
    }

    public String getSearchCommandTarget() {
        return SearchCommandTarget;
    }

    public void setSearchCommandTarget(String SearchCommandTarget) {
        this.SearchCommandTarget = SearchCommandTarget;
    }

    public String getSearchPage() {
        return SearchPage;
    }

    public void setSearchPage(String SearchPage) {
        this.SearchPage = SearchPage;
    }

    public String getShareProductLink() {
        return ShareProductLink;
    }

    public void setShareProductLink(String ShareProductLink) {
        this.ShareProductLink = ShareProductLink;
    }

    public String getStoreEnvironment() {
        return StoreEnvironment;
    }

    public void setStoreEnvironment(String StoreEnvironment) {
        this.StoreEnvironment = StoreEnvironment;
    }

    public String getSubmitHelpfulnessVote() {
        return SubmitHelpfulnessVote;
    }

    public void setSubmitHelpfulnessVote(String SubmitHelpfulnessVote) {
        this.SubmitHelpfulnessVote = SubmitHelpfulnessVote;
    }

    public String getSubmitRating() {
        return SubmitRating;
    }

    public void setSubmitRating(String SubmitRating) {
        this.SubmitRating = SubmitRating;
    }

    public String getSubmitReview() {
        return SubmitReview;
    }

    public void setSubmitReview(String SubmitReview) {
        this.SubmitReview = SubmitReview;
    }

    public String getTermsOfUseWindows() {
        return TermsOfUseWindows;
    }

    public void setTermsOfUseWindows(String TermsOfUseWindows) {
        this.TermsOfUseWindows = TermsOfUseWindows;
    }

    public String getTermsOfUseWindowsPhone() {
        return TermsOfUseWindowsPhone;
    }

    public void setTermsOfUseWindowsPhone(String TermsOfUseWindowsPhone) {
        this.TermsOfUseWindowsPhone = TermsOfUseWindowsPhone;
    }

    public String getTermsOfUseXboxLive() {
        return TermsOfUseXboxLive;
    }

    public void setTermsOfUseXboxLive(String TermsOfUseXboxLive) {
        this.TermsOfUseXboxLive = TermsOfUseXboxLive;
    }

    public String getWebBlend() {
        return WebBlend;
    }

    public void setWebBlend(String WebBlend) {
        this.WebBlend = WebBlend;
    }

    public String getWebBlend2() {
        return WebBlend2;
    }

    public void setWebBlend2(String WebBlend2) {
        this.WebBlend2 = WebBlend2;
    }

    public String getWebBlendHost() {
        return WebBlendHost;
    }

    public void setWebBlendHost(String WebBlendHost) {
        this.WebBlendHost = WebBlendHost;
    }

    public String getXboxLiveAuthenticationDomain() {
        return XboxLiveAuthenticationDomain;
    }

    public void setXboxLiveAuthenticationDomain(String XboxLiveAuthenticationDomain) {
        this.XboxLiveAuthenticationDomain = XboxLiveAuthenticationDomain;
    }
}
