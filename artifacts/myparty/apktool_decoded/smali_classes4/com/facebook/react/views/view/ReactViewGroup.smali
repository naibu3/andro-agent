.class public Lcom/facebook/react/views/view/ReactViewGroup;
.super Landroid/view/ViewGroup;
.source "ReactViewGroup.kt"

# interfaces
.implements Lcom/facebook/react/touch/ReactInterceptingViewGroup;
.implements Lcom/facebook/react/uimanager/ReactClippingViewGroup;
.implements Lcom/facebook/react/uimanager/ReactPointerEventsView;
.implements Lcom/facebook/react/touch/ReactHitSlopView;
.implements Lcom/facebook/react/uimanager/ReactZIndexedViewGroup;
.implements Lcom/facebook/react/uimanager/ReactOverflowViewWithInset;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/views/view/ReactViewGroup$ChildrenLayoutChangeListener;,
        Lcom/facebook/react/views/view/ReactViewGroup$Companion;,
        Lcom/facebook/react/views/view/ReactViewGroup$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nReactViewGroup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactViewGroup.kt\ncom/facebook/react/views/view/ReactViewGroup\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1015:1\n1#2:1016\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00de\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\"\n\u0002\u0008-\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0016\u0018\u0000 \u00bf\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0004\u00be\u0001\u00bf\u0001B\u0011\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0008\u0010;\u001a\u00020<H\u0002J\r\u0010=\u001a\u00020<H\u0010\u00a2\u0006\u0002\u0008>J\u0018\u0010D\u001a\u00020<2\u0006\u0010E\u001a\u00020\u00112\u0006\u0010F\u001a\u00020\u0011H\u0014J0\u0010G\u001a\u00020<2\u0006\u0010H\u001a\u00020\u00132\u0006\u0010I\u001a\u00020\u00112\u0006\u0010J\u001a\u00020\u00112\u0006\u0010K\u001a\u00020\u00112\u0006\u0010L\u001a\u00020\u0011H\u0014J\u0008\u0010M\u001a\u00020<H\u0017J\u0010\u0010N\u001a\u00020<2\u0006\u0010O\u001a\u00020PH\u0017J\u0010\u0010Q\u001a\u00020<2\u0006\u0010R\u001a\u00020\u0011H\u0016J\u0012\u0010S\u001a\u00020<2\u0008\u0010T\u001a\u0004\u0018\u00010UH\u0007J\u0010\u0010V\u001a\u00020<2\u0006\u0010W\u001a\u000202H\u0016J\u0010\u0010X\u001a\u00020\u00132\u0006\u0010Y\u001a\u00020ZH\u0016J\u0010\u0010[\u001a\u00020\u00132\u0006\u0010Y\u001a\u00020ZH\u0016J\u0010\u0010\\\u001a\u00020\u00132\u0006\u0010Y\u001a\u00020ZH\u0016J\u0010\u0010]\u001a\u00020\u00132\u0006\u0010^\u001a\u00020ZH\u0016J\u0008\u0010_\u001a\u00020\u0013H\u0016J\u000e\u0010`\u001a\u00020<2\u0006\u00103\u001a\u00020\u0013J\u0016\u0010a\u001a\u00020<2\u0006\u0010b\u001a\u00020\u00112\u0006\u0010c\u001a\u000205J\u001d\u0010d\u001a\u00020<2\u0006\u0010b\u001a\u00020\u00112\u0008\u0010R\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0002\u0010eJ\u0010\u0010f\u001a\u00020<2\u0006\u0010g\u001a\u000205H\u0007J\u0018\u0010f\u001a\u00020<2\u0006\u0010g\u001a\u0002052\u0006\u0010b\u001a\u00020\u0011H\u0007J\u0018\u0010f\u001a\u00020<2\u0006\u0010h\u001a\u00020i2\u0008\u0010g\u001a\u0004\u0018\u00010jJ\u0010\u0010k\u001a\u00020<2\u0008\u0010l\u001a\u0004\u0018\u00010*J\u0010\u0010s\u001a\u00020<2\u0006\u0010t\u001a\u00020\rH\u0016J\u0008\u0010u\u001a\u00020<H\u0016J\u0018\u0010u\u001a\u00020<2\u000e\u0010v\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010wH\u0016J\u0010\u0010x\u001a\u00020<2\u0006\u0010y\u001a\u00020\u0017H\u0016J\u0010\u0010z\u001a\u00020<2\u0006\u0010{\u001a\u00020\u0011H\u0002J\u0010\u0010|\u001a\u00020\u00132\u0006\u0010}\u001a\u00020\u0017H\u0002J\"\u0010~\u001a\u00020<2\u0006\u0010\u001d\u001a\u00020\r2\u0010\u0008\u0002\u0010\u007f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010wH\u0002J5\u0010\u0080\u0001\u001a\u00020<2\u0006\u0010\u001d\u001a\u00020\r2\u0007\u0010\u0081\u0001\u001a\u00020\u00112\u0007\u0010\u0082\u0001\u001a\u00020\u00112\u0010\u0008\u0002\u0010\u007f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010wH\u0002J\u0012\u0010\u0080\u0001\u001a\u00020<2\u0007\u0010\u0083\u0001\u001a\u00020\u0017H\u0002J-\u0010\u0084\u0001\u001a\u00020<2\u0007\u0010\u0085\u0001\u001a\u00020\u00112\u0007\u0010\u0086\u0001\u001a\u00020\u00112\u0007\u0010\u0087\u0001\u001a\u00020\u00112\u0007\u0010\u0088\u0001\u001a\u00020\u0011H\u0014J\t\u0010\u0089\u0001\u001a\u00020<H\u0014J\t\u0010\u008a\u0001\u001a\u00020\u0013H\u0002J\u0011\u0010\u008b\u0001\u001a\u00020<2\u0006\u0010}\u001a\u00020\u0017H\u0016J\u0011\u0010\u008c\u0001\u001a\u00020<2\u0006\u0010}\u001a\u00020\u0017H\u0016J\u001a\u0010\u008d\u0001\u001a\u00020<2\u0006\u0010}\u001a\u00020\u00172\u0007\u0010\u008e\u0001\u001a\u00020\u0013H\u0002J\u001b\u0010\u008f\u0001\u001a\u00020\u00112\u0007\u0010\u0090\u0001\u001a\u00020\u00112\u0007\u0010\u0091\u0001\u001a\u00020\u0011H\u0014J\u0012\u0010\u0092\u0001\u001a\u00020\u00112\u0007\u0010\u0091\u0001\u001a\u00020\u0011H\u0016J\t\u0010\u0093\u0001\u001a\u00020<H\u0016J\u0012\u0010\u0094\u0001\u001a\u00020<2\u0007\u0010\u0095\u0001\u001a\u00020\u0013H\u0014J\t\u0010\u0096\u0001\u001a\u00020<H\u0002J\u001a\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u00172\u0007\u0010\u0091\u0001\u001a\u00020\u0011H\u0000\u00a2\u0006\u0003\u0008\u0098\u0001J \u0010\u0099\u0001\u001a\u00020<2\u0006\u0010}\u001a\u00020\u00172\u0007\u0010\u0091\u0001\u001a\u00020\u0011H\u0000\u00a2\u0006\u0003\u0008\u009a\u0001J\u0017\u0010\u009b\u0001\u001a\u00020<2\u0006\u0010y\u001a\u00020\u0017H\u0000\u00a2\u0006\u0003\u0008\u009c\u0001J\u000f\u0010\u009d\u0001\u001a\u00020<H\u0000\u00a2\u0006\u0003\u0008\u009e\u0001J$\u0010\u009f\u0001\u001a\u00020\u00132\u0008\u0010y\u001a\u0004\u0018\u00010\u00172\t\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0011H\u0002\u00a2\u0006\u0003\u0010\u00a0\u0001J\u0011\u0010\u00a1\u0001\u001a\u00020\u00112\u0006\u0010}\u001a\u00020\u0017H\u0002J\u001a\u0010\u00a2\u0001\u001a\u00020<2\u0006\u0010}\u001a\u00020\u00172\u0007\u0010\u0091\u0001\u001a\u00020\u0011H\u0002J\u0012\u0010\u00a3\u0001\u001a\u00020<2\u0007\u0010\u0091\u0001\u001a\u00020\u0011H\u0002J)\u0010\u00ab\u0001\u001a\u00020<2\u0006\u0010I\u001a\u00020\u00112\u0006\u0010J\u001a\u00020\u00112\u0006\u0010K\u001a\u00020\u00112\u0006\u0010L\u001a\u00020\u0011H\u0016J\u0014\u0010\u00ac\u0001\u001a\u00020<2\t\u0010\u00ad\u0001\u001a\u0004\u0018\u00010UH\u0002J\u0013\u0010\u00ae\u0001\u001a\u00020<2\u0008\u0010\u00af\u0001\u001a\u00030\u00b0\u0001H\u0016J\u0013\u0010\u00b1\u0001\u001a\u00020<2\u0008\u0010\u00af\u0001\u001a\u00030\u00b0\u0001H\u0014J%\u0010\u00b2\u0001\u001a\u00020\u00132\u0008\u0010\u00af\u0001\u001a\u00030\u00b0\u00012\u0006\u0010}\u001a\u00020\u00172\u0008\u0010\u00b3\u0001\u001a\u00030\u00b4\u0001H\u0014J\u0010\u0010\u00b5\u0001\u001a\u00020<2\u0007\u0010\u00b6\u0001\u001a\u000205J\u0010\u0010\u00b7\u0001\u001a\u00020<2\u0007\u0010\u00b8\u0001\u001a\u00020*J\u0007\u0010\u00b9\u0001\u001a\u00020<J\u0019\u0010\u00ba\u0001\u001a\u00020<2\u000e\u0010\u00bb\u0001\u001a\t\u0012\u0004\u0012\u00020\u00170\u00bc\u0001H\u0016J\u0007\u0010\u00bd\u0001\u001a\u00020<R\u0014\u0010\u000c\u001a\u00020\rX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0018R\u001e\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0011@BX\u0080\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001cR\u0010\u0010\u001d\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\rX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001f\u0010\u000f\"\u0004\u0008 \u0010!R\u001a\u0010\"\u001a\u00020#X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008$\u0010%\"\u0004\u0008&\u0010\'R\"\u0010(\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008+\u0010,\"\u0004\u0008-\u0010.R\u0010\u0010/\u001a\u0004\u0018\u000100X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u000102X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000205X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u00107\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u000108X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00109\u001a\u0004\u0018\u00010:X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010?\u001a\u0004\u0018\u00010@X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010A\u001a\u00020@8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008B\u0010CR$\u0010n\u001a\u00020\u00132\u0006\u0010m\u001a\u00020\u00138V@VX\u0096\u000e\u00a2\u0006\u000c\u001a\u0004\u0008o\u0010p\"\u0004\u0008q\u0010rR\u0012\u0010\u00a4\u0001\u001a\u0005\u0018\u00010\u00a5\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000R.\u0010\u00a6\u0001\u001a\u0004\u0018\u00010*2\t\u0010\u00a6\u0001\u001a\u0004\u0018\u00010*8V@VX\u0096\u000e\u00a2\u0006\u0010\u001a\u0006\u0008\u00a7\u0001\u0010\u00a8\u0001\"\u0006\u0008\u00a9\u0001\u0010\u00aa\u0001\u00a8\u0006\u00c0\u0001"
    }
    d2 = {
        "Lcom/facebook/react/views/view/ReactViewGroup;",
        "Landroid/view/ViewGroup;",
        "Lcom/facebook/react/touch/ReactInterceptingViewGroup;",
        "Lcom/facebook/react/uimanager/ReactClippingViewGroup;",
        "Lcom/facebook/react/uimanager/ReactPointerEventsView;",
        "Lcom/facebook/react/touch/ReactHitSlopView;",
        "Lcom/facebook/react/uimanager/ReactZIndexedViewGroup;",
        "Lcom/facebook/react/uimanager/ReactOverflowViewWithInset;",
        "context",
        "Landroid/content/Context;",
        "<init>",
        "(Landroid/content/Context;)V",
        "overflowInset",
        "Landroid/graphics/Rect;",
        "getOverflowInset",
        "()Landroid/graphics/Rect;",
        "recycleCount",
        "",
        "_removeClippedSubviews",
        "",
        "inSubviewClippingLoop",
        "allChildren",
        "",
        "Landroid/view/View;",
        "[Landroid/view/View;",
        "value",
        "allChildrenCount",
        "getAllChildrenCount$ReactAndroid_release",
        "()I",
        "clippingRect",
        "hitSlopRect",
        "getHitSlopRect",
        "setHitSlopRect",
        "(Landroid/graphics/Rect;)V",
        "pointerEvents",
        "Lcom/facebook/react/uimanager/PointerEvents;",
        "getPointerEvents",
        "()Lcom/facebook/react/uimanager/PointerEvents;",
        "setPointerEvents",
        "(Lcom/facebook/react/uimanager/PointerEvents;)V",
        "axOrderList",
        "",
        "",
        "getAxOrderList",
        "()Ljava/util/List;",
        "setAxOrderList",
        "(Ljava/util/List;)V",
        "childrenLayoutChangeListener",
        "Lcom/facebook/react/views/view/ReactViewGroup$ChildrenLayoutChangeListener;",
        "onInterceptTouchEventListener",
        "Lcom/facebook/react/touch/OnInterceptTouchEventListener;",
        "needsOffscreenAlphaCompositing",
        "backfaceOpacity",
        "",
        "backfaceVisible",
        "childrenRemovedWhileTransitioning",
        "",
        "accessibilityStateChangeListener",
        "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;",
        "initView",
        "",
        "recycleView",
        "recycleView$ReactAndroid_release",
        "_drawingOrderHelper",
        "Lcom/facebook/react/uimanager/ViewGroupDrawingOrderHelper;",
        "drawingOrderHelper",
        "getDrawingOrderHelper",
        "()Lcom/facebook/react/uimanager/ViewGroupDrawingOrderHelper;",
        "onMeasure",
        "widthMeasureSpec",
        "heightMeasureSpec",
        "onLayout",
        "changed",
        "left",
        "top",
        "right",
        "bottom",
        "requestLayout",
        "dispatchProvideStructure",
        "structure",
        "Landroid/view/ViewStructure;",
        "setBackgroundColor",
        "color",
        "setTranslucentBackgroundDrawable",
        "background",
        "Landroid/graphics/drawable/Drawable;",
        "setOnInterceptTouchEventListener",
        "listener",
        "onInterceptTouchEvent",
        "event",
        "Landroid/view/MotionEvent;",
        "onTouchEvent",
        "onHoverEvent",
        "dispatchGenericMotionEvent",
        "ev",
        "hasOverlappingRendering",
        "setNeedsOffscreenAlphaCompositing",
        "setBorderWidth",
        "position",
        "width",
        "setBorderColor",
        "(ILjava/lang/Integer;)V",
        "setBorderRadius",
        "borderRadius",
        "property",
        "Lcom/facebook/react/uimanager/style/BorderRadiusProp;",
        "Lcom/facebook/react/uimanager/LengthPercentage;",
        "setBorderStyle",
        "style",
        "newValue",
        "removeClippedSubviews",
        "getRemoveClippedSubviews",
        "()Z",
        "setRemoveClippedSubviews",
        "(Z)V",
        "getClippingRect",
        "outClippingRect",
        "updateClippingRect",
        "excludedViews",
        "",
        "endViewTransition",
        "view",
        "trackChildViewTransition",
        "childId",
        "isChildRemovedWhileTransitioning",
        "child",
        "updateClippingToRect",
        "excludedViewsSet",
        "updateSubviewClipStatus",
        "idx",
        "clippedSoFar",
        "subview",
        "onSizeChanged",
        "w",
        "h",
        "oldw",
        "oldh",
        "onAttachedToWindow",
        "customDrawOrderDisabled",
        "onViewAdded",
        "onViewRemoved",
        "checkViewClippingTag",
        "expectedTag",
        "getChildDrawingOrder",
        "childCount",
        "index",
        "getZIndexMappedChildIndex",
        "updateDrawingOrder",
        "dispatchSetPressed",
        "pressed",
        "resetPointerEvents",
        "getChildAtWithSubviewClippingEnabled",
        "getChildAtWithSubviewClippingEnabled$ReactAndroid_release",
        "addViewWithSubviewClippingEnabled",
        "addViewWithSubviewClippingEnabled$ReactAndroid_release",
        "removeViewWithSubviewClippingEnabled",
        "removeViewWithSubviewClippingEnabled$ReactAndroid_release",
        "removeAllViewsWithSubviewClippingEnabled",
        "removeAllViewsWithSubviewClippingEnabled$ReactAndroid_release",
        "isViewClipped",
        "(Landroid/view/View;Ljava/lang/Integer;)Z",
        "indexOfChildInAllChildren",
        "addInArray",
        "removeFromArray",
        "_overflow",
        "Lcom/facebook/react/uimanager/style/Overflow;",
        "overflow",
        "getOverflow",
        "()Ljava/lang/String;",
        "setOverflow",
        "(Ljava/lang/String;)V",
        "setOverflowInset",
        "updateBackgroundDrawable",
        "drawable",
        "draw",
        "canvas",
        "Landroid/graphics/Canvas;",
        "dispatchDraw",
        "drawChild",
        "drawingTime",
        "",
        "setOpacityIfPossible",
        "opacity",
        "setBackfaceVisibility",
        "backfaceVisibility",
        "setBackfaceVisibilityDependantOpacity",
        "addChildrenForAccessibility",
        "outChildren",
        "Ljava/util/ArrayList;",
        "cleanUpAxOrderListener",
        "ChildrenLayoutChangeListener",
        "Companion",
        "ReactAndroid_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final ARRAY_CAPACITY_INCREMENT:I = 0xc

.field private static final Companion:Lcom/facebook/react/views/view/ReactViewGroup$Companion;

.field private static final defaultLayoutParam:Landroid/view/ViewGroup$LayoutParams;


# instance fields
.field private _drawingOrderHelper:Lcom/facebook/react/uimanager/ViewGroupDrawingOrderHelper;

.field private _overflow:Lcom/facebook/react/uimanager/style/Overflow;

.field private _removeClippedSubviews:Z

.field private accessibilityStateChangeListener:Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;

.field private allChildren:[Landroid/view/View;

.field private allChildrenCount:I

.field private axOrderList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private backfaceOpacity:F

.field private backfaceVisible:Z

.field private childrenLayoutChangeListener:Lcom/facebook/react/views/view/ReactViewGroup$ChildrenLayoutChangeListener;

.field private childrenRemovedWhileTransitioning:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private clippingRect:Landroid/graphics/Rect;

.field private hitSlopRect:Landroid/graphics/Rect;

.field private volatile inSubviewClippingLoop:Z

.field private needsOffscreenAlphaCompositing:Z

.field private onInterceptTouchEventListener:Lcom/facebook/react/touch/OnInterceptTouchEventListener;

.field private final overflowInset:Landroid/graphics/Rect;

.field private pointerEvents:Lcom/facebook/react/uimanager/PointerEvents;

.field private recycleCount:I


# direct methods
.method public static synthetic $r8$lambda$43bP8ZRheUcXzSUYchrgxU2wnAI(Lcom/facebook/react/views/view/ReactViewGroup;Z)V
    .locals 0

    invoke-static {p0, p1}, Lcom/facebook/react/views/view/ReactViewGroup;->addChildrenForAccessibility$lambda$1(Lcom/facebook/react/views/view/ReactViewGroup;Z)V

    return-void
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/react/views/view/ReactViewGroup$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/react/views/view/ReactViewGroup$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/facebook/react/views/view/ReactViewGroup;->Companion:Lcom/facebook/react/views/view/ReactViewGroup$Companion;

    .line 1008
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    sput-object v0, Lcom/facebook/react/views/view/ReactViewGroup;->defaultLayoutParam:Landroid/view/ViewGroup$LayoutParams;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 80
    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    .line 88
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/views/view/ReactViewGroup;->overflowInset:Landroid/graphics/Rect;

    .line 143
    sget-object p1, Lcom/facebook/react/uimanager/PointerEvents;->AUTO:Lcom/facebook/react/uimanager/PointerEvents;

    iput-object p1, p0, Lcom/facebook/react/views/view/ReactViewGroup;->pointerEvents:Lcom/facebook/react/uimanager/PointerEvents;

    .line 158
    invoke-direct {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->initView()V

    return-void
.end method

.method public static final synthetic access$updateSubviewClipStatus(Lcom/facebook/react/views/view/ReactViewGroup;Landroid/view/View;)V
    .locals 0

    .line 79
    invoke-direct {p0, p1}, Lcom/facebook/react/views/view/ReactViewGroup;->updateSubviewClipStatus(Landroid/view/View;)V

    return-void
.end method

.method private static final addChildrenForAccessibility$lambda$1(Lcom/facebook/react/views/view/ReactViewGroup;Z)V
    .locals 0

    if-nez p1, :cond_0

    .line 954
    check-cast p0, Landroid/view/ViewGroup;

    invoke-static {p0}, Lcom/facebook/react/uimanager/ReactAxOrderHelper;->restoreFocusability(Landroid/view/ViewGroup;)V

    :cond_0
    return-void
.end method

.method private final addInArray(Landroid/view/View;I)V
    .locals 4

    .line 766
    iget-object v0, p0, Lcom/facebook/react/views/view/ReactViewGroup;->allChildren:[Landroid/view/View;

    if-eqz v0, :cond_4

    .line 767
    iget v1, p0, Lcom/facebook/react/views/view/ReactViewGroup;->allChildrenCount:I

    .line 768
    array-length v2, v0

    const/4 v3, 0x0

    if-ne p2, v1, :cond_1

    if-ne v2, v1, :cond_0

    add-int/lit8 p2, v2, 0xc

    .line 771
    new-array p2, p2, [Landroid/view/View;

    .line 772
    invoke-static {v0, v3, p2, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 774
    iput-object p2, p0, Lcom/facebook/react/views/view/ReactViewGroup;->allChildren:[Landroid/view/View;

    move-object v0, p2

    .line 776
    :cond_0
    iget p2, p0, Lcom/facebook/react/views/view/ReactViewGroup;->allChildrenCount:I

    add-int/lit8 v1, p2, 0x1

    iput v1, p0, Lcom/facebook/react/views/view/ReactViewGroup;->allChildrenCount:I

    aput-object p1, v0, p2

    return-void

    :cond_1
    if-ge p2, v1, :cond_3

    if-ne v2, v1, :cond_2

    add-int/lit8 v2, v2, 0xc

    .line 779
    new-array v2, v2, [Landroid/view/View;

    .line 780
    invoke-static {v0, v3, v2, v3, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v3, p2, 0x1

    sub-int/2addr v1, p2

    .line 781
    invoke-static {v0, p2, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 783
    iput-object v2, p0, Lcom/facebook/react/views/view/ReactViewGroup;->allChildren:[Landroid/view/View;

    move-object v0, v2

    goto :goto_0

    :cond_2
    add-int/lit8 v2, p2, 0x1

    sub-int/2addr v1, p2

    .line 785
    invoke-static {v0, p2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 787
    :goto_0
    aput-object p1, v0, p2

    .line 788
    iget p1, p0, Lcom/facebook/react/views/view/ReactViewGroup;->allChildrenCount:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/facebook/react/views/view/ReactViewGroup;->allChildrenCount:I

    return-void

    .line 790
    :cond_3
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "index="

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p2

    const-string v0, " count="

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 766
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Required value was null."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final checkViewClippingTag(Landroid/view/View;Z)V
    .locals 4

    .line 600
    iget-boolean v0, p0, Lcom/facebook/react/views/view/ReactViewGroup;->inSubviewClippingLoop:Z

    if-eqz v0, :cond_0

    .line 601
    sget v0, Lcom/facebook/react/R$id;->view_clipped:I

    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    .line 602
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 605
    new-instance v1, Lcom/facebook/react/bridge/ReactNoCrashSoftException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "View clipping tag mismatch: tag="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " expected="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/facebook/react/bridge/ReactNoCrashSoftException;-><init>(Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Throwable;

    .line 603
    const-string v0, "ReactViewGroup.onViewRemoved"

    invoke-static {v0, v1}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 608
    :cond_0
    iget-boolean v0, p0, Lcom/facebook/react/views/view/ReactViewGroup;->_removeClippedSubviews:Z

    if-eqz v0, :cond_1

    .line 609
    sget v0, Lcom/facebook/react/R$id;->view_clipped:I

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p1, v0, p2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-void

    .line 611
    :cond_1
    sget p2, Lcom/facebook/react/R$id;->view_clipped:I

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-void
.end method

.method private final customDrawOrderDisabled()Z
    .locals 3

    .line 561
    invoke-virtual {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->getId()I

    move-result v0

    const/4 v1, -0x1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    return v2

    .line 566
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->getId()I

    move-result v0

    invoke-static {v0}, Lcom/facebook/react/uimanager/common/ViewUtil;->getUIManagerType(I)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    return v2
.end method

.method private final getDrawingOrderHelper()Lcom/facebook/react/uimanager/ViewGroupDrawingOrderHelper;
    .locals 2

    .line 220
    iget-object v0, p0, Lcom/facebook/react/views/view/ReactViewGroup;->_drawingOrderHelper:Lcom/facebook/react/uimanager/ViewGroupDrawingOrderHelper;

    if-nez v0, :cond_0

    .line 221
    new-instance v0, Lcom/facebook/react/uimanager/ViewGroupDrawingOrderHelper;

    move-object v1, p0

    check-cast v1, Landroid/view/ViewGroup;

    invoke-direct {v0, v1}, Lcom/facebook/react/uimanager/ViewGroupDrawingOrderHelper;-><init>(Landroid/view/ViewGroup;)V

    iput-object v0, p0, Lcom/facebook/react/views/view/ReactViewGroup;->_drawingOrderHelper:Lcom/facebook/react/uimanager/ViewGroupDrawingOrderHelper;

    .line 223
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/view/ReactViewGroup;->_drawingOrderHelper:Lcom/facebook/react/uimanager/ViewGroupDrawingOrderHelper;

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Required value was null."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final indexOfChildInAllChildren(Landroid/view/View;)I
    .locals 4

    .line 755
    iget v0, p0, Lcom/facebook/react/views/view/ReactViewGroup;->allChildrenCount:I

    .line 756
    iget-object v1, p0, Lcom/facebook/react/views/view/ReactViewGroup;->allChildren:[Landroid/view/View;

    if-eqz v1, :cond_2

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    .line 758
    aget-object v3, v1, v2

    if-ne v3, p1, :cond_0

    return v2

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1

    .line 756
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Required value was null."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final initView()V
    .locals 3

    const/4 v0, 0x0

    .line 167
    invoke-virtual {p0, v0}, Lcom/facebook/react/views/view/ReactViewGroup;->setClipChildren(Z)V

    .line 169
    iput-boolean v0, p0, Lcom/facebook/react/views/view/ReactViewGroup;->_removeClippedSubviews:Z

    .line 170
    iput-boolean v0, p0, Lcom/facebook/react/views/view/ReactViewGroup;->inSubviewClippingLoop:Z

    const/4 v1, 0x0

    .line 171
    iput-object v1, p0, Lcom/facebook/react/views/view/ReactViewGroup;->allChildren:[Landroid/view/View;

    .line 172
    iput v0, p0, Lcom/facebook/react/views/view/ReactViewGroup;->allChildrenCount:I

    .line 173
    iput-object v1, p0, Lcom/facebook/react/views/view/ReactViewGroup;->clippingRect:Landroid/graphics/Rect;

    .line 174
    invoke-virtual {p0, v1}, Lcom/facebook/react/views/view/ReactViewGroup;->setHitSlopRect(Landroid/graphics/Rect;)V

    .line 175
    sget-object v2, Lcom/facebook/react/uimanager/style/Overflow;->VISIBLE:Lcom/facebook/react/uimanager/style/Overflow;

    iput-object v2, p0, Lcom/facebook/react/views/view/ReactViewGroup;->_overflow:Lcom/facebook/react/uimanager/style/Overflow;

    .line 176
    sget-object v2, Lcom/facebook/react/uimanager/PointerEvents;->AUTO:Lcom/facebook/react/uimanager/PointerEvents;

    invoke-virtual {p0, v2}, Lcom/facebook/react/views/view/ReactViewGroup;->setPointerEvents(Lcom/facebook/react/uimanager/PointerEvents;)V

    .line 177
    iput-object v1, p0, Lcom/facebook/react/views/view/ReactViewGroup;->childrenLayoutChangeListener:Lcom/facebook/react/views/view/ReactViewGroup$ChildrenLayoutChangeListener;

    .line 178
    iput-object v1, p0, Lcom/facebook/react/views/view/ReactViewGroup;->onInterceptTouchEventListener:Lcom/facebook/react/touch/OnInterceptTouchEventListener;

    .line 179
    iput-boolean v0, p0, Lcom/facebook/react/views/view/ReactViewGroup;->needsOffscreenAlphaCompositing:Z

    .line 180
    iput-object v1, p0, Lcom/facebook/react/views/view/ReactViewGroup;->_drawingOrderHelper:Lcom/facebook/react/uimanager/ViewGroupDrawingOrderHelper;

    const/high16 v0, 0x3f800000    # 1.0f

    .line 181
    iput v0, p0, Lcom/facebook/react/views/view/ReactViewGroup;->backfaceOpacity:F

    const/4 v0, 0x1

    .line 182
    iput-boolean v0, p0, Lcom/facebook/react/views/view/ReactViewGroup;->backfaceVisible:Z

    .line 183
    iput-object v1, p0, Lcom/facebook/react/views/view/ReactViewGroup;->childrenRemovedWhileTransitioning:Ljava/util/Set;

    return-void
.end method

.method private final isChildRemovedWhileTransitioning(Landroid/view/View;)Z
    .locals 2

    .line 427
    iget-object v0, p0, Lcom/facebook/react/views/view/ReactViewGroup;->childrenRemovedWhileTransitioning:Ljava/util/Set;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    return v0

    :cond_0
    return v1
.end method

.method private final isViewClipped(Landroid/view/View;Ljava/lang/Integer;)Z
    .locals 8

    if-eqz p1, :cond_7

    .line 732
    sget v0, Lcom/facebook/react/R$id;->view_clipped:I

    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 734
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1

    .line 737
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    .line 738
    invoke-direct {p0, p1}, Lcom/facebook/react/views/view/ReactViewGroup;->isChildRemovedWhileTransitioning(Landroid/view/View;)Z

    move-result p1

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz p2, :cond_3

    .line 742
    new-instance v3, Lcom/facebook/react/bridge/ReactNoCrashSoftException;

    if-nez v0, :cond_1

    move v4, v2

    goto :goto_0

    :cond_1
    move v4, v1

    :goto_0
    if-ne v0, p0, :cond_2

    move v5, v2

    goto :goto_1

    :cond_2
    move v5, v1

    .line 743
    :goto_1
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "View missing clipping tag: index="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p2

    const-string v6, " parentNull="

    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object p2

    const-string v4, " parentThis="

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object p2

    const-string v4, " transitioning="

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 742
    invoke-direct {v3, p2}, Lcom/facebook/react/bridge/ReactNoCrashSoftException;-><init>(Ljava/lang/String;)V

    check-cast v3, Ljava/lang/Throwable;

    .line 740
    const-string p2, "ReactViewGroup.isViewClipped"

    invoke-static {p2, v3}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    if-eqz v0, :cond_6

    if-eqz p1, :cond_4

    goto :goto_2

    :cond_4
    if-ne v0, p0, :cond_5

    return v1

    .line 749
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Check failed."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    :goto_2
    return v2

    .line 731
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Required value was null."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final removeFromArray(I)V
    .locals 4

    .line 795
    iget-object v0, p0, Lcom/facebook/react/views/view/ReactViewGroup;->allChildren:[Landroid/view/View;

    if-eqz v0, :cond_2

    .line 796
    iget v1, p0, Lcom/facebook/react/views/view/ReactViewGroup;->allChildrenCount:I

    add-int/lit8 v2, v1, -0x1

    const/4 v3, 0x0

    if-ne p1, v2, :cond_0

    add-int/lit8 v1, v1, -0x1

    .line 798
    iput v1, p0, Lcom/facebook/react/views/view/ReactViewGroup;->allChildrenCount:I

    aput-object v3, v0, v1

    return-void

    :cond_0
    if-ltz p1, :cond_1

    if-ge p1, v1, :cond_1

    add-int/lit8 v2, p1, 0x1

    sub-int/2addr v1, p1

    add-int/lit8 v1, v1, -0x1

    .line 800
    invoke-static {v0, v2, v0, p1, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 801
    iget p1, p0, Lcom/facebook/react/views/view/ReactViewGroup;->allChildrenCount:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lcom/facebook/react/views/view/ReactViewGroup;->allChildrenCount:I

    aput-object v3, v0, p1

    return-void

    .line 803
    :cond_1
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1

    .line 795
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Required value was null."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final resetPointerEvents()V
    .locals 1

    .line 652
    sget-object v0, Lcom/facebook/react/uimanager/PointerEvents;->AUTO:Lcom/facebook/react/uimanager/PointerEvents;

    invoke-virtual {p0, v0}, Lcom/facebook/react/views/view/ReactViewGroup;->setPointerEvents(Lcom/facebook/react/uimanager/PointerEvents;)V

    return-void
.end method

.method private final trackChildViewTransition(I)V
    .locals 1

    .line 420
    iget-object v0, p0, Lcom/facebook/react/views/view/ReactViewGroup;->childrenRemovedWhileTransitioning:Ljava/util/Set;

    if-nez v0, :cond_0

    .line 421
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    check-cast v0, Ljava/util/Set;

    iput-object v0, p0, Lcom/facebook/react/views/view/ReactViewGroup;->childrenRemovedWhileTransitioning:Ljava/util/Set;

    .line 423
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/view/ReactViewGroup;->childrenRemovedWhileTransitioning:Ljava/util/Set;

    if-eqz v0, :cond_1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_1
    return-void
.end method

.method private final updateBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 843
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->setBackground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method private final updateClippingToRect(Landroid/graphics/Rect;Ljava/util/Set;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Rect;",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    .line 430
    const-string v3, " recycleCount="

    const-string v4, " allChildrenCount="

    const-string v5, " count="

    const-string v6, " clippedSoFar="

    const-string v7, "Invalid clipping state. i="

    iget-object v8, v1, Lcom/facebook/react/views/view/ReactViewGroup;->allChildren:[Landroid/view/View;

    if-eqz v8, :cond_6

    const/4 v0, 0x1

    .line 431
    iput-boolean v0, v1, Lcom/facebook/react/views/view/ReactViewGroup;->inSubviewClippingLoop:Z

    .line 433
    iget v0, v1, Lcom/facebook/react/views/view/ReactViewGroup;->allChildrenCount:I

    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_0
    if-ge v10, v0, :cond_5

    move-object/from16 v12, p1

    .line 435
    :try_start_0
    invoke-direct {v1, v12, v10, v11, v2}, Lcom/facebook/react/views/view/ReactViewGroup;->updateSubviewClipStatus(Landroid/graphics/Rect;IILjava/util/Set;)V
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 450
    aget-object v13, v8, v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-direct {v1, v13, v14}, Lcom/facebook/react/views/view/ReactViewGroup;->isViewClipped(Landroid/view/View;Ljava/lang/Integer;)Z

    move-result v13

    if-eqz v13, :cond_0

    add-int/lit8 v11, v11, 0x1

    :cond_0
    sub-int v13, v10, v11

    .line 453
    invoke-virtual {v1}, Lcom/facebook/react/views/view/ReactViewGroup;->getChildCount()I

    move-result v14

    if-le v13, v14, :cond_2

    .line 454
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 455
    invoke-virtual {v1}, Lcom/facebook/react/views/view/ReactViewGroup;->getChildCount()I

    move-result v8

    iget v12, v1, Lcom/facebook/react/views/view/ReactViewGroup;->allChildrenCount:I

    iget v13, v1, Lcom/facebook/react/views/view/ReactViewGroup;->recycleCount:I

    if-eqz v2, :cond_1

    invoke-interface {v2}, Ljava/util/Set;->size()I

    move-result v9

    goto :goto_1

    :cond_1
    const/4 v9, 0x0

    :goto_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  excludedViews="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 454
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    :catch_0
    move-exception v0

    .line 438
    new-instance v12, Ljava/util/HashSet;

    invoke-direct {v12}, Ljava/util/HashSet;-><init>()V

    check-cast v12, Ljava/util/Set;

    const/4 v13, 0x0

    const/4 v14, 0x0

    :goto_2
    if-ge v13, v10, :cond_3

    .line 441
    aget-object v15, v8, v13

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-direct {v1, v15, v9}, Lcom/facebook/react/views/view/ReactViewGroup;->isViewClipped(Landroid/view/View;Ljava/lang/Integer;)Z

    move-result v9

    add-int/2addr v14, v9

    .line 442
    aget-object v9, v8, v13

    invoke-interface {v12, v9}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v13, v13, 0x1

    goto :goto_2

    .line 446
    :cond_3
    new-instance v8, Ljava/lang/IllegalStateException;

    .line 447
    invoke-virtual {v1}, Lcom/facebook/react/views/view/ReactViewGroup;->getChildCount()I

    move-result v9

    iget v13, v1, Lcom/facebook/react/views/view/ReactViewGroup;->allChildrenCount:I

    iget v15, v1, Lcom/facebook/react/views/view/ReactViewGroup;->recycleCount:I

    invoke-interface {v12}, Ljava/util/Set;->size()I

    move-result v12

    if-eqz v2, :cond_4

    invoke-interface {v2}, Ljava/util/Set;->size()I

    move-result v2

    goto :goto_3

    :cond_4
    const/4 v2, 0x0

    :goto_3
    move-object/from16 p1, v0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, " realClippedSoFar="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, " uniqueViewsCount="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, " excludedViews="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 448
    move-object/from16 v2, p1

    check-cast v2, Ljava/lang/Throwable;

    .line 446
    invoke-direct {v8, v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v8

    :cond_5
    const/4 v2, 0x0

    .line 458
    iput-boolean v2, v1, Lcom/facebook/react/views/view/ReactViewGroup;->inSubviewClippingLoop:Z

    return-void

    .line 430
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Required value was null."

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method static synthetic updateClippingToRect$default(Lcom/facebook/react/views/view/ReactViewGroup;Landroid/graphics/Rect;Ljava/util/Set;ILjava/lang/Object;)V
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 429
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/views/view/ReactViewGroup;->updateClippingToRect(Landroid/graphics/Rect;Ljava/util/Set;)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: updateClippingToRect"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final updateSubviewClipStatus(Landroid/graphics/Rect;IILjava/util/Set;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Rect;",
            "II",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 467
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    .line 469
    iget-object v0, p0, Lcom/facebook/react/views/view/ReactViewGroup;->allChildren:[Landroid/view/View;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    aget-object v0, v0, p2

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_d

    .line 470
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v2

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v3

    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    move-result v4

    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    move-result v5

    invoke-virtual {p1, v2, v3, v4, v5}, Landroid/graphics/Rect;->intersects(IIII)Z

    move-result p1

    .line 479
    invoke-virtual {v0}, Landroid/view/View;->getAnimation()Landroid/view/animation/Animation;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroid/view/animation/Animation;->hasEnded()Z

    move-result v2

    if-nez v2, :cond_1

    move v2, v4

    goto :goto_1

    :cond_1
    move v2, v3

    :goto_1
    if-eqz p4, :cond_2

    .line 481
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {p4, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-ne v5, v4, :cond_2

    move v5, v4

    goto :goto_2

    :cond_2
    move v5, v3

    :goto_2
    if-eqz p4, :cond_3

    move v6, v4

    goto :goto_3

    :cond_3
    move v6, v3

    :goto_3
    if-nez p1, :cond_4

    .line 487
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-direct {p0, v0, v7}, Lcom/facebook/react/views/view/ReactViewGroup;->isViewClipped(Landroid/view/View;Ljava/lang/Integer;)Z

    move-result v7

    if-nez v7, :cond_4

    if-nez v2, :cond_4

    .line 489
    invoke-virtual {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->getFocusedChild()Landroid/view/View;

    move-result-object v2

    if-eq v0, v2, :cond_4

    if-nez v5, :cond_4

    .line 491
    sget-object p1, Lcom/facebook/react/views/view/ReactViewGroup;->Companion:Lcom/facebook/react/views/view/ReactViewGroup$Companion;

    invoke-static {p1, v0, v4}, Lcom/facebook/react/views/view/ReactViewGroup$Companion;->access$setViewClipped(Lcom/facebook/react/views/view/ReactViewGroup$Companion;Landroid/view/View;Z)V

    .line 494
    invoke-virtual {p0, v0}, Lcom/facebook/react/views/view/ReactViewGroup;->removeViewInLayout(Landroid/view/View;)V

    goto :goto_5

    :cond_4
    if-nez v5, :cond_5

    if-eqz p1, :cond_8

    .line 496
    :cond_5
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {p0, v0, v2}, Lcom/facebook/react/views/view/ReactViewGroup;->isViewClipped(Landroid/view/View;Ljava/lang/Integer;)Z

    move-result v2

    if-eqz v2, :cond_8

    sub-int/2addr p2, p3

    if-ltz p2, :cond_6

    move p1, v4

    goto :goto_4

    :cond_6
    move p1, v3

    :goto_4
    if-eqz p1, :cond_7

    .line 499
    sget-object p1, Lcom/facebook/react/views/view/ReactViewGroup;->Companion:Lcom/facebook/react/views/view/ReactViewGroup$Companion;

    invoke-static {p1, v0, v3}, Lcom/facebook/react/views/view/ReactViewGroup$Companion;->access$setViewClipped(Lcom/facebook/react/views/view/ReactViewGroup$Companion;Landroid/view/View;Z)V

    .line 500
    sget-object p1, Lcom/facebook/react/views/view/ReactViewGroup;->defaultLayoutParam:Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {p0, v0, p2, p1, v4}, Lcom/facebook/react/views/view/ReactViewGroup;->addViewInLayout(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)Z

    .line 501
    invoke-virtual {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->invalidate()V

    goto :goto_5

    .line 498
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Check failed."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    if-eqz p1, :cond_9

    :goto_5
    move v6, v4

    :cond_9
    if-eqz v6, :cond_c

    .line 509
    instance-of p1, v0, Lcom/facebook/react/uimanager/ReactClippingViewGroup;

    if-eqz p1, :cond_a

    move-object v1, v0

    check-cast v1, Lcom/facebook/react/uimanager/ReactClippingViewGroup;

    :cond_a
    if-eqz v1, :cond_b

    invoke-interface {v1}, Lcom/facebook/react/uimanager/ReactClippingViewGroup;->getRemoveClippedSubviews()Z

    move-result p1

    if-ne p1, v4, :cond_b

    move v3, v4

    :cond_b
    if-eqz v3, :cond_c

    .line 510
    check-cast v0, Lcom/facebook/react/uimanager/ReactClippingViewGroup;

    invoke-interface {v0, p4}, Lcom/facebook/react/uimanager/ReactClippingViewGroup;->updateClippingRect(Ljava/util/Set;)V

    :cond_c
    return-void

    .line 469
    :cond_d
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Required value was null."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final updateSubviewClipStatus(Landroid/view/View;)V
    .locals 9

    .line 516
    iget-boolean v0, p0, Lcom/facebook/react/views/view/ReactViewGroup;->_removeClippedSubviews:Z

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-nez v0, :cond_0

    goto/16 :goto_2

    .line 520
    :cond_0
    iget-object v2, p0, Lcom/facebook/react/views/view/ReactViewGroup;->clippingRect:Landroid/graphics/Rect;

    const-string v0, "Required value was null."

    if-eqz v2, :cond_5

    .line 521
    iget-object v1, p0, Lcom/facebook/react/views/view/ReactViewGroup;->allChildren:[Landroid/view/View;

    if-eqz v1, :cond_4

    .line 525
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v3

    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result v4

    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    move-result v5

    invoke-virtual {v2, v0, v3, v4, v5}, Landroid/graphics/Rect;->intersects(IIII)Z

    move-result v0

    const/4 v3, 0x0

    .line 528
    invoke-direct {p0, p1, v3}, Lcom/facebook/react/views/view/ReactViewGroup;->isViewClipped(Landroid/view/View;Ljava/lang/Integer;)Z

    move-result v3

    const/4 v4, 0x1

    xor-int/2addr v3, v4

    if-eq v0, v3, :cond_6

    .line 531
    iput-boolean v4, p0, Lcom/facebook/react/views/view/ReactViewGroup;->inSubviewClippingLoop:Z

    .line 533
    iget v0, p0, Lcom/facebook/react/views/view/ReactViewGroup;->allChildrenCount:I

    const/4 v8, 0x0

    move v3, v8

    move v4, v3

    :goto_0
    if-ge v3, v0, :cond_3

    .line 534
    aget-object v5, v1, v3

    if-ne v5, p1, :cond_1

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    .line 535
    invoke-static/range {v1 .. v7}, Lcom/facebook/react/views/view/ReactViewGroup;->updateSubviewClipStatus$default(Lcom/facebook/react/views/view/ReactViewGroup;Landroid/graphics/Rect;IILjava/util/Set;ILjava/lang/Object;)V

    move-object v2, v1

    goto :goto_1

    :cond_1
    move v6, v3

    move-object v3, v2

    move-object v2, p0

    .line 538
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-direct {p0, v5, v7}, Lcom/facebook/react/views/view/ReactViewGroup;->isViewClipped(Landroid/view/View;Ljava/lang/Integer;)Z

    move-result v5

    if-eqz v5, :cond_2

    add-int/lit8 v4, v4, 0x1

    :cond_2
    add-int/lit8 v5, v6, 0x1

    move-object v2, v3

    move v3, v5

    goto :goto_0

    :cond_3
    move-object v2, p0

    .line 542
    :goto_1
    iput-boolean v8, v2, Lcom/facebook/react/views/view/ReactViewGroup;->inSubviewClippingLoop:Z

    return-void

    :cond_4
    move-object v2, p0

    .line 521
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    move-object v2, p0

    .line 520
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    :goto_2
    move-object v2, p0

    return-void
.end method

.method static synthetic updateSubviewClipStatus$default(Lcom/facebook/react/views/view/ReactViewGroup;Landroid/graphics/Rect;IILjava/util/Set;ILjava/lang/Object;)V
    .locals 0

    if-nez p6, :cond_1

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    .line 461
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/facebook/react/views/view/ReactViewGroup;->updateSubviewClipStatus(Landroid/graphics/Rect;IILjava/util/Set;)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: updateSubviewClipStatus"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public addChildrenForAccessibility(Ljava/util/ArrayList;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    const-string v0, "outChildren"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 944
    sget v0, Lcom/facebook/react/R$id;->accessibility_order_parent:I

    invoke-virtual {p0, v0}, Lcom/facebook/react/views/view/ReactViewGroup;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/views/view/ReactViewGroup;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/facebook/react/views/view/ReactViewGroup;->axOrderList:Ljava/util/List;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 945
    :goto_0
    iget-object v1, p0, Lcom/facebook/react/views/view/ReactViewGroup;->axOrderList:Ljava/util/List;

    if-eqz v1, :cond_5

    .line 949
    invoke-virtual {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v2, "accessibility"

    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/accessibility/AccessibilityManager;

    .line 950
    iget-object v2, p0, Lcom/facebook/react/views/view/ReactViewGroup;->accessibilityStateChangeListener:Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;

    if-nez v2, :cond_1

    if-eqz v0, :cond_1

    .line 951
    new-instance v2, Lcom/facebook/react/views/view/ReactViewGroup$$ExternalSyntheticLambda0;

    invoke-direct {v2, p0}, Lcom/facebook/react/views/view/ReactViewGroup$$ExternalSyntheticLambda0;-><init>(Lcom/facebook/react/views/view/ReactViewGroup;)V

    .line 958
    invoke-virtual {v0, v2}, Landroid/view/accessibility/AccessibilityManager;->addAccessibilityStateChangeListener(Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;)Z

    .line 959
    iput-object v2, p0, Lcom/facebook/react/views/view/ReactViewGroup;->accessibilityStateChangeListener:Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;

    .line 962
    :cond_1
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    new-array v2, v0, [Landroid/view/View;

    .line 964
    invoke-virtual {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->getChildCount()I

    move-result v3

    const/4 v4, 0x0

    move v5, v4

    :goto_1
    if-ge v5, v3, :cond_2

    .line 965
    sget-object v6, Lcom/facebook/react/uimanager/ReactAxOrderHelper;->INSTANCE:Lcom/facebook/react/uimanager/ReactAxOrderHelper;

    invoke-virtual {p0, v5}, Lcom/facebook/react/views/view/ReactViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v7

    const-string v8, "getChildAt(...)"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6, v7, v1, v2}, Lcom/facebook/react/uimanager/ReactAxOrderHelper;->buildAxOrderList(Landroid/view/View;Ljava/util/List;[Landroid/view/View;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_2
    :goto_2
    if-ge v4, v0, :cond_9

    .line 969
    aget-object v1, v2, v4

    if-eqz v1, :cond_4

    .line 971
    invoke-virtual {v1}, Landroid/view/View;->isFocusable()Z

    move-result v3

    if-eqz v3, :cond_3

    .line 972
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 974
    :cond_3
    invoke-virtual {v1, p1}, Landroid/view/View;->addChildrenForAccessibility(Ljava/util/ArrayList;)V

    :cond_4
    :goto_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_5
    if-eqz v0, :cond_a

    .line 980
    invoke-virtual {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->isFocusable()Z

    move-result v1

    if-nez v1, :cond_6

    .line 981
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->addChildrenForAccessibility(Ljava/util/ArrayList;)V

    return-void

    .line 985
    :cond_6
    invoke-virtual {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->isFocusable()Z

    move-result v1

    const-string v2, ""

    if-eqz v1, :cond_8

    invoke-virtual {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-virtual {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 986
    :cond_7
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->addChildrenForAccessibility(Ljava/util/ArrayList;)V

    .line 987
    sget-object p1, Lcom/facebook/react/uimanager/ReactAxOrderHelper;->INSTANCE:Lcom/facebook/react/uimanager/ReactAxOrderHelper;

    move-object v1, p0

    check-cast v1, Landroid/view/ViewGroup;

    invoke-virtual {p1, v1, v0}, Lcom/facebook/react/uimanager/ReactAxOrderHelper;->disableFocusForSubtree(Landroid/view/ViewGroup;Ljava/util/List;)V

    return-void

    .line 990
    :cond_8
    invoke-virtual {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->isFocusable()Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-virtual {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object p1

    if-eqz p1, :cond_9

    invoke-virtual {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_9
    return-void

    .line 994
    :cond_a
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->addChildrenForAccessibility(Ljava/util/ArrayList;)V

    return-void
.end method

.method public final addViewWithSubviewClippingEnabled$ReactAndroid_release(Landroid/view/View;I)V
    .locals 9

    const-string v0, "child"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 662
    iget-boolean v0, p0, Lcom/facebook/react/views/view/ReactViewGroup;->_removeClippedSubviews:Z

    if-eqz v0, :cond_5

    .line 663
    sget-object v0, Lcom/facebook/react/views/view/ReactViewGroup;->Companion:Lcom/facebook/react/views/view/ReactViewGroup$Companion;

    const/4 v1, 0x1

    invoke-static {v0, p1, v1}, Lcom/facebook/react/views/view/ReactViewGroup$Companion;->access$setViewClipped(Lcom/facebook/react/views/view/ReactViewGroup$Companion;Landroid/view/View;Z)V

    .line 664
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/views/view/ReactViewGroup;->addInArray(Landroid/view/View;I)V

    .line 668
    iget-object v3, p0, Lcom/facebook/react/views/view/ReactViewGroup;->clippingRect:Landroid/graphics/Rect;

    const-string v0, "Required value was null."

    if-eqz v3, :cond_4

    .line 669
    iget-object v2, p0, Lcom/facebook/react/views/view/ReactViewGroup;->allChildren:[Landroid/view/View;

    if-eqz v2, :cond_3

    .line 670
    iput-boolean v1, p0, Lcom/facebook/react/views/view/ReactViewGroup;->inSubviewClippingLoop:Z

    const/4 v0, 0x0

    move v1, v0

    move v5, v1

    :goto_0
    if-ge v1, p2, :cond_1

    .line 673
    aget-object v4, v2, v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-direct {p0, v4, v6}, Lcom/facebook/react/views/view/ReactViewGroup;->isViewClipped(Landroid/view/View;Ljava/lang/Integer;)Z

    move-result v4

    if-eqz v4, :cond_0

    add-int/lit8 v5, v5, 0x1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/16 v7, 0x8

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v2, p0

    move v4, p2

    .line 677
    invoke-static/range {v2 .. v8}, Lcom/facebook/react/views/view/ReactViewGroup;->updateSubviewClipStatus$default(Lcom/facebook/react/views/view/ReactViewGroup;Landroid/graphics/Rect;IILjava/util/Set;ILjava/lang/Object;)V

    .line 678
    iput-boolean v0, v2, Lcom/facebook/react/views/view/ReactViewGroup;->inSubviewClippingLoop:Z

    .line 679
    iget-object p2, v2, Lcom/facebook/react/views/view/ReactViewGroup;->childrenLayoutChangeListener:Lcom/facebook/react/views/view/ReactViewGroup$ChildrenLayoutChangeListener;

    check-cast p2, Landroid/view/View$OnLayoutChangeListener;

    invoke-virtual {p1, p2}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 681
    instance-of p2, p1, Lcom/facebook/react/uimanager/ReactClippingProhibitedView;

    if-eqz p2, :cond_2

    .line 683
    new-instance p2, Lcom/facebook/react/views/view/ReactViewGroup$addViewWithSubviewClippingEnabled$1;

    invoke-direct {p2, p1, p0}, Lcom/facebook/react/views/view/ReactViewGroup$addViewWithSubviewClippingEnabled$1;-><init>(Landroid/view/View;Lcom/facebook/react/views/view/ReactViewGroup;)V

    check-cast p2, Ljava/lang/Runnable;

    .line 682
    invoke-static {p2}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    :cond_2
    return-void

    :cond_3
    move-object v2, p0

    .line 669
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    move-object v2, p0

    .line 668
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    move-object v2, p0

    .line 662
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Check failed."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final cleanUpAxOrderListener()V
    .locals 3

    .line 999
    invoke-virtual {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "accessibility"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Landroid/view/accessibility/AccessibilityManager;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Landroid/view/accessibility/AccessibilityManager;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    .line 1001
    iget-object v1, p0, Lcom/facebook/react/views/view/ReactViewGroup;->accessibilityStateChangeListener:Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;

    if-eqz v1, :cond_1

    invoke-virtual {v0, v1}, Landroid/view/accessibility/AccessibilityManager;->removeAccessibilityStateChangeListener(Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;)Z

    .line 1003
    :cond_1
    iput-object v2, p0, Lcom/facebook/react/views/view/ReactViewGroup;->accessibilityStateChangeListener:Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;

    return-void
.end method

.method protected dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 2

    const-string v0, "canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 869
    iget-object v0, p0, Lcom/facebook/react/views/view/ReactViewGroup;->_overflow:Lcom/facebook/react/uimanager/style/Overflow;

    sget-object v1, Lcom/facebook/react/uimanager/style/Overflow;->VISIBLE:Lcom/facebook/react/uimanager/style/Overflow;

    if-ne v0, v1, :cond_0

    sget v0, Lcom/facebook/react/R$id;->filter:I

    invoke-virtual {p0, v0}, Lcom/facebook/react/views/view/ReactViewGroup;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 870
    :cond_0
    move-object v0, p0

    check-cast v0, Landroid/view/View;

    invoke-static {v0, p1}, Lcom/facebook/react/uimanager/BackgroundStyleApplicator;->clipToPaddingBox(Landroid/view/View;Landroid/graphics/Canvas;)V

    .line 872
    :cond_1
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchDraw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    const-string v0, "ev"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 301
    sget-object v0, Lcom/facebook/react/uimanager/PointerEvents;->Companion:Lcom/facebook/react/uimanager/PointerEvents$Companion;

    invoke-virtual {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->getPointerEvents()Lcom/facebook/react/uimanager/PointerEvents;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/react/uimanager/PointerEvents$Companion;->canChildrenBeTouchTarget(Lcom/facebook/react/uimanager/PointerEvents;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 305
    :cond_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public dispatchProvideStructure(Landroid/view/ViewStructure;)V
    .locals 2

    const-string/jumbo v0, "structure"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 246
    :try_start_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchProvideStructure(Landroid/view/ViewStructure;)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 248
    const-string v0, "NullPointerException when executing dispatchProvideStructure"

    check-cast p1, Ljava/lang/Throwable;

    const-string v1, "ReactNative"

    invoke-static {v1, v0, p1}, Lcom/facebook/common/logging/FLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method protected dispatchSetPressed(Z)V
    .locals 0

    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 8

    const-string v0, "canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 847
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    .line 848
    move-object v0, p0

    check-cast v0, Landroid/view/View;

    invoke-static {v0}, Lcom/facebook/react/uimanager/common/ViewUtil;->getUIManagerType(Landroid/view/View;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 849
    move-object v0, p0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-static {v0}, Lcom/facebook/react/uimanager/BlendModeHelper;->needsIsolatedLayer(Landroid/view/ViewGroup;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 854
    invoke-virtual {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->getOverflowInset()Landroid/graphics/Rect;

    move-result-object v0

    .line 856
    iget v1, v0, Landroid/graphics/Rect;->left:I

    int-to-float v3, v1

    .line 857
    iget v1, v0, Landroid/graphics/Rect;->top:I

    int-to-float v4, v1

    .line 858
    invoke-virtual {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->getWidth()I

    move-result v1

    iget v2, v0, Landroid/graphics/Rect;->right:I

    neg-int v2, v2

    add-int/2addr v1, v2

    int-to-float v5, v1

    .line 859
    invoke-virtual {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->getHeight()I

    move-result v1

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    neg-int v0, v0

    add-int/2addr v1, v0

    int-to-float v6, v1

    const/4 v7, 0x0

    move-object v2, p1

    .line 855
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->saveLayer(FFFFLandroid/graphics/Paint;)I

    .line 861
    invoke-super {p0, v2}, Landroid/view/ViewGroup;->draw(Landroid/graphics/Canvas;)V

    .line 862
    invoke-virtual {v2}, Landroid/graphics/Canvas;->restore()V

    return-void

    :cond_0
    move-object v2, p1

    .line 864
    invoke-super {p0, v2}, Landroid/view/ViewGroup;->draw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method protected drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z
    .locals 11

    const-string v0, "canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "child"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 876
    invoke-virtual {p2}, Landroid/view/View;->getElevation()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-lez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    if-eqz v0, :cond_1

    .line 879
    invoke-static {p1, v1}, Lcom/facebook/react/views/view/CanvasUtil;->enableZ(Landroid/graphics/Canvas;Z)V

    .line 883
    :cond_1
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1d

    const/4 v4, 0x0

    if-lt v1, v3, :cond_3

    .line 884
    move-object v1, p0

    check-cast v1, Landroid/view/View;

    invoke-static {v1}, Lcom/facebook/react/uimanager/common/ViewUtil;->getUIManagerType(Landroid/view/View;)I

    move-result v1

    const/4 v3, 0x2

    if-ne v1, v3, :cond_3

    .line 885
    move-object v1, p0

    check-cast v1, Landroid/view/ViewGroup;

    invoke-static {v1}, Lcom/facebook/react/uimanager/BlendModeHelper;->needsIsolatedLayer(Landroid/view/ViewGroup;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 886
    sget v1, Lcom/facebook/react/R$id;->mix_blend_mode:I

    invoke-virtual {p2, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    instance-of v3, v1, Landroid/graphics/BlendMode;

    if-eqz v3, :cond_2

    check-cast v1, Landroid/graphics/BlendMode;

    move-object v4, v1

    :cond_2
    if-eqz v4, :cond_3

    .line 888
    new-instance v10, Landroid/graphics/Paint;

    invoke-direct {v10}, Landroid/graphics/Paint;-><init>()V

    .line 889
    invoke-virtual {v10, v4}, Landroid/graphics/Paint;->setBlendMode(Landroid/graphics/BlendMode;)V

    .line 890
    invoke-virtual {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->getOverflowInset()Landroid/graphics/Rect;

    move-result-object v1

    .line 892
    iget v3, v1, Landroid/graphics/Rect;->left:I

    int-to-float v6, v3

    .line 893
    iget v3, v1, Landroid/graphics/Rect;->top:I

    int-to-float v7, v3

    .line 894
    invoke-virtual {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->getWidth()I

    move-result v3

    iget v5, v1, Landroid/graphics/Rect;->right:I

    neg-int v5, v5

    add-int/2addr v3, v5

    int-to-float v8, v3

    .line 895
    invoke-virtual {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->getHeight()I

    move-result v3

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    neg-int v1, v1

    add-int/2addr v3, v1

    int-to-float v9, v3

    move-object v5, p1

    .line 891
    invoke-virtual/range {v5 .. v10}, Landroid/graphics/Canvas;->saveLayer(FFFFLandroid/graphics/Paint;)I

    goto :goto_1

    :cond_3
    move-object v5, p1

    .line 900
    :goto_1
    invoke-super {p0, v5, p2, p3, p4}, Landroid/view/ViewGroup;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z

    move-result p1

    if-eqz v4, :cond_4

    .line 903
    invoke-virtual {v5}, Landroid/graphics/Canvas;->restore()V

    :cond_4
    if-eqz v0, :cond_5

    .line 907
    invoke-static {v5, v2}, Lcom/facebook/react/views/view/CanvasUtil;->enableZ(Landroid/graphics/Canvas;Z)V

    :cond_5
    return p1
.end method

.method public endViewTransition(Landroid/view/View;)V
    .locals 1

    const-string/jumbo v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 415
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    .line 416
    iget-object v0, p0, Lcom/facebook/react/views/view/ReactViewGroup;->childrenRemovedWhileTransitioning:Ljava/util/Set;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final getAllChildrenCount$ReactAndroid_release()I
    .locals 1

    .line 137
    iget v0, p0, Lcom/facebook/react/views/view/ReactViewGroup;->allChildrenCount:I

    return v0
.end method

.method public final getAxOrderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 145
    iget-object v0, p0, Lcom/facebook/react/views/view/ReactViewGroup;->axOrderList:Ljava/util/List;

    return-object v0
.end method

.method public final getChildAtWithSubviewClippingEnabled$ReactAndroid_release(I)Landroid/view/View;
    .locals 1

    if-ltz p1, :cond_1

    .line 656
    iget v0, p0, Lcom/facebook/react/views/view/ReactViewGroup;->allChildrenCount:I

    if-ge p1, v0, :cond_1

    iget-object v0, p0, Lcom/facebook/react/views/view/ReactViewGroup;->allChildren:[Landroid/view/View;

    if-eqz v0, :cond_0

    aget-object p1, v0, p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Required value was null."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method protected getChildDrawingOrder(II)I
    .locals 1

    .line 616
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    .line 618
    invoke-direct {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->customDrawOrderDisabled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 619
    invoke-direct {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->getDrawingOrderHelper()Lcom/facebook/react/uimanager/ViewGroupDrawingOrderHelper;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/facebook/react/uimanager/ViewGroupDrawingOrderHelper;->getChildDrawingOrder(II)I

    move-result p1

    return p1

    :cond_0
    return p2
.end method

.method public getClippingRect(Landroid/graphics/Rect;)V
    .locals 1

    const-string v0, "outClippingRect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 397
    iget-object v0, p0, Lcom/facebook/react/views/view/ReactViewGroup;->clippingRect:Landroid/graphics/Rect;

    if-eqz v0, :cond_0

    invoke-virtual {p1, v0}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Required value was null."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getHitSlopRect()Landroid/graphics/Rect;
    .locals 1

    .line 142
    iget-object v0, p0, Lcom/facebook/react/views/view/ReactViewGroup;->hitSlopRect:Landroid/graphics/Rect;

    return-object v0
.end method

.method public getOverflow()Ljava/lang/String;
    .locals 2

    .line 810
    iget-object v0, p0, Lcom/facebook/react/views/view/ReactViewGroup;->_overflow:Lcom/facebook/react/uimanager/style/Overflow;

    if-nez v0, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/facebook/react/views/view/ReactViewGroup$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Lcom/facebook/react/uimanager/style/Overflow;->ordinal()I

    move-result v0

    aget v0, v1, v0

    :goto_0
    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v0, 0x0

    return-object v0

    .line 813
    :cond_1
    const-string/jumbo v0, "visible"

    return-object v0

    .line 812
    :cond_2
    const-string v0, "scroll"

    return-object v0

    .line 811
    :cond_3
    const-string v0, "hidden"

    return-object v0
.end method

.method public getOverflowInset()Landroid/graphics/Rect;
    .locals 1

    .line 88
    iget-object v0, p0, Lcom/facebook/react/views/view/ReactViewGroup;->overflowInset:Landroid/graphics/Rect;

    return-object v0
.end method

.method public getPointerEvents()Lcom/facebook/react/uimanager/PointerEvents;
    .locals 1

    .line 143
    iget-object v0, p0, Lcom/facebook/react/views/view/ReactViewGroup;->pointerEvents:Lcom/facebook/react/uimanager/PointerEvents;

    return-object v0
.end method

.method public getRemoveClippedSubviews()Z
    .locals 1

    .line 356
    iget-boolean v0, p0, Lcom/facebook/react/views/view/ReactViewGroup;->_removeClippedSubviews:Z

    return v0
.end method

.method public getZIndexMappedChildIndex(I)I
    .locals 2

    .line 626
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    .line 628
    invoke-direct {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->customDrawOrderDisabled()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->getDrawingOrderHelper()Lcom/facebook/react/uimanager/ViewGroupDrawingOrderHelper;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/react/uimanager/ViewGroupDrawingOrderHelper;->shouldEnableCustomDrawingOrder()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 629
    invoke-direct {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->getDrawingOrderHelper()Lcom/facebook/react/uimanager/ViewGroupDrawingOrderHelper;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->getChildCount()I

    move-result v1

    invoke-virtual {v0, v1, p1}, Lcom/facebook/react/uimanager/ViewGroupDrawingOrderHelper;->getChildDrawingOrder(II)I

    move-result p1

    :cond_0
    return p1
.end method

.method public hasOverlappingRendering()Z
    .locals 1

    .line 312
    iget-boolean v0, p0, Lcom/facebook/react/views/view/ReactViewGroup;->needsOffscreenAlphaCompositing:Z

    return v0
.end method

.method protected onAttachedToWindow()V
    .locals 1

    .line 554
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    .line 555
    iget-boolean v0, p0, Lcom/facebook/react/views/view/ReactViewGroup;->_removeClippedSubviews:Z

    if-eqz v0, :cond_0

    .line 556
    invoke-virtual {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->updateClippingRect()V

    :cond_0
    return-void
.end method

.method public onHoverEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 292
    sget-boolean v0, Lcom/facebook/react/config/ReactFeatureFlags;->dispatchPointerEvents:Z

    if-eqz v0, :cond_0

    .line 294
    sget-object p1, Lcom/facebook/react/uimanager/PointerEvents;->Companion:Lcom/facebook/react/uimanager/PointerEvents$Companion;

    invoke-virtual {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->getPointerEvents()Lcom/facebook/react/uimanager/PointerEvents;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/facebook/react/uimanager/PointerEvents$Companion;->canBeTouchTarget(Lcom/facebook/react/uimanager/PointerEvents;)Z

    move-result p1

    return p1

    .line 296
    :cond_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onHoverEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 267
    iget-object v0, p0, Lcom/facebook/react/views/view/ReactViewGroup;->onInterceptTouchEventListener:Lcom/facebook/react/touch/OnInterceptTouchEventListener;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move-object v2, p0

    check-cast v2, Landroid/view/ViewGroup;

    invoke-interface {v0, v2, p1}, Lcom/facebook/react/touch/OnInterceptTouchEventListener;->onInterceptTouchEvent(Landroid/view/ViewGroup;Landroid/view/MotionEvent;)Z

    move-result v0

    if-ne v0, v1, :cond_0

    return v1

    .line 271
    :cond_0
    sget-object v0, Lcom/facebook/react/uimanager/PointerEvents;->Companion:Lcom/facebook/react/uimanager/PointerEvents$Companion;

    invoke-virtual {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->getPointerEvents()Lcom/facebook/react/uimanager/PointerEvents;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/facebook/react/uimanager/PointerEvents$Companion;->canChildrenBeTouchTarget(Lcom/facebook/react/uimanager/PointerEvents;)Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    .line 274
    :cond_1
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    return-void
.end method

.method protected onMeasure(II)V
    .locals 0

    .line 227
    invoke-static {p1, p2}, Lcom/facebook/react/uimanager/MeasureSpecAssertions;->assertExplicitMeasureSpec(II)V

    .line 230
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    .line 229
    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/views/view/ReactViewGroup;->setMeasuredDimension(II)V

    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    .line 547
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;->onSizeChanged(IIII)V

    .line 548
    iget-boolean p1, p0, Lcom/facebook/react/views/view/ReactViewGroup;->_removeClippedSubviews:Z

    if-eqz p1, :cond_0

    .line 549
    invoke-virtual {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->updateClippingRect()V

    :cond_0
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 279
    sget-object p1, Lcom/facebook/react/uimanager/PointerEvents;->Companion:Lcom/facebook/react/uimanager/PointerEvents$Companion;

    invoke-virtual {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->getPointerEvents()Lcom/facebook/react/uimanager/PointerEvents;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/facebook/react/uimanager/PointerEvents$Companion;->canBeTouchTarget(Lcom/facebook/react/uimanager/PointerEvents;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public onViewAdded(Landroid/view/View;)V
    .locals 2

    const-string v0, "child"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 570
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    const/4 v0, 0x0

    .line 571
    invoke-direct {p0, p1, v0}, Lcom/facebook/react/views/view/ReactViewGroup;->checkViewClippingTag(Landroid/view/View;Z)V

    .line 572
    invoke-direct {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->customDrawOrderDisabled()Z

    move-result v1

    if-nez v1, :cond_0

    .line 573
    invoke-direct {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->getDrawingOrderHelper()Lcom/facebook/react/uimanager/ViewGroupDrawingOrderHelper;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/ViewGroupDrawingOrderHelper;->handleAddView(Landroid/view/View;)V

    .line 574
    invoke-direct {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->getDrawingOrderHelper()Lcom/facebook/react/uimanager/ViewGroupDrawingOrderHelper;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/react/uimanager/ViewGroupDrawingOrderHelper;->shouldEnableCustomDrawingOrder()Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/facebook/react/views/view/ReactViewGroup;->setChildrenDrawingOrderEnabled(Z)V

    goto :goto_0

    .line 576
    :cond_0
    invoke-virtual {p0, v0}, Lcom/facebook/react/views/view/ReactViewGroup;->setChildrenDrawingOrderEnabled(Z)V

    .line 578
    :goto_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onViewAdded(Landroid/view/View;)V

    return-void
.end method

.method public onViewRemoved(Landroid/view/View;)V
    .locals 1

    const-string v0, "child"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 582
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    const/4 v0, 0x1

    .line 583
    invoke-direct {p0, p1, v0}, Lcom/facebook/react/views/view/ReactViewGroup;->checkViewClippingTag(Landroid/view/View;Z)V

    .line 584
    invoke-direct {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->customDrawOrderDisabled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 585
    invoke-direct {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->getDrawingOrderHelper()Lcom/facebook/react/uimanager/ViewGroupDrawingOrderHelper;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/ViewGroupDrawingOrderHelper;->handleRemoveView(Landroid/view/View;)V

    .line 586
    invoke-direct {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->getDrawingOrderHelper()Lcom/facebook/react/uimanager/ViewGroupDrawingOrderHelper;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/react/uimanager/ViewGroupDrawingOrderHelper;->shouldEnableCustomDrawingOrder()Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/facebook/react/views/view/ReactViewGroup;->setChildrenDrawingOrderEnabled(Z)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 588
    invoke-virtual {p0, v0}, Lcom/facebook/react/views/view/ReactViewGroup;->setChildrenDrawingOrderEnabled(Z)V

    .line 592
    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 593
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/facebook/react/views/view/ReactViewGroup;->trackChildViewTransition(I)V

    .line 596
    :cond_1
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onViewRemoved(Landroid/view/View;)V

    return-void
.end method

.method public recycleView$ReactAndroid_release()V
    .locals 5

    .line 187
    iget v0, p0, Lcom/facebook/react/views/view/ReactViewGroup;->recycleCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/facebook/react/views/view/ReactViewGroup;->recycleCount:I

    .line 190
    iget-object v0, p0, Lcom/facebook/react/views/view/ReactViewGroup;->allChildren:[Landroid/view/View;

    if-eqz v0, :cond_2

    .line 191
    iget-object v1, p0, Lcom/facebook/react/views/view/ReactViewGroup;->childrenLayoutChangeListener:Lcom/facebook/react/views/view/ReactViewGroup$ChildrenLayoutChangeListener;

    if-eqz v1, :cond_2

    if-eqz v1, :cond_0

    .line 192
    invoke-virtual {v1}, Lcom/facebook/react/views/view/ReactViewGroup$ChildrenLayoutChangeListener;->shutdown()V

    .line 193
    :cond_0
    iget v1, p0, Lcom/facebook/react/views/view/ReactViewGroup;->allChildrenCount:I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    .line 194
    aget-object v3, v0, v2

    if-eqz v3, :cond_1

    iget-object v4, p0, Lcom/facebook/react/views/view/ReactViewGroup;->childrenLayoutChangeListener:Lcom/facebook/react/views/view/ReactViewGroup$ChildrenLayoutChangeListener;

    check-cast v4, Landroid/view/View$OnLayoutChangeListener;

    invoke-virtual {v3, v4}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 199
    :cond_2
    invoke-direct {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->initView()V

    .line 200
    invoke-virtual {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->getOverflowInset()Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Rect;->setEmpty()V

    .line 203
    invoke-virtual {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->removeAllViews()V

    .line 207
    invoke-virtual {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 208
    invoke-virtual {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.view.ViewGroup"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/ViewGroup;

    move-object v1, p0

    check-cast v1, Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_3
    const/4 v0, 0x0

    .line 212
    invoke-direct {p0, v0}, Lcom/facebook/react/views/view/ReactViewGroup;->updateBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 214
    invoke-direct {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->resetPointerEvents()V

    return-void
.end method

.method public final removeAllViewsWithSubviewClippingEnabled$ReactAndroid_release()V
    .locals 6

    .line 717
    iget-boolean v0, p0, Lcom/facebook/react/views/view/ReactViewGroup;->_removeClippedSubviews:Z

    if-eqz v0, :cond_3

    .line 718
    iget-object v0, p0, Lcom/facebook/react/views/view/ReactViewGroup;->allChildren:[Landroid/view/View;

    if-eqz v0, :cond_2

    .line 719
    iget v1, p0, Lcom/facebook/react/views/view/ReactViewGroup;->allChildrenCount:I

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    .line 720
    aget-object v4, v0, v3

    if-eqz v4, :cond_0

    iget-object v5, p0, Lcom/facebook/react/views/view/ReactViewGroup;->childrenLayoutChangeListener:Lcom/facebook/react/views/view/ReactViewGroup$ChildrenLayoutChangeListener;

    check-cast v5, Landroid/view/View$OnLayoutChangeListener;

    invoke-virtual {v4, v5}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 722
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->removeAllViewsInLayout()V

    .line 723
    iput v2, p0, Lcom/facebook/react/views/view/ReactViewGroup;->allChildrenCount:I

    return-void

    .line 718
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required value was null."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 717
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Check failed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final removeViewWithSubviewClippingEnabled$ReactAndroid_release(Landroid/view/View;)V
    .locals 5

    const-string/jumbo v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 697
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    .line 699
    iget-boolean v0, p0, Lcom/facebook/react/views/view/ReactViewGroup;->_removeClippedSubviews:Z

    if-eqz v0, :cond_4

    .line 700
    iget-object v0, p0, Lcom/facebook/react/views/view/ReactViewGroup;->allChildren:[Landroid/view/View;

    if-eqz v0, :cond_3

    .line 701
    iget-object v1, p0, Lcom/facebook/react/views/view/ReactViewGroup;->childrenLayoutChangeListener:Lcom/facebook/react/views/view/ReactViewGroup$ChildrenLayoutChangeListener;

    check-cast v1, Landroid/view/View$OnLayoutChangeListener;

    invoke-virtual {p1, v1}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 702
    invoke-direct {p0, p1}, Lcom/facebook/react/views/view/ReactViewGroup;->indexOfChildInAllChildren(Landroid/view/View;)I

    move-result p1

    .line 703
    aget-object v1, v0, p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {p0, v1, v2}, Lcom/facebook/react/views/view/ReactViewGroup;->isViewClipped(Landroid/view/View;Ljava/lang/Integer;)Z

    move-result v1

    if-nez v1, :cond_2

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v1, p1, :cond_1

    .line 706
    aget-object v3, v0, v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-direct {p0, v3, v4}, Lcom/facebook/react/views/view/ReactViewGroup;->isViewClipped(Landroid/view/View;Ljava/lang/Integer;)Z

    move-result v3

    if-eqz v3, :cond_0

    add-int/lit8 v2, v2, 0x1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    sub-int v0, p1, v2

    const/4 v1, 0x1

    .line 710
    invoke-virtual {p0, v0, v1}, Lcom/facebook/react/views/view/ReactViewGroup;->removeViewsInLayout(II)V

    .line 711
    invoke-virtual {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->invalidate()V

    .line 713
    :cond_2
    invoke-direct {p0, p1}, Lcom/facebook/react/views/view/ReactViewGroup;->removeFromArray(I)V

    return-void

    .line 700
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Required value was null."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 699
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Check failed."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public requestLayout()V
    .locals 0

    return-void
.end method

.method public final setAxOrderList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 145
    iput-object p1, p0, Lcom/facebook/react/views/view/ReactViewGroup;->axOrderList:Ljava/util/List;

    return-void
.end method

.method public final setBackfaceVisibility(Ljava/lang/String;)V
    .locals 1

    const-string v0, "backfaceVisibility"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 918
    const-string/jumbo v0, "visible"

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/facebook/react/views/view/ReactViewGroup;->backfaceVisible:Z

    .line 919
    invoke-virtual {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->setBackfaceVisibilityDependantOpacity()V

    return-void
.end method

.method public final setBackfaceVisibilityDependantOpacity()V
    .locals 4

    .line 923
    iget-boolean v0, p0, Lcom/facebook/react/views/view/ReactViewGroup;->backfaceVisible:Z

    if-eqz v0, :cond_0

    .line 924
    iget v0, p0, Lcom/facebook/react/views/view/ReactViewGroup;->backfaceOpacity:F

    invoke-virtual {p0, v0}, Lcom/facebook/react/views/view/ReactViewGroup;->setAlpha(F)V

    return-void

    .line 928
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->getRotationX()F

    move-result v0

    .line 929
    invoke-virtual {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->getRotationY()F

    move-result v1

    const/high16 v2, -0x3d4c0000    # -90.0f

    cmpl-float v3, v0, v2

    if-ltz v3, :cond_1

    const/high16 v3, 0x42b40000    # 90.0f

    cmpg-float v0, v0, v3

    if-gez v0, :cond_1

    cmpl-float v0, v1, v2

    if-ltz v0, :cond_1

    cmpg-float v0, v1, v3

    if-gez v0, :cond_1

    .line 935
    iget v0, p0, Lcom/facebook/react/views/view/ReactViewGroup;->backfaceOpacity:F

    invoke-virtual {p0, v0}, Lcom/facebook/react/views/view/ReactViewGroup;->setAlpha(F)V

    return-void

    :cond_1
    const/4 v0, 0x0

    .line 939
    invoke-virtual {p0, v0}, Lcom/facebook/react/views/view/ReactViewGroup;->setAlpha(F)V

    return-void
.end method

.method public setBackgroundColor(I)V
    .locals 1

    .line 253
    move-object v0, p0

    check-cast v0, Landroid/view/View;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/facebook/react/uimanager/BackgroundStyleApplicator;->setBackgroundColor(Landroid/view/View;Ljava/lang/Integer;)V

    return-void
.end method

.method public final setBorderColor(ILjava/lang/Integer;)V
    .locals 2

    .line 324
    move-object v0, p0

    check-cast v0, Landroid/view/View;

    invoke-static {}, Lcom/facebook/react/uimanager/style/LogicalEdge;->getEntries()Lkotlin/enums/EnumEntries;

    move-result-object v1

    invoke-interface {v1, p1}, Lkotlin/enums/EnumEntries;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/facebook/react/uimanager/style/LogicalEdge;

    invoke-static {v0, p1, p2}, Lcom/facebook/react/uimanager/BackgroundStyleApplicator;->setBorderColor(Landroid/view/View;Lcom/facebook/react/uimanager/style/LogicalEdge;Ljava/lang/Integer;)V

    return-void
.end method

.method public final setBorderRadius(F)V
    .locals 2
    .annotation runtime Lkotlin/Deprecated;
        message = "setBorderRadius(Float) is deprecated and will be removed in the future."
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "setBorderRadius(Float,LengthPercentage)"
            imports = {}
        .end subannotation
    .end annotation

    .line 332
    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 333
    :cond_0
    new-instance v0, Lcom/facebook/react/uimanager/LengthPercentage;

    sget-object v1, Lcom/facebook/react/uimanager/LengthPercentageType;->POINT:Lcom/facebook/react/uimanager/LengthPercentageType;

    invoke-direct {v0, p1, v1}, Lcom/facebook/react/uimanager/LengthPercentage;-><init>(FLcom/facebook/react/uimanager/LengthPercentageType;)V

    move-object p1, v0

    .line 334
    :goto_0
    move-object v0, p0

    check-cast v0, Landroid/view/View;

    sget-object v1, Lcom/facebook/react/uimanager/style/BorderRadiusProp;->BORDER_RADIUS:Lcom/facebook/react/uimanager/style/BorderRadiusProp;

    invoke-static {v0, v1, p1}, Lcom/facebook/react/uimanager/BackgroundStyleApplicator;->setBorderRadius(Landroid/view/View;Lcom/facebook/react/uimanager/style/BorderRadiusProp;Lcom/facebook/react/uimanager/LengthPercentage;)V

    return-void
.end method

.method public final setBorderRadius(FI)V
    .locals 2
    .annotation runtime Lkotlin/Deprecated;
        message = "setBorderRadius(Float) is deprecated and will be removed in the future."
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "setBorderRadius(Float,LengthPercentage)"
            imports = {}
        .end subannotation
    .end annotation

    .line 342
    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 343
    :cond_0
    new-instance v0, Lcom/facebook/react/uimanager/LengthPercentage;

    sget-object v1, Lcom/facebook/react/uimanager/LengthPercentageType;->POINT:Lcom/facebook/react/uimanager/LengthPercentageType;

    invoke-direct {v0, p1, v1}, Lcom/facebook/react/uimanager/LengthPercentage;-><init>(FLcom/facebook/react/uimanager/LengthPercentageType;)V

    move-object p1, v0

    .line 344
    :goto_0
    move-object v0, p0

    check-cast v0, Landroid/view/View;

    invoke-static {}, Lcom/facebook/react/uimanager/style/BorderRadiusProp;->getEntries()Lkotlin/enums/EnumEntries;

    move-result-object v1

    invoke-interface {v1, p2}, Lkotlin/enums/EnumEntries;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/facebook/react/uimanager/style/BorderRadiusProp;

    invoke-static {v0, p2, p1}, Lcom/facebook/react/uimanager/BackgroundStyleApplicator;->setBorderRadius(Landroid/view/View;Lcom/facebook/react/uimanager/style/BorderRadiusProp;Lcom/facebook/react/uimanager/LengthPercentage;)V

    return-void
.end method

.method public final setBorderRadius(Lcom/facebook/react/uimanager/style/BorderRadiusProp;Lcom/facebook/react/uimanager/LengthPercentage;)V
    .locals 1

    const-string v0, "property"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 348
    move-object v0, p0

    check-cast v0, Landroid/view/View;

    invoke-static {v0, p1, p2}, Lcom/facebook/react/uimanager/BackgroundStyleApplicator;->setBorderRadius(Landroid/view/View;Lcom/facebook/react/uimanager/style/BorderRadiusProp;Lcom/facebook/react/uimanager/LengthPercentage;)V

    return-void
.end method

.method public final setBorderStyle(Ljava/lang/String;)V
    .locals 2

    .line 352
    move-object v0, p0

    check-cast v0, Landroid/view/View;

    if-eqz p1, :cond_0

    sget-object v1, Lcom/facebook/react/uimanager/style/BorderStyle;->Companion:Lcom/facebook/react/uimanager/style/BorderStyle$Companion;

    invoke-virtual {v1, p1}, Lcom/facebook/react/uimanager/style/BorderStyle$Companion;->fromString(Ljava/lang/String;)Lcom/facebook/react/uimanager/style/BorderStyle;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {v0, p1}, Lcom/facebook/react/uimanager/BackgroundStyleApplicator;->setBorderStyle(Landroid/view/View;Lcom/facebook/react/uimanager/style/BorderStyle;)V

    return-void
.end method

.method public final setBorderWidth(IF)V
    .locals 2

    .line 320
    move-object v0, p0

    check-cast v0, Landroid/view/View;

    invoke-static {}, Lcom/facebook/react/uimanager/style/LogicalEdge;->getEntries()Lkotlin/enums/EnumEntries;

    move-result-object v1

    invoke-interface {v1, p1}, Lkotlin/enums/EnumEntries;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/facebook/react/uimanager/style/LogicalEdge;

    invoke-static {p2}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    move-result p2

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-static {v0, p1, p2}, Lcom/facebook/react/uimanager/BackgroundStyleApplicator;->setBorderWidth(Landroid/view/View;Lcom/facebook/react/uimanager/style/LogicalEdge;Ljava/lang/Float;)V

    return-void
.end method

.method public setHitSlopRect(Landroid/graphics/Rect;)V
    .locals 0

    .line 142
    iput-object p1, p0, Lcom/facebook/react/views/view/ReactViewGroup;->hitSlopRect:Landroid/graphics/Rect;

    return-void
.end method

.method public final setNeedsOffscreenAlphaCompositing(Z)V
    .locals 0

    .line 316
    iput-boolean p1, p0, Lcom/facebook/react/views/view/ReactViewGroup;->needsOffscreenAlphaCompositing:Z

    return-void
.end method

.method public setOnInterceptTouchEventListener(Lcom/facebook/react/touch/OnInterceptTouchEventListener;)V
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 263
    iput-object p1, p0, Lcom/facebook/react/views/view/ReactViewGroup;->onInterceptTouchEventListener:Lcom/facebook/react/touch/OnInterceptTouchEventListener;

    return-void
.end method

.method public final setOpacityIfPossible(F)V
    .locals 0

    .line 913
    iput p1, p0, Lcom/facebook/react/views/view/ReactViewGroup;->backfaceOpacity:F

    .line 914
    invoke-virtual {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->setBackfaceVisibilityDependantOpacity()V

    return-void
.end method

.method public setOverflow(Ljava/lang/String;)V
    .locals 1

    if-nez p1, :cond_0

    .line 819
    sget-object p1, Lcom/facebook/react/uimanager/style/Overflow;->VISIBLE:Lcom/facebook/react/uimanager/style/Overflow;

    goto :goto_0

    .line 821
    :cond_0
    sget-object v0, Lcom/facebook/react/uimanager/style/Overflow;->Companion:Lcom/facebook/react/uimanager/style/Overflow$Companion;

    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/style/Overflow$Companion;->fromString(Ljava/lang/String;)Lcom/facebook/react/uimanager/style/Overflow;

    move-result-object p1

    .line 817
    :goto_0
    iput-object p1, p0, Lcom/facebook/react/views/view/ReactViewGroup;->_overflow:Lcom/facebook/react/uimanager/style/Overflow;

    .line 823
    invoke-virtual {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->invalidate()V

    return-void
.end method

.method public setOverflowInset(IIII)V
    .locals 1

    .line 827
    move-object v0, p0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-static {v0}, Lcom/facebook/react/uimanager/BlendModeHelper;->needsIsolatedLayer(Landroid/view/ViewGroup;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 828
    invoke-virtual {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->getOverflowInset()Landroid/graphics/Rect;

    move-result-object v0

    iget v0, v0, Landroid/graphics/Rect;->left:I

    if-ne v0, p1, :cond_0

    .line 829
    invoke-virtual {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->getOverflowInset()Landroid/graphics/Rect;

    move-result-object v0

    iget v0, v0, Landroid/graphics/Rect;->top:I

    if-ne v0, p2, :cond_0

    .line 830
    invoke-virtual {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->getOverflowInset()Landroid/graphics/Rect;

    move-result-object v0

    iget v0, v0, Landroid/graphics/Rect;->right:I

    if-ne v0, p3, :cond_0

    .line 831
    invoke-virtual {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->getOverflowInset()Landroid/graphics/Rect;

    move-result-object v0

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    if-eq v0, p4, :cond_1

    .line 832
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->invalidate()V

    .line 834
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->getOverflowInset()Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/Rect;->set(IIII)V

    return-void
.end method

.method public setPointerEvents(Lcom/facebook/react/uimanager/PointerEvents;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 143
    iput-object p1, p0, Lcom/facebook/react/views/view/ReactViewGroup;->pointerEvents:Lcom/facebook/react/uimanager/PointerEvents;

    return-void
.end method

.method public setRemoveClippedSubviews(Z)V
    .locals 7

    .line 358
    iget-boolean v0, p0, Lcom/facebook/react/views/view/ReactViewGroup;->_removeClippedSubviews:Z

    if-ne p1, v0, :cond_0

    return-void

    .line 361
    :cond_0
    iput-boolean p1, p0, Lcom/facebook/react/views/view/ReactViewGroup;->_removeClippedSubviews:Z

    const/4 v0, 0x0

    .line 362
    iput-object v0, p0, Lcom/facebook/react/views/view/ReactViewGroup;->childrenRemovedWhileTransitioning:Ljava/util/Set;

    const/4 v1, 0x0

    if-eqz p1, :cond_2

    .line 364
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    .line 365
    move-object v0, p0

    check-cast v0, Landroid/view/View;

    invoke-static {v0, p1}, Lcom/facebook/react/uimanager/ReactClippingViewGroupHelper;->calculateClippingRect(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 366
    iput-object p1, p0, Lcom/facebook/react/views/view/ReactViewGroup;->clippingRect:Landroid/graphics/Rect;

    .line 368
    invoke-virtual {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->getChildCount()I

    move-result p1

    iput p1, p0, Lcom/facebook/react/views/view/ReactViewGroup;->allChildrenCount:I

    const/16 v0, 0xc

    .line 369
    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    new-array p1, p1, [Landroid/view/View;

    .line 370
    new-instance v0, Lcom/facebook/react/views/view/ReactViewGroup$ChildrenLayoutChangeListener;

    invoke-direct {v0, p0}, Lcom/facebook/react/views/view/ReactViewGroup$ChildrenLayoutChangeListener;-><init>(Lcom/facebook/react/views/view/ReactViewGroup;)V

    iput-object v0, p0, Lcom/facebook/react/views/view/ReactViewGroup;->childrenLayoutChangeListener:Lcom/facebook/react/views/view/ReactViewGroup$ChildrenLayoutChangeListener;

    .line 371
    iget v0, p0, Lcom/facebook/react/views/view/ReactViewGroup;->allChildrenCount:I

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    .line 372
    invoke-virtual {p0, v2}, Lcom/facebook/react/views/view/ReactViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 373
    aput-object v3, p1, v2

    .line 374
    iget-object v4, p0, Lcom/facebook/react/views/view/ReactViewGroup;->childrenLayoutChangeListener:Lcom/facebook/react/views/view/ReactViewGroup$ChildrenLayoutChangeListener;

    check-cast v4, Landroid/view/View$OnLayoutChangeListener;

    invoke-virtual {v3, v4}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 375
    sget-object v4, Lcom/facebook/react/views/view/ReactViewGroup;->Companion:Lcom/facebook/react/views/view/ReactViewGroup$Companion;

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v4, v3, v1}, Lcom/facebook/react/views/view/ReactViewGroup$Companion;->access$setViewClipped(Lcom/facebook/react/views/view/ReactViewGroup$Companion;Landroid/view/View;Z)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 377
    :cond_1
    iput-object p1, p0, Lcom/facebook/react/views/view/ReactViewGroup;->allChildren:[Landroid/view/View;

    .line 378
    invoke-virtual {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->updateClippingRect()V

    return-void

    .line 381
    :cond_2
    iget-object p1, p0, Lcom/facebook/react/views/view/ReactViewGroup;->allChildren:[Landroid/view/View;

    const-string v2, "Required value was null."

    if-eqz p1, :cond_7

    .line 382
    iget-object v3, p0, Lcom/facebook/react/views/view/ReactViewGroup;->childrenLayoutChangeListener:Lcom/facebook/react/views/view/ReactViewGroup$ChildrenLayoutChangeListener;

    if-eqz v3, :cond_6

    .line 383
    iget v3, p0, Lcom/facebook/react/views/view/ReactViewGroup;->allChildrenCount:I

    move v4, v1

    :goto_1
    if-ge v4, v3, :cond_4

    .line 384
    aget-object v5, p1, v4

    if-eqz v5, :cond_3

    iget-object v6, p0, Lcom/facebook/react/views/view/ReactViewGroup;->childrenLayoutChangeListener:Lcom/facebook/react/views/view/ReactViewGroup$ChildrenLayoutChangeListener;

    check-cast v6, Landroid/view/View$OnLayoutChangeListener;

    invoke-virtual {v5, v6}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 386
    :cond_4
    iget-object p1, p0, Lcom/facebook/react/views/view/ReactViewGroup;->clippingRect:Landroid/graphics/Rect;

    if-eqz p1, :cond_5

    .line 387
    invoke-virtual {p0, p1}, Lcom/facebook/react/views/view/ReactViewGroup;->getDrawingRect(Landroid/graphics/Rect;)V

    const/4 v2, 0x2

    .line 388
    invoke-static {p0, p1, v0, v2, v0}, Lcom/facebook/react/views/view/ReactViewGroup;->updateClippingToRect$default(Lcom/facebook/react/views/view/ReactViewGroup;Landroid/graphics/Rect;Ljava/util/Set;ILjava/lang/Object;)V

    .line 389
    iput-object v0, p0, Lcom/facebook/react/views/view/ReactViewGroup;->allChildren:[Landroid/view/View;

    .line 390
    iput-object v0, p0, Lcom/facebook/react/views/view/ReactViewGroup;->clippingRect:Landroid/graphics/Rect;

    .line 391
    iput v1, p0, Lcom/facebook/react/views/view/ReactViewGroup;->allChildrenCount:I

    .line 392
    iput-object v0, p0, Lcom/facebook/react/views/view/ReactViewGroup;->childrenLayoutChangeListener:Lcom/facebook/react/views/view/ReactViewGroup$ChildrenLayoutChangeListener;

    return-void

    .line 386
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 382
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 381
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setTranslucentBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1
    .annotation runtime Lkotlin/Deprecated;
        message = "setTranslucentBackgroundDrawable is deprecated since React Native 0.76.0 and will be removed in a future version"
    .end annotation

    .line 259
    move-object v0, p0

    check-cast v0, Landroid/view/View;

    invoke-static {v0, p1}, Lcom/facebook/react/uimanager/BackgroundStyleApplicator;->setFeedbackUnderlay(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public updateClippingRect()V
    .locals 1

    const/4 v0, 0x0

    .line 401
    invoke-virtual {p0, v0}, Lcom/facebook/react/views/view/ReactViewGroup;->updateClippingRect(Ljava/util/Set;)V

    return-void
.end method

.method public updateClippingRect(Ljava/util/Set;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 405
    iget-boolean v0, p0, Lcom/facebook/react/views/view/ReactViewGroup;->_removeClippedSubviews:Z

    if-nez v0, :cond_0

    return-void

    .line 409
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/view/ReactViewGroup;->clippingRect:Landroid/graphics/Rect;

    if-eqz v0, :cond_1

    .line 410
    move-object v1, p0

    check-cast v1, Landroid/view/View;

    invoke-static {v1, v0}, Lcom/facebook/react/uimanager/ReactClippingViewGroupHelper;->calculateClippingRect(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 411
    invoke-direct {p0, v0, p1}, Lcom/facebook/react/views/view/ReactViewGroup;->updateClippingToRect(Landroid/graphics/Rect;Ljava/util/Set;)V

    return-void

    .line 409
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Required value was null."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public updateDrawingOrder()V
    .locals 1

    .line 637
    invoke-direct {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->customDrawOrderDisabled()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 641
    :cond_0
    invoke-direct {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->getDrawingOrderHelper()Lcom/facebook/react/uimanager/ViewGroupDrawingOrderHelper;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/react/uimanager/ViewGroupDrawingOrderHelper;->update()V

    .line 642
    invoke-direct {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->getDrawingOrderHelper()Lcom/facebook/react/uimanager/ViewGroupDrawingOrderHelper;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/react/uimanager/ViewGroupDrawingOrderHelper;->shouldEnableCustomDrawingOrder()Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/facebook/react/views/view/ReactViewGroup;->setChildrenDrawingOrderEnabled(Z)V

    .line 643
    invoke-virtual {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->invalidate()V

    return-void
.end method
