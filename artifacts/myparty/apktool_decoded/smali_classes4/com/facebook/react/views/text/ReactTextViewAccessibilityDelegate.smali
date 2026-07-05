.class public final Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate;
.super Lcom/facebook/react/uimanager/ReactAccessibilityDelegate;
.source "ReactTextViewAccessibilityDelegate.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate$AccessibilityLinks;,
        Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010!\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u0000 22\u00020\u0001:\u000223B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0018\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0005H\u0014J\"\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\u0018\u0010\u0014\u001a\u00020\r2\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0016H\u0014J\u0018\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0014J\n\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J5\u0010\u001d\u001a\u0004\u0018\u0001H\u001e\"\u0004\u0008\u0000\u0010\u001e2\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00072\u000e\u0010!\u001a\n\u0012\u0004\u0012\u0002H\u001e\u0018\u00010\"H\u0004\u00a2\u0006\u0002\u0010#J\n\u0010$\u001a\u0004\u0018\u00010%H\u0002J\u0018\u0010&\u001a\u00020\r2\u0006\u0010\'\u001a\u00020\u00032\u0006\u0010(\u001a\u00020)H\u0016J\u0018\u0010*\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010+\u001a\u00020)H\u0014J\u0012\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010.\u001a\u00020/H\u0002J\u0012\u00100\u001a\u0004\u0018\u0001012\u0006\u0010\'\u001a\u00020\u0003H\u0016R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00064"
    }
    d2 = {
        "Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate;",
        "Lcom/facebook/react/uimanager/ReactAccessibilityDelegate;",
        "view",
        "Landroid/view/View;",
        "originalFocus",
        "",
        "originalImportantForAccessibility",
        "",
        "<init>",
        "(Landroid/view/View;ZI)V",
        "accessibilityLinks",
        "Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate$AccessibilityLinks;",
        "onVirtualViewKeyboardFocusChanged",
        "",
        "virtualViewId",
        "hasFocus",
        "onPerformActionForVirtualView",
        "action",
        "arguments",
        "Landroid/os/Bundle;",
        "getVisibleVirtualViews",
        "virtualViewIds",
        "",
        "getVirtualViewAt",
        "x",
        "",
        "y",
        "getLayoutFromHost",
        "Landroid/text/Layout;",
        "getFirstSpan",
        "T",
        "start",
        "end",
        "classType",
        "Ljava/lang/Class;",
        "(IILjava/lang/Class;)Ljava/lang/Object;",
        "getSpannedFromHost",
        "Landroid/text/Spanned;",
        "onInitializeAccessibilityNodeInfo",
        "host",
        "info",
        "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;",
        "onPopulateNodeForVirtualView",
        "node",
        "getBoundsInParent",
        "Landroid/graphics/Rect;",
        "accessibleLink",
        "Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate$AccessibilityLinks$AccessibleLink;",
        "getAccessibilityNodeProvider",
        "Landroidx/core/view/accessibility/AccessibilityNodeProviderCompat;",
        "Companion",
        "AccessibilityLinks",
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
.field public static final Companion:Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate$Companion;


# instance fields
.field private accessibilityLinks:Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate$AccessibilityLinks;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate;->Companion:Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;ZI)V
    .locals 1

    const-string/jumbo v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate;-><init>(Landroid/view/View;ZI)V

    .line 32
    invoke-virtual {p0}, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate;->getHostView()Landroid/view/View;

    move-result-object p1

    sget p2, Lcom/facebook/react/R$id;->accessibility_links:I

    invoke-virtual {p1, p2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate$AccessibilityLinks;

    iput-object p1, p0, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate;->accessibilityLinks:Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate$AccessibilityLinks;

    return-void
.end method

.method private final getBoundsInParent(Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate$AccessibilityLinks$AccessibleLink;)Landroid/graphics/Rect;
    .locals 10

    .line 216
    invoke-virtual {p0}, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate;->getHostView()Landroid/view/View;

    move-result-object v0

    instance-of v0, v0, Landroid/widget/TextView;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate;->getHostView()Landroid/view/View;

    move-result-object v0

    instance-of v0, v0, Lcom/facebook/react/views/text/PreparedLayoutTextView;

    if-nez v0, :cond_0

    .line 217
    new-instance p1, Landroid/graphics/Rect;

    invoke-virtual {p0}, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate;->getHostView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate;->getHostView()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v2

    invoke-direct {p1, v1, v1, v0, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object p1

    .line 220
    :cond_0
    invoke-direct {p0}, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate;->getLayoutFromHost()Landroid/text/Layout;

    move-result-object v0

    if-nez v0, :cond_1

    new-instance p1, Landroid/graphics/Rect;

    invoke-virtual {p0}, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate;->getHostView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate;->getHostView()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v2

    invoke-direct {p1, v1, v1, v0, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object p1

    .line 222
    :cond_1
    invoke-virtual {p1}, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate$AccessibilityLinks$AccessibleLink;->getStart()I

    move-result v2

    .line 223
    invoke-virtual {p1}, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate$AccessibilityLinks$AccessibleLink;->getEnd()I

    move-result p1

    .line 227
    invoke-virtual {v0, v2}, Landroid/text/Layout;->getLineForOffset(I)I

    move-result v3

    .line 228
    invoke-virtual {v0, v3}, Landroid/text/Layout;->getLineEnd(I)I

    move-result v4

    .line 229
    invoke-virtual {v0, p1}, Landroid/text/Layout;->getLineForOffset(I)I

    move-result v5

    .line 230
    invoke-virtual {v0, v5}, Landroid/text/Layout;->getLineEnd(I)I

    move-result v6

    if-gt v2, v4, :cond_5

    if-le p1, v6, :cond_2

    goto :goto_0

    .line 235
    :cond_2
    new-instance v4, Landroid/graphics/Rect;

    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    .line 237
    invoke-virtual {v0, v2}, Landroid/text/Layout;->getPrimaryHorizontal(I)F

    move-result v2

    float-to-double v6, v2

    if-eq v3, v5, :cond_3

    const/4 v1, 0x1

    .line 240
    :cond_3
    invoke-virtual {v0, v3, v4}, Landroid/text/Layout;->getLineBounds(ILandroid/graphics/Rect;)I

    .line 242
    invoke-virtual {p0}, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate;->getHostView()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getScrollY()I

    move-result v2

    invoke-virtual {p0}, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate;->getHostView()Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    add-int/2addr v2, v3

    .line 243
    iget v3, v4, Landroid/graphics/Rect;->top:I

    add-int/2addr v3, v2

    iput v3, v4, Landroid/graphics/Rect;->top:I

    .line 244
    iget v3, v4, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v3, v2

    iput v3, v4, Landroid/graphics/Rect;->bottom:I

    .line 246
    iget v2, v4, Landroid/graphics/Rect;->left:I

    int-to-double v2, v2

    invoke-virtual {p0}, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate;->getHostView()Landroid/view/View;

    move-result-object v5

    invoke-virtual {v5}, Landroid/view/View;->getPaddingLeft()I

    move-result v5

    int-to-double v8, v5

    add-double/2addr v6, v8

    invoke-virtual {p0}, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate;->getHostView()Landroid/view/View;

    move-result-object v5

    invoke-virtual {v5}, Landroid/view/View;->getScrollX()I

    move-result v5

    int-to-double v8, v5

    sub-double/2addr v6, v8

    add-double/2addr v2, v6

    double-to-int v2, v2

    .line 245
    iput v2, v4, Landroid/graphics/Rect;->left:I

    if-eqz v1, :cond_4

    .line 254
    new-instance p1, Landroid/graphics/Rect;

    iget v0, v4, Landroid/graphics/Rect;->left:I

    iget v1, v4, Landroid/graphics/Rect;->top:I

    iget v2, v4, Landroid/graphics/Rect;->right:I

    iget v3, v4, Landroid/graphics/Rect;->bottom:I

    invoke-direct {p1, v0, v1, v2, v3}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object p1

    .line 256
    :cond_4
    invoke-virtual {v0, p1}, Landroid/text/Layout;->getPrimaryHorizontal(I)F

    move-result p1

    float-to-double v0, p1

    .line 257
    new-instance p1, Landroid/graphics/Rect;

    iget v2, v4, Landroid/graphics/Rect;->left:I

    iget v3, v4, Landroid/graphics/Rect;->top:I

    double-to-int v0, v0

    iget v1, v4, Landroid/graphics/Rect;->bottom:I

    invoke-direct {p1, v2, v3, v0, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object p1

    :cond_5
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private final getLayoutFromHost()Landroid/text/Layout;
    .locals 3

    .line 143
    invoke-virtual {p0}, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate;->getHostView()Landroid/view/View;

    move-result-object v0

    instance-of v0, v0, Lcom/facebook/react/views/text/PreparedLayoutTextView;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 144
    invoke-virtual {p0}, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate;->getHostView()Landroid/view/View;

    move-result-object v0

    const-string v2, "null cannot be cast to non-null type com.facebook.react.views.text.PreparedLayoutTextView"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/facebook/react/views/text/PreparedLayoutTextView;

    invoke-virtual {v0}, Lcom/facebook/react/views/text/PreparedLayoutTextView;->getPreparedLayout()Lcom/facebook/react/views/text/PreparedLayout;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/facebook/react/views/text/PreparedLayout;->getLayout()Landroid/text/Layout;

    move-result-object v0

    return-object v0

    :cond_0
    return-object v1

    .line 145
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate;->getHostView()Landroid/view/View;

    move-result-object v0

    instance-of v0, v0, Landroid/widget/TextView;

    if-eqz v0, :cond_2

    .line 146
    invoke-virtual {p0}, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate;->getHostView()Landroid/view/View;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.widget.TextView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    move-result-object v0

    return-object v0

    :cond_2
    return-object v1
.end method

.method private final getSpannedFromHost()Landroid/text/Spanned;
    .locals 3

    .line 159
    invoke-virtual {p0}, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate;->getHostView()Landroid/view/View;

    move-result-object v0

    .line 160
    instance-of v1, v0, Lcom/facebook/react/views/text/PreparedLayoutTextView;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 161
    check-cast v0, Lcom/facebook/react/views/text/PreparedLayoutTextView;

    invoke-virtual {v0}, Lcom/facebook/react/views/text/PreparedLayoutTextView;->getPreparedLayout()Lcom/facebook/react/views/text/PreparedLayout;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/facebook/react/views/text/PreparedLayout;->getLayout()Landroid/text/Layout;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    instance-of v1, v0, Landroid/text/Spanned;

    if-eqz v1, :cond_1

    check-cast v0, Landroid/text/Spanned;

    return-object v0

    :cond_1
    return-object v2

    .line 162
    :cond_2
    instance-of v1, v0, Landroid/widget/TextView;

    if-eqz v1, :cond_3

    .line 163
    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    instance-of v1, v0, Landroid/text/Spanned;

    if-eqz v1, :cond_3

    check-cast v0, Landroid/text/Spanned;

    return-object v0

    :cond_3
    return-object v2
.end method


# virtual methods
.method public getAccessibilityNodeProvider(Landroid/view/View;)Landroidx/core/view/accessibility/AccessibilityNodeProviderCompat;
    .locals 1

    const-string v0, "host"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 268
    iget-object v0, p0, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate;->accessibilityLinks:Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate$AccessibilityLinks;

    if-eqz v0, :cond_0

    .line 269
    invoke-virtual {p0, p1}, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate;->superGetAccessibilityNodeProvider(Landroid/view/View;)Landroidx/core/view/accessibility/AccessibilityNodeProviderCompat;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method protected final getFirstSpan(IILjava/lang/Class;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(II",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 153
    invoke-direct {p0}, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate;->getSpannedFromHost()Landroid/text/Spanned;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 154
    :cond_0
    invoke-interface {v0, p1, p2, p3}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object p1

    .line 155
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    array-length p2, p1

    const/4 p3, 0x0

    if-nez p2, :cond_1

    const/4 p2, 0x1

    goto :goto_0

    :cond_1
    move p2, p3

    :goto_0
    if-nez p2, :cond_2

    aget-object p1, p1, p3

    return-object p1

    :cond_2
    return-object v1
.end method

.method protected getVirtualViewAt(FF)I
    .locals 3

    .line 114
    iget-object v0, p0, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate;->accessibilityLinks:Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate$AccessibilityLinks;

    const/high16 v1, -0x80000000

    if-nez v0, :cond_0

    return v1

    .line 115
    :cond_0
    invoke-virtual {v0}, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate$AccessibilityLinks;->size()I

    move-result v2

    if-eqz v2, :cond_5

    .line 116
    invoke-virtual {p0}, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate;->getHostView()Landroid/view/View;

    move-result-object v2

    instance-of v2, v2, Landroid/widget/TextView;

    if-nez v2, :cond_1

    invoke-virtual {p0}, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate;->getHostView()Landroid/view/View;

    move-result-object v2

    instance-of v2, v2, Lcom/facebook/react/views/text/PreparedLayoutTextView;

    if-nez v2, :cond_1

    goto :goto_0

    .line 122
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate;->getHostView()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr p1, v2

    .line 123
    invoke-virtual {p0}, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate;->getHostView()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr p2, v2

    .line 124
    invoke-virtual {p0}, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate;->getHostView()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getScrollX()I

    move-result v2

    int-to-float v2, v2

    add-float/2addr p1, v2

    .line 125
    invoke-virtual {p0}, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate;->getHostView()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getScrollY()I

    move-result v2

    int-to-float v2, v2

    add-float/2addr p2, v2

    .line 127
    invoke-direct {p0}, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate;->getLayoutFromHost()Landroid/text/Layout;

    move-result-object v2

    if-nez v2, :cond_2

    return v1

    :cond_2
    float-to-int p2, p2

    .line 128
    invoke-virtual {v2, p2}, Landroid/text/Layout;->getLineForVertical(I)I

    move-result p2

    .line 129
    invoke-virtual {v2, p2, p1}, Landroid/text/Layout;->getOffsetForHorizontal(IF)I

    move-result p1

    .line 132
    const-class p2, Landroid/text/style/ClickableSpan;

    invoke-virtual {p0, p1, p1, p2}, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate;->getFirstSpan(IILjava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/text/style/ClickableSpan;

    if-nez p1, :cond_3

    return v1

    .line 134
    :cond_3
    invoke-direct {p0}, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate;->getSpannedFromHost()Landroid/text/Spanned;

    move-result-object p2

    if-nez p2, :cond_4

    return v1

    .line 135
    :cond_4
    invoke-interface {p2, p1}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result v2

    .line 136
    invoke-interface {p2, p1}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result p1

    .line 138
    invoke-virtual {v0, v2, p1}, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate$AccessibilityLinks;->getLinkBySpanPos(II)Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate$AccessibilityLinks$AccessibleLink;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 139
    invoke-virtual {p1}, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate$AccessibilityLinks$AccessibleLink;->getId()I

    move-result p1

    return p1

    :cond_5
    :goto_0
    return v1
.end method

.method protected getVisibleVirtualViews(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    const-string/jumbo v0, "virtualViewIds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    iget-object v0, p0, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate;->accessibilityLinks:Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate$AccessibilityLinks;

    if-nez v0, :cond_0

    goto :goto_1

    .line 108
    :cond_0
    invoke-virtual {v0}, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate$AccessibilityLinks;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 109
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {p1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;)V
    .locals 1

    const-string v0, "host"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "info"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 170
    invoke-super {p0, p1, p2}, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;)V

    .line 173
    instance-of v0, p1, Lcom/facebook/react/views/text/PreparedLayoutTextView;

    if-eqz v0, :cond_0

    .line 174
    check-cast p1, Lcom/facebook/react/views/text/PreparedLayoutTextView;

    invoke-virtual {p1}, Lcom/facebook/react/views/text/PreparedLayoutTextView;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method protected onPerformActionForVirtualView(IILandroid/os/Bundle;)Z
    .locals 2

    .line 89
    iget-object p3, p0, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate;->accessibilityLinks:Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate$AccessibilityLinks;

    const/4 v0, 0x0

    if-nez p3, :cond_0

    return v0

    :cond_0
    if-eqz p3, :cond_3

    .line 93
    invoke-virtual {p3, p1}, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate$AccessibilityLinks;->getLinkById(I)Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate$AccessibilityLinks$AccessibleLink;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    .line 95
    :cond_1
    invoke-virtual {p1}, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate$AccessibilityLinks$AccessibleLink;->getStart()I

    move-result p3

    invoke-virtual {p1}, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate$AccessibilityLinks$AccessibleLink;->getEnd()I

    move-result p1

    const-class v1, Landroid/text/style/ClickableSpan;

    invoke-virtual {p0, p3, p1, v1}, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate;->getFirstSpan(IILjava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/text/style/ClickableSpan;

    if-nez p1, :cond_2

    return v0

    :cond_2
    const/16 p3, 0x10

    if-ne p2, p3, :cond_3

    .line 98
    invoke-virtual {p0}, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate;->getHostView()Landroid/view/View;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/text/style/ClickableSpan;->onClick(Landroid/view/View;)V

    const/4 p1, 0x1

    return p1

    :cond_3
    :goto_0
    return v0
.end method

.method protected onPopulateNodeForVirtualView(ILandroidx/core/view/accessibility/AccessibilityNodeInfoCompat;)V
    .locals 4

    const-string v0, "node"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 183
    iget-object v0, p0, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate;->accessibilityLinks:Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate$AccessibilityLinks;

    .line 184
    const-string v1, ""

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v0, :cond_0

    .line 185
    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {p2, v1}, Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 186
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1, v3, v3, v2, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    invoke-virtual {p2, p1}, Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;->setBoundsInParent(Landroid/graphics/Rect;)V

    return-void

    .line 191
    :cond_0
    invoke-virtual {v0, p1}, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate$AccessibilityLinks;->getLinkById(I)Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate$AccessibilityLinks$AccessibleLink;

    move-result-object p1

    if-nez p1, :cond_1

    .line 193
    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {p2, v1}, Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 194
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1, v3, v3, v2, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    invoke-virtual {p2, p1}, Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;->setBoundsInParent(Landroid/graphics/Rect;)V

    return-void

    .line 200
    :cond_1
    invoke-direct {p0, p1}, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate;->getBoundsInParent(Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate$AccessibilityLinks$AccessibleLink;)Landroid/graphics/Rect;

    move-result-object v0

    if-nez v0, :cond_2

    .line 202
    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {p2, v1}, Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 203
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1, v3, v3, v2, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    invoke-virtual {p2, p1}, Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;->setBoundsInParent(Landroid/graphics/Rect;)V

    return-void

    .line 207
    :cond_2
    invoke-virtual {p1}, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate$AccessibilityLinks$AccessibleLink;->getDescription()Ljava/lang/String;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {p2, p1}, Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;->setContentDescription(Ljava/lang/CharSequence;)V

    const/16 p1, 0x10

    .line 208
    invoke-virtual {p2, p1}, Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;->addAction(I)V

    .line 209
    invoke-virtual {p2, v0}, Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;->setBoundsInParent(Landroid/graphics/Rect;)V

    .line 210
    invoke-virtual {p0}, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate;->getHostView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v0, Lcom/facebook/react/R$string;->link_description:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {p2, p1}, Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;->setRoleDescription(Ljava/lang/CharSequence;)V

    .line 211
    sget-object p1, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityRole;->BUTTON:Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityRole;

    invoke-static {p1}, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityRole;->getValue(Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityRole;)Ljava/lang/String;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {p2, p1}, Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;->setClassName(Ljava/lang/CharSequence;)V

    return-void
.end method

.method protected onVirtualViewKeyboardFocusChanged(IZ)V
    .locals 3

    .line 63
    iget-object v0, p0, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate;->accessibilityLinks:Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate$AccessibilityLinks;

    if-nez v0, :cond_0

    goto/16 :goto_0

    :cond_0
    if-eqz v0, :cond_5

    .line 67
    invoke-virtual {v0, p1}, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate$AccessibilityLinks;->getLinkById(I)Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate$AccessibilityLinks$AccessibleLink;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    .line 69
    :cond_1
    invoke-virtual {p1}, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate$AccessibilityLinks$AccessibleLink;->getStart()I

    move-result v0

    invoke-virtual {p1}, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate$AccessibilityLinks$AccessibleLink;->getEnd()I

    move-result v1

    const-class v2, Landroid/text/style/ClickableSpan;

    invoke-virtual {p0, v0, v1, v2}, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate;->getFirstSpan(IILjava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/text/style/ClickableSpan;

    if-nez v0, :cond_2

    goto :goto_0

    .line 71
    :cond_2
    instance-of v1, v0, Lcom/facebook/react/views/text/internal/span/ReactClickableSpan;

    if-eqz v1, :cond_3

    invoke-virtual {p0}, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate;->getHostView()Landroid/view/View;

    move-result-object v1

    instance-of v1, v1, Landroid/widget/TextView;

    if-eqz v1, :cond_3

    .line 72
    check-cast v0, Lcom/facebook/react/views/text/internal/span/ReactClickableSpan;

    invoke-virtual {v0, p2}, Lcom/facebook/react/views/text/internal/span/ReactClickableSpan;->setKeyboardFocused(Z)V

    .line 73
    invoke-virtual {p0}, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate;->getHostView()Landroid/view/View;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type android.widget.TextView"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/widget/TextView;->getHighlightColor()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/facebook/react/views/text/internal/span/ReactClickableSpan;->setFocusBgColor(I)V

    .line 74
    invoke-virtual {p0}, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate;->getHostView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    return-void

    .line 75
    :cond_3
    invoke-virtual {p0}, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate;->getHostView()Landroid/view/View;

    move-result-object v0

    instance-of v0, v0, Lcom/facebook/react/views/text/PreparedLayoutTextView;

    if-eqz v0, :cond_5

    .line 76
    const-string v0, "null cannot be cast to non-null type com.facebook.react.views.text.PreparedLayoutTextView"

    if-eqz p2, :cond_4

    .line 77
    invoke-virtual {p0}, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate;->getHostView()Landroid/view/View;

    move-result-object p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lcom/facebook/react/views/text/PreparedLayoutTextView;

    invoke-virtual {p1}, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate$AccessibilityLinks$AccessibleLink;->getStart()I

    move-result v0

    invoke-virtual {p1}, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate$AccessibilityLinks$AccessibleLink;->getEnd()I

    move-result p1

    invoke-virtual {p2, v0, p1}, Lcom/facebook/react/views/text/PreparedLayoutTextView;->setSelection(II)V

    return-void

    .line 79
    :cond_4
    invoke-virtual {p0}, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate;->getHostView()Landroid/view/View;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/facebook/react/views/text/PreparedLayoutTextView;

    invoke-virtual {p1}, Lcom/facebook/react/views/text/PreparedLayoutTextView;->clearSelection()V

    :cond_5
    :goto_0
    return-void
.end method
