package com.stripe.android.view;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.view.CardInputWidget;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: CardInputWidgetPlacement.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b;\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b&\b\u0081\b\u0018\u0000 x2\u00020\u0001:\u0001xB§\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010=\u001a\u00020\u00032\u0006\u0010>\u001a\u00020?H\u0000¢\u0006\u0002\b@J\u0015\u0010A\u001a\u00020\u00032\u0006\u0010>\u001a\u00020?H\u0000¢\u0006\u0002\bBJ\u0015\u0010C\u001a\u00020\u00032\u0006\u0010>\u001a\u00020?H\u0000¢\u0006\u0002\bDJ\u0010\u0010E\u001a\u00020\u00032\u0006\u0010F\u001a\u00020\u0003H\u0002J-\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020?2\u0006\u0010J\u001a\u00020?2\u0006\u0010K\u001a\u00020\u00032\u0006\u0010L\u001a\u00020\u0003H\u0000¢\u0006\u0002\bMJ/\u0010N\u001a\u0004\u0018\u00010O2\u0006\u0010P\u001a\u00020\u00032\u0006\u0010K\u001a\u00020\u00032\u0006\u0010I\u001a\u00020?2\u0006\u0010J\u001a\u00020?H\u0000¢\u0006\u0002\bQJ\b\u0010R\u001a\u00020SH\u0016J\u000e\u0010T\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\bUJ\u000e\u0010V\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\bWJ\u000e\u0010X\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\bYJ\u000e\u0010Z\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b[J\u000e\u0010\\\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b]J\u000e\u0010^\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b_J\u000e\u0010`\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\baJ\u000e\u0010b\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\bcJ\u000e\u0010d\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\beJ\u000e\u0010f\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\bgJ\u000e\u0010h\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\biJ\u000e\u0010j\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\bkJ\u000e\u0010l\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\bmJ\u000e\u0010n\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\boJ\u000e\u0010p\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\bqJ\u000e\u0010r\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\bsJ©\u0001\u0010t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u0003HÆ\u0001J\u0013\u0010u\u001a\u00020?2\b\u0010v\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010w\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018R\u001a\u0010\b\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010\u0018R\u001a\u0010\t\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u0018R\u001a\u0010\n\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0016\"\u0004\b&\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0016\"\u0004\b(\u0010\u0018R\u001a\u0010\f\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0016\"\u0004\b*\u0010\u0018R\u001a\u0010\r\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0016\"\u0004\b,\u0010\u0018R\u001a\u0010\u000e\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0016\"\u0004\b.\u0010\u0018R\u001a\u0010\u000f\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0016\"\u0004\b0\u0010\u0018R\u001a\u0010\u0010\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0016\"\u0004\b2\u0010\u0018R\u001a\u0010\u0011\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0016\"\u0004\b4\u0010\u0018R\u001a\u0010\u0012\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0016\"\u0004\b6\u0010\u0018R\u0014\u00107\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u0010\u0016R\u0014\u00109\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010\u0016R\u0014\u0010;\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\u0016¨\u0006y"}, d2 = {"Lcom/stripe/android/view/CardInputWidgetPlacement;", "", "totalLengthInPixels", "", "cardWidth", "hiddenCardWidth", "peekCardWidth", "cardDateSeparation", "dateWidth", "dateCvcSeparation", "cvcWidth", "cvcPostalCodeSeparation", "postalCodeWidth", "cardTouchBufferLimit", "dateStartPosition", "dateEndTouchBufferLimit", "cvcStartPosition", "cvcEndTouchBufferLimit", "postalCodeStartPosition", "<init>", "(IIIIIIIIIIIIIIII)V", "getTotalLengthInPixels$payments_core_release", "()I", "setTotalLengthInPixels$payments_core_release", "(I)V", "getCardWidth$payments_core_release", "setCardWidth$payments_core_release", "getHiddenCardWidth$payments_core_release", "setHiddenCardWidth$payments_core_release", "getPeekCardWidth$payments_core_release", "setPeekCardWidth$payments_core_release", "getCardDateSeparation$payments_core_release", "setCardDateSeparation$payments_core_release", "getDateWidth$payments_core_release", "setDateWidth$payments_core_release", "getDateCvcSeparation$payments_core_release", "setDateCvcSeparation$payments_core_release", "getCvcWidth$payments_core_release", "setCvcWidth$payments_core_release", "getCvcPostalCodeSeparation$payments_core_release", "setCvcPostalCodeSeparation$payments_core_release", "getPostalCodeWidth$payments_core_release", "setPostalCodeWidth$payments_core_release", "getCardTouchBufferLimit$payments_core_release", "setCardTouchBufferLimit$payments_core_release", "getDateStartPosition$payments_core_release", "setDateStartPosition$payments_core_release", "getDateEndTouchBufferLimit$payments_core_release", "setDateEndTouchBufferLimit$payments_core_release", "getCvcStartPosition$payments_core_release", "setCvcStartPosition$payments_core_release", "getCvcEndTouchBufferLimit$payments_core_release", "setCvcEndTouchBufferLimit$payments_core_release", "getPostalCodeStartPosition$payments_core_release", "setPostalCodeStartPosition$payments_core_release", "cardPeekDateStartMargin", "getCardPeekDateStartMargin", "cardPeekCvcStartMargin", "getCardPeekCvcStartMargin", "cardPeekPostalCodeStartMargin", "getCardPeekPostalCodeStartMargin", "getDateStartMargin", "isFullCard", "", "getDateStartMargin$payments_core_release", "getCvcStartMargin", "getCvcStartMargin$payments_core_release", "getPostalCodeStartMargin", "getPostalCodeStartMargin$payments_core_release", "toMinimalValueIfNegative", "value", "updateSpacing", "", "isShowingFullCard", "postalCodeEnabled", "frameStart", "frameWidth", "updateSpacing$payments_core_release", "getFocusField", "Lcom/stripe/android/view/CardInputWidget$Field;", "touchX", "getFocusField$payments_core_release", InAppPurchaseConstants.METHOD_TO_STRING, "", "component1", "component1$payments_core_release", "component2", "component2$payments_core_release", "component3", "component3$payments_core_release", "component4", "component4$payments_core_release", "component5", "component5$payments_core_release", "component6", "component6$payments_core_release", "component7", "component7$payments_core_release", "component8", "component8$payments_core_release", "component9", "component9$payments_core_release", "component10", "component10$payments_core_release", "component11", "component11$payments_core_release", "component12", "component12$payments_core_release", "component13", "component13$payments_core_release", "component14", "component14$payments_core_release", "component15", "component15$payments_core_release", "component16", "component16$payments_core_release", "copy", "equals", "other", "hashCode", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CardInputWidgetPlacement {

    @Deprecated
    public static final int MIN_SEPARATION_IN_PX = 10;
    private int cardDateSeparation;
    private int cardTouchBufferLimit;
    private int cardWidth;
    private int cvcEndTouchBufferLimit;
    private int cvcPostalCodeSeparation;
    private int cvcStartPosition;
    private int cvcWidth;
    private int dateCvcSeparation;
    private int dateEndTouchBufferLimit;
    private int dateStartPosition;
    private int dateWidth;
    private int hiddenCardWidth;
    private int peekCardWidth;
    private int postalCodeStartPosition;
    private int postalCodeWidth;
    private int totalLengthInPixels;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public CardInputWidgetPlacement() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 65535, null);
    }

    public static /* synthetic */ CardInputWidgetPlacement copy$default(CardInputWidgetPlacement cardInputWidgetPlacement, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, Object obj) {
        int i18 = (i17 & 1) != 0 ? cardInputWidgetPlacement.totalLengthInPixels : i;
        return cardInputWidgetPlacement.copy(i18, (i17 & 2) != 0 ? cardInputWidgetPlacement.cardWidth : i2, (i17 & 4) != 0 ? cardInputWidgetPlacement.hiddenCardWidth : i3, (i17 & 8) != 0 ? cardInputWidgetPlacement.peekCardWidth : i4, (i17 & 16) != 0 ? cardInputWidgetPlacement.cardDateSeparation : i5, (i17 & 32) != 0 ? cardInputWidgetPlacement.dateWidth : i6, (i17 & 64) != 0 ? cardInputWidgetPlacement.dateCvcSeparation : i7, (i17 & 128) != 0 ? cardInputWidgetPlacement.cvcWidth : i8, (i17 & 256) != 0 ? cardInputWidgetPlacement.cvcPostalCodeSeparation : i9, (i17 & 512) != 0 ? cardInputWidgetPlacement.postalCodeWidth : i10, (i17 & 1024) != 0 ? cardInputWidgetPlacement.cardTouchBufferLimit : i11, (i17 & 2048) != 0 ? cardInputWidgetPlacement.dateStartPosition : i12, (i17 & 4096) != 0 ? cardInputWidgetPlacement.dateEndTouchBufferLimit : i13, (i17 & 8192) != 0 ? cardInputWidgetPlacement.cvcStartPosition : i14, (i17 & 16384) != 0 ? cardInputWidgetPlacement.cvcEndTouchBufferLimit : i15, (i17 & 32768) != 0 ? cardInputWidgetPlacement.postalCodeStartPosition : i16);
    }

    private final int toMinimalValueIfNegative(int value) {
        if (value >= 0) {
            return value;
        }
        return 10;
    }

    /* renamed from: component1$payments_core_release, reason: from getter */
    public final int getTotalLengthInPixels() {
        return this.totalLengthInPixels;
    }

    /* renamed from: component10$payments_core_release, reason: from getter */
    public final int getPostalCodeWidth() {
        return this.postalCodeWidth;
    }

    /* renamed from: component11$payments_core_release, reason: from getter */
    public final int getCardTouchBufferLimit() {
        return this.cardTouchBufferLimit;
    }

    /* renamed from: component12$payments_core_release, reason: from getter */
    public final int getDateStartPosition() {
        return this.dateStartPosition;
    }

    /* renamed from: component13$payments_core_release, reason: from getter */
    public final int getDateEndTouchBufferLimit() {
        return this.dateEndTouchBufferLimit;
    }

    /* renamed from: component14$payments_core_release, reason: from getter */
    public final int getCvcStartPosition() {
        return this.cvcStartPosition;
    }

    /* renamed from: component15$payments_core_release, reason: from getter */
    public final int getCvcEndTouchBufferLimit() {
        return this.cvcEndTouchBufferLimit;
    }

    /* renamed from: component16$payments_core_release, reason: from getter */
    public final int getPostalCodeStartPosition() {
        return this.postalCodeStartPosition;
    }

    /* renamed from: component2$payments_core_release, reason: from getter */
    public final int getCardWidth() {
        return this.cardWidth;
    }

    /* renamed from: component3$payments_core_release, reason: from getter */
    public final int getHiddenCardWidth() {
        return this.hiddenCardWidth;
    }

    /* renamed from: component4$payments_core_release, reason: from getter */
    public final int getPeekCardWidth() {
        return this.peekCardWidth;
    }

    /* renamed from: component5$payments_core_release, reason: from getter */
    public final int getCardDateSeparation() {
        return this.cardDateSeparation;
    }

    /* renamed from: component6$payments_core_release, reason: from getter */
    public final int getDateWidth() {
        return this.dateWidth;
    }

    /* renamed from: component7$payments_core_release, reason: from getter */
    public final int getDateCvcSeparation() {
        return this.dateCvcSeparation;
    }

    /* renamed from: component8$payments_core_release, reason: from getter */
    public final int getCvcWidth() {
        return this.cvcWidth;
    }

    /* renamed from: component9$payments_core_release, reason: from getter */
    public final int getCvcPostalCodeSeparation() {
        return this.cvcPostalCodeSeparation;
    }

    public final CardInputWidgetPlacement copy(int totalLengthInPixels, int cardWidth, int hiddenCardWidth, int peekCardWidth, int cardDateSeparation, int dateWidth, int dateCvcSeparation, int cvcWidth, int cvcPostalCodeSeparation, int postalCodeWidth, int cardTouchBufferLimit, int dateStartPosition, int dateEndTouchBufferLimit, int cvcStartPosition, int cvcEndTouchBufferLimit, int postalCodeStartPosition) {
        return new CardInputWidgetPlacement(totalLengthInPixels, cardWidth, hiddenCardWidth, peekCardWidth, cardDateSeparation, dateWidth, dateCvcSeparation, cvcWidth, cvcPostalCodeSeparation, postalCodeWidth, cardTouchBufferLimit, dateStartPosition, dateEndTouchBufferLimit, cvcStartPosition, cvcEndTouchBufferLimit, postalCodeStartPosition);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardInputWidgetPlacement)) {
            return false;
        }
        CardInputWidgetPlacement cardInputWidgetPlacement = (CardInputWidgetPlacement) other;
        return this.totalLengthInPixels == cardInputWidgetPlacement.totalLengthInPixels && this.cardWidth == cardInputWidgetPlacement.cardWidth && this.hiddenCardWidth == cardInputWidgetPlacement.hiddenCardWidth && this.peekCardWidth == cardInputWidgetPlacement.peekCardWidth && this.cardDateSeparation == cardInputWidgetPlacement.cardDateSeparation && this.dateWidth == cardInputWidgetPlacement.dateWidth && this.dateCvcSeparation == cardInputWidgetPlacement.dateCvcSeparation && this.cvcWidth == cardInputWidgetPlacement.cvcWidth && this.cvcPostalCodeSeparation == cardInputWidgetPlacement.cvcPostalCodeSeparation && this.postalCodeWidth == cardInputWidgetPlacement.postalCodeWidth && this.cardTouchBufferLimit == cardInputWidgetPlacement.cardTouchBufferLimit && this.dateStartPosition == cardInputWidgetPlacement.dateStartPosition && this.dateEndTouchBufferLimit == cardInputWidgetPlacement.dateEndTouchBufferLimit && this.cvcStartPosition == cardInputWidgetPlacement.cvcStartPosition && this.cvcEndTouchBufferLimit == cardInputWidgetPlacement.cvcEndTouchBufferLimit && this.postalCodeStartPosition == cardInputWidgetPlacement.postalCodeStartPosition;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((Integer.hashCode(this.totalLengthInPixels) * 31) + Integer.hashCode(this.cardWidth)) * 31) + Integer.hashCode(this.hiddenCardWidth)) * 31) + Integer.hashCode(this.peekCardWidth)) * 31) + Integer.hashCode(this.cardDateSeparation)) * 31) + Integer.hashCode(this.dateWidth)) * 31) + Integer.hashCode(this.dateCvcSeparation)) * 31) + Integer.hashCode(this.cvcWidth)) * 31) + Integer.hashCode(this.cvcPostalCodeSeparation)) * 31) + Integer.hashCode(this.postalCodeWidth)) * 31) + Integer.hashCode(this.cardTouchBufferLimit)) * 31) + Integer.hashCode(this.dateStartPosition)) * 31) + Integer.hashCode(this.dateEndTouchBufferLimit)) * 31) + Integer.hashCode(this.cvcStartPosition)) * 31) + Integer.hashCode(this.cvcEndTouchBufferLimit)) * 31) + Integer.hashCode(this.postalCodeStartPosition);
    }

    public CardInputWidgetPlacement(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.totalLengthInPixels = i;
        this.cardWidth = i2;
        this.hiddenCardWidth = i3;
        this.peekCardWidth = i4;
        this.cardDateSeparation = i5;
        this.dateWidth = i6;
        this.dateCvcSeparation = i7;
        this.cvcWidth = i8;
        this.cvcPostalCodeSeparation = i9;
        this.postalCodeWidth = i10;
        this.cardTouchBufferLimit = i11;
        this.dateStartPosition = i12;
        this.dateEndTouchBufferLimit = i13;
        this.cvcStartPosition = i14;
        this.cvcEndTouchBufferLimit = i15;
        this.postalCodeStartPosition = i16;
    }

    public /* synthetic */ CardInputWidgetPlacement(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        this((i17 & 1) != 0 ? 0 : i, (i17 & 2) != 0 ? 0 : i2, (i17 & 4) != 0 ? 0 : i3, (i17 & 8) != 0 ? 0 : i4, (i17 & 16) != 0 ? 0 : i5, (i17 & 32) != 0 ? 0 : i6, (i17 & 64) != 0 ? 0 : i7, (i17 & 128) != 0 ? 0 : i8, (i17 & 256) != 0 ? 0 : i9, (i17 & 512) != 0 ? 0 : i10, (i17 & 1024) != 0 ? 0 : i11, (i17 & 2048) != 0 ? 0 : i12, (i17 & 4096) != 0 ? 0 : i13, (i17 & 8192) != 0 ? 0 : i14, (i17 & 16384) != 0 ? 0 : i15, (i17 & 32768) != 0 ? 0 : i16);
    }

    public final int getTotalLengthInPixels$payments_core_release() {
        return this.totalLengthInPixels;
    }

    public final void setTotalLengthInPixels$payments_core_release(int i) {
        this.totalLengthInPixels = i;
    }

    public final int getCardWidth$payments_core_release() {
        return this.cardWidth;
    }

    public final void setCardWidth$payments_core_release(int i) {
        this.cardWidth = i;
    }

    public final int getHiddenCardWidth$payments_core_release() {
        return this.hiddenCardWidth;
    }

    public final void setHiddenCardWidth$payments_core_release(int i) {
        this.hiddenCardWidth = i;
    }

    public final int getPeekCardWidth$payments_core_release() {
        return this.peekCardWidth;
    }

    public final void setPeekCardWidth$payments_core_release(int i) {
        this.peekCardWidth = i;
    }

    public final int getCardDateSeparation$payments_core_release() {
        return this.cardDateSeparation;
    }

    public final void setCardDateSeparation$payments_core_release(int i) {
        this.cardDateSeparation = i;
    }

    public final int getDateWidth$payments_core_release() {
        return this.dateWidth;
    }

    public final void setDateWidth$payments_core_release(int i) {
        this.dateWidth = i;
    }

    public final int getDateCvcSeparation$payments_core_release() {
        return this.dateCvcSeparation;
    }

    public final void setDateCvcSeparation$payments_core_release(int i) {
        this.dateCvcSeparation = i;
    }

    public final int getCvcWidth$payments_core_release() {
        return this.cvcWidth;
    }

    public final void setCvcWidth$payments_core_release(int i) {
        this.cvcWidth = i;
    }

    public final int getCvcPostalCodeSeparation$payments_core_release() {
        return this.cvcPostalCodeSeparation;
    }

    public final void setCvcPostalCodeSeparation$payments_core_release(int i) {
        this.cvcPostalCodeSeparation = i;
    }

    public final int getPostalCodeWidth$payments_core_release() {
        return this.postalCodeWidth;
    }

    public final void setPostalCodeWidth$payments_core_release(int i) {
        this.postalCodeWidth = i;
    }

    public final int getCardTouchBufferLimit$payments_core_release() {
        return this.cardTouchBufferLimit;
    }

    public final void setCardTouchBufferLimit$payments_core_release(int i) {
        this.cardTouchBufferLimit = i;
    }

    public final int getDateStartPosition$payments_core_release() {
        return this.dateStartPosition;
    }

    public final void setDateStartPosition$payments_core_release(int i) {
        this.dateStartPosition = i;
    }

    public final int getDateEndTouchBufferLimit$payments_core_release() {
        return this.dateEndTouchBufferLimit;
    }

    public final void setDateEndTouchBufferLimit$payments_core_release(int i) {
        this.dateEndTouchBufferLimit = i;
    }

    public final int getCvcStartPosition$payments_core_release() {
        return this.cvcStartPosition;
    }

    public final void setCvcStartPosition$payments_core_release(int i) {
        this.cvcStartPosition = i;
    }

    public final int getCvcEndTouchBufferLimit$payments_core_release() {
        return this.cvcEndTouchBufferLimit;
    }

    public final void setCvcEndTouchBufferLimit$payments_core_release(int i) {
        this.cvcEndTouchBufferLimit = i;
    }

    public final int getPostalCodeStartPosition$payments_core_release() {
        return this.postalCodeStartPosition;
    }

    public final void setPostalCodeStartPosition$payments_core_release(int i) {
        this.postalCodeStartPosition = i;
    }

    private final /* synthetic */ int getCardPeekDateStartMargin() {
        return this.peekCardWidth + this.cardDateSeparation;
    }

    private final /* synthetic */ int getCardPeekCvcStartMargin() {
        return getCardPeekDateStartMargin() + this.dateWidth + this.dateCvcSeparation;
    }

    private final /* synthetic */ int getCardPeekPostalCodeStartMargin() {
        return getCardPeekCvcStartMargin() + this.cvcWidth + this.cvcPostalCodeSeparation;
    }

    public final /* synthetic */ int getDateStartMargin$payments_core_release(boolean isFullCard) {
        if (isFullCard) {
            return this.cardWidth + this.cardDateSeparation;
        }
        return getCardPeekDateStartMargin();
    }

    public final /* synthetic */ int getCvcStartMargin$payments_core_release(boolean isFullCard) {
        if (isFullCard) {
            return this.totalLengthInPixels;
        }
        return getCardPeekCvcStartMargin();
    }

    public final /* synthetic */ int getPostalCodeStartMargin$payments_core_release(boolean isFullCard) {
        if (isFullCard) {
            return this.totalLengthInPixels;
        }
        return getCardPeekPostalCodeStartMargin();
    }

    public final /* synthetic */ void updateSpacing$payments_core_release(boolean isShowingFullCard, boolean postalCodeEnabled, int frameStart, int frameWidth) {
        if (isShowingFullCard) {
            int minimalValueIfNegative = toMinimalValueIfNegative((frameWidth - this.cardWidth) - this.dateWidth);
            this.cardDateSeparation = minimalValueIfNegative;
            int i = this.cardWidth;
            this.cardTouchBufferLimit = frameStart + i + (minimalValueIfNegative / 2);
            this.dateStartPosition = frameStart + i + minimalValueIfNegative;
            return;
        }
        if (postalCodeEnabled) {
            int i2 = frameWidth * 3;
            int minimalValueIfNegative2 = toMinimalValueIfNegative(((i2 / 10) - this.peekCardWidth) - (this.dateWidth / 4));
            this.cardDateSeparation = minimalValueIfNegative2;
            int minimalValueIfNegative3 = toMinimalValueIfNegative(((((i2 / 5) - this.peekCardWidth) - minimalValueIfNegative2) - this.dateWidth) - this.cvcWidth);
            this.dateCvcSeparation = minimalValueIfNegative3;
            int minimalValueIfNegative4 = toMinimalValueIfNegative((((((frameWidth - this.peekCardWidth) - this.cardDateSeparation) - this.dateWidth) - this.cvcWidth) - minimalValueIfNegative3) - this.postalCodeWidth);
            this.cvcPostalCodeSeparation = minimalValueIfNegative4;
            int i3 = frameStart + this.peekCardWidth + this.cardDateSeparation;
            this.cardTouchBufferLimit = i3 / 3;
            this.dateStartPosition = i3;
            int i4 = i3 + this.dateWidth + this.dateCvcSeparation;
            this.dateEndTouchBufferLimit = i4 / 3;
            this.cvcStartPosition = i4;
            int i5 = i4 + this.cvcWidth + minimalValueIfNegative4;
            this.cvcEndTouchBufferLimit = i5 / 3;
            this.postalCodeStartPosition = i5;
            return;
        }
        int minimalValueIfNegative5 = toMinimalValueIfNegative(((frameWidth / 2) - this.peekCardWidth) - (this.dateWidth / 2));
        this.cardDateSeparation = minimalValueIfNegative5;
        int minimalValueIfNegative6 = toMinimalValueIfNegative((((frameWidth - this.peekCardWidth) - minimalValueIfNegative5) - this.dateWidth) - this.cvcWidth);
        this.dateCvcSeparation = minimalValueIfNegative6;
        int i6 = this.peekCardWidth;
        int i7 = this.cardDateSeparation;
        this.cardTouchBufferLimit = frameStart + i6 + (i7 / 2);
        int i8 = frameStart + i6 + i7;
        this.dateStartPosition = i8;
        int i9 = this.dateWidth;
        this.dateEndTouchBufferLimit = i8 + i9 + (minimalValueIfNegative6 / 2);
        this.cvcStartPosition = i8 + i9 + minimalValueIfNegative6;
    }

    public final CardInputWidget.Field getFocusField$payments_core_release(int touchX, int frameStart, boolean isShowingFullCard, boolean postalCodeEnabled) {
        if (isShowingFullCard) {
            if (touchX < frameStart + this.cardWidth) {
                return null;
            }
            if (touchX < this.cardTouchBufferLimit) {
                return CardInputWidget.Field.Number;
            }
            if (touchX < this.dateStartPosition) {
                return CardInputWidget.Field.Expiry;
            }
            return null;
        }
        if (postalCodeEnabled) {
            if (touchX < frameStart + this.peekCardWidth) {
                return null;
            }
            if (touchX < this.cardTouchBufferLimit) {
                return CardInputWidget.Field.Number;
            }
            int i = this.dateStartPosition;
            if (touchX < i) {
                return CardInputWidget.Field.Expiry;
            }
            if (touchX < i + this.dateWidth) {
                return null;
            }
            if (touchX < this.dateEndTouchBufferLimit) {
                return CardInputWidget.Field.Expiry;
            }
            int i2 = this.cvcStartPosition;
            if (touchX < i2) {
                return CardInputWidget.Field.Cvc;
            }
            if (touchX < i2 + this.cvcWidth) {
                return null;
            }
            if (touchX < this.cvcEndTouchBufferLimit) {
                return CardInputWidget.Field.Cvc;
            }
            if (touchX < this.postalCodeStartPosition) {
                return CardInputWidget.Field.PostalCode;
            }
            return null;
        }
        if (touchX < frameStart + this.peekCardWidth) {
            return null;
        }
        if (touchX < this.cardTouchBufferLimit) {
            return CardInputWidget.Field.Number;
        }
        int i3 = this.dateStartPosition;
        if (touchX < i3) {
            return CardInputWidget.Field.Expiry;
        }
        if (touchX < i3 + this.dateWidth) {
            return null;
        }
        if (touchX < this.dateEndTouchBufferLimit) {
            return CardInputWidget.Field.Expiry;
        }
        if (touchX < this.cvcStartPosition) {
            return CardInputWidget.Field.Cvc;
        }
        return null;
    }

    public String toString() {
        return ("\n            TotalLengthInPixels = " + this.totalLengthInPixels + "\n            CardWidth = " + this.cardWidth + "\n            HiddenCardWidth = " + this.hiddenCardWidth + "\n            PeekCardWidth = " + this.peekCardWidth + "\n            CardDateSeparation = " + this.cardDateSeparation + "\n            DateWidth = " + this.dateWidth + "\n            DateCvcSeparation = " + this.dateCvcSeparation + "\n            CvcWidth = " + this.cvcWidth + "\n            CvcPostalCodeSeparation = " + this.cvcPostalCodeSeparation + "\n            PostalCodeWidth: " + this.postalCodeWidth + "\n            ") + ("\n            Touch Buffer Data:\n            CardTouchBufferLimit = " + this.cardTouchBufferLimit + "\n            DateStartPosition = " + this.dateStartPosition + "\n            DateEndTouchBufferLimit = " + this.dateEndTouchBufferLimit + "\n            CvcStartPosition = " + this.cvcStartPosition + "\n            CvcEndTouchBufferLimit = " + this.cvcEndTouchBufferLimit + "\n            PostalCodeStartPosition = " + this.postalCodeStartPosition + "\n            ");
    }

    /* compiled from: CardInputWidgetPlacement.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/view/CardInputWidgetPlacement$Companion;", "", "<init>", "()V", "MIN_SEPARATION_IN_PX", "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
