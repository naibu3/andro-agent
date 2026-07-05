.class public final Lcom/facebook/react/views/text/TextLayoutManager;
.super Ljava/lang/Object;
.source "TextLayoutManager.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/views/text/TextLayoutManager$AttachmentMetrics;,
        Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;,
        Lcom/facebook/react/views/text/TextLayoutManager$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00cc\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0014\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c0\u0002\u0018\u00002\u00020\u0001:\u0002yzB\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00052\u0006\u0010\'\u001a\u00020#J\u000e\u0010(\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0005J\u000e\u0010)\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020+J\u0012\u0010,\u001a\u0004\u0018\u00010\u001a2\u0006\u0010*\u001a\u00020+H\u0002J\u0012\u0010-\u001a\u00020\u00052\u0008\u0010.\u001a\u0004\u0018\u00010\u001aH\u0002J\"\u0010/\u001a\u0002002\u0006\u0010*\u001a\u00020+2\u0006\u00101\u001a\u00020#2\u0008\u0010.\u001a\u0004\u0018\u00010\u001aH\u0002J\u0018\u00102\u001a\u00020\u00052\u0006\u0010*\u001a\u00020+2\u0006\u00101\u001a\u00020#H\u0007J.\u00103\u001a\u00020%2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020+2\u0006\u00107\u001a\u0002082\u000c\u00109\u001a\u0008\u0012\u0004\u0012\u00020;0:H\u0002J\u0018\u0010<\u001a\u00020#2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020+H\u0002J \u0010=\u001a\u00020#2\u0006\u00104\u001a\u0002052\u0006\u0010*\u001a\u00020+2\u0008\u0010>\u001a\u0004\u0018\u00010?J\"\u0010@\u001a\u00020#2\u0006\u00104\u001a\u0002052\u0006\u0010*\u001a\u00020+2\u0008\u0010>\u001a\u0004\u0018\u00010?H\u0002Jl\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020#2\u0008\u0010D\u001a\u0004\u0018\u00010E2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020\u001f2\u0006\u0010K\u001a\u00020\u00052\u0006\u0010L\u001a\u00020\u00052\u0006\u0010M\u001a\u0002002\u0006\u0010N\u001a\u00020\u00052\u0008\u0010O\u001a\u0004\u0018\u00010P2\u0006\u0010Q\u001a\u00020\u00052\u0006\u0010R\u001a\u00020\u001dH\u0002J \u0010S\u001a\u00020%2\u0006\u0010R\u001a\u00020\u001d2\u0006\u0010T\u001a\u00020U2\u0006\u00104\u001a\u000205H\u0002J\u0018\u0010V\u001a\u00020\u001d2\u0006\u0010T\u001a\u00020U2\u0006\u00104\u001a\u000205H\u0002J\u0018\u0010W\u001a\u00020\u001d2\u0006\u0010T\u001a\u00020U2\u0006\u00104\u001a\u000205H\u0002JJ\u0010X\u001a\u00020B2\u0006\u00104\u001a\u0002052\u0006\u0010*\u001a\u00020+2\u0006\u0010Y\u001a\u00020+2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020I2\u0006\u0010Z\u001a\u00020G2\u0006\u0010[\u001a\u00020I2\u0008\u0010>\u001a\u0004\u0018\u00010?H\u0002JH\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020#2\u0006\u0010R\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020+2\u0006\u0010Y\u001a\u00020+2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020I2\u0006\u0010Z\u001a\u00020G2\u0006\u0010[\u001a\u00020IH\u0002JJ\u0010\\\u001a\u00020]2\u0006\u00104\u001a\u0002052\u0006\u0010*\u001a\u00020^2\u0006\u0010Y\u001a\u00020^2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020I2\u0006\u0010Z\u001a\u00020G2\u0006\u0010[\u001a\u00020I2\u0008\u0010>\u001a\u0004\u0018\u00010?H\u0007Jp\u0010_\u001a\u00020%2\u0006\u0010C\u001a\u00020#2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020I2\u0006\u0010Z\u001a\u00020G2\u0006\u0010[\u001a\u00020I2\u0006\u0010`\u001a\u00020G2\u0006\u0010a\u001a\u00020\u00052\u0006\u0010J\u001a\u00020\u001f2\u0006\u0010K\u001a\u00020\u00052\u0006\u0010L\u001a\u00020\u00052\u0006\u0010M\u001a\u0002002\u0006\u0010N\u001a\u00020\u00052\u0006\u0010R\u001a\u00020\u001dH\u0007JT\u0010b\u001a\u00020c2\u0006\u00104\u001a\u0002052\u0006\u0010*\u001a\u00020+2\u0006\u0010Y\u001a\u00020+2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020I2\u0006\u0010Z\u001a\u00020G2\u0006\u0010[\u001a\u00020I2\u0008\u0010>\u001a\u0004\u0018\u00010?2\u0008\u0010d\u001a\u0004\u0018\u00010eH\u0007J0\u0010f\u001a\u00020e2\u0006\u0010g\u001a\u00020]2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020I2\u0006\u0010Z\u001a\u00020G2\u0006\u0010[\u001a\u00020IH\u0007J0\u0010h\u001a\u00020G2\u0006\u0010i\u001a\u00020B2\u0006\u0010Y\u001a\u00020^2\u0006\u0010Z\u001a\u00020G2\u0006\u0010j\u001a\u00020I2\u0006\u0010a\u001a\u00020\u0005H\u0002J\u0018\u0010k\u001a\u00020\u00052\u0006\u0010i\u001a\u00020B2\u0006\u0010a\u001a\u00020\u0005H\u0002J0\u0010l\u001a\u00020G2\u0006\u0010i\u001a\u00020B2\u0006\u0010C\u001a\u00020m2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020I2\u0006\u0010n\u001a\u00020\u0005H\u0002J(\u0010o\u001a\u00020G2\u0006\u0010i\u001a\u00020B2\u0006\u0010Z\u001a\u00020G2\u0006\u0010[\u001a\u00020I2\u0006\u0010n\u001a\u00020\u0005H\u0002J@\u0010p\u001a\u00020\u00052\u0006\u0010i\u001a\u00020B2\u0006\u0010C\u001a\u00020m2\u0006\u0010q\u001a\u00020G2\u0006\u0010n\u001a\u00020\u00052\u0006\u0010r\u001a\u00020\u00052\u0006\u0010s\u001a\u00020G2\u0006\u0010t\u001a\u00020uH\u0002J:\u0010v\u001a\u00020w2\u0006\u00104\u001a\u0002052\u0006\u0010*\u001a\u00020+2\u0006\u0010Y\u001a\u00020+2\u0006\u0010F\u001a\u00020G2\u0006\u0010Z\u001a\u00020G2\u0008\u0010>\u001a\u0004\u0018\u00010?H\u0007J\u001a\u0010x\u001a\u0004\u0018\u00010E2\u0006\u0010C\u001a\u00020#2\u0006\u0010R\u001a\u00020\u001dH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001fX\u0082T\u00a2\u0006\u0002\n\u0000R\u001a\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020#0\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006{"
    }
    d2 = {
        "Lcom/facebook/react/views/text/TextLayoutManager;",
        "",
        "<init>",
        "()V",
        "AS_KEY_HASH",
        "",
        "AS_KEY_STRING",
        "AS_KEY_FRAGMENTS",
        "AS_KEY_CACHE_ID",
        "AS_KEY_BASE_ATTRIBUTES",
        "FR_KEY_STRING",
        "FR_KEY_REACT_TAG",
        "FR_KEY_IS_ATTACHMENT",
        "FR_KEY_WIDTH",
        "FR_KEY_HEIGHT",
        "FR_KEY_TEXT_ATTRIBUTES",
        "PA_KEY_MAX_NUMBER_OF_LINES",
        "PA_KEY_ELLIPSIZE_MODE",
        "PA_KEY_TEXT_BREAK_STRATEGY",
        "PA_KEY_ADJUST_FONT_SIZE_TO_FIT",
        "PA_KEY_INCLUDE_FONT_PADDING",
        "PA_KEY_HYPHENATION_FREQUENCY",
        "PA_KEY_MINIMUM_FONT_SIZE",
        "PA_KEY_MAXIMUM_FONT_SIZE",
        "PA_KEY_TEXT_ALIGN_VERTICAL",
        "TAG",
        "",
        "textPaintInstance",
        "Ljava/lang/ThreadLocal;",
        "Landroid/text/TextPaint;",
        "DEFAULT_INCLUDE_FONT_PADDING",
        "",
        "DEFAULT_ADJUST_FONT_SIZE_TO_FIT",
        "tagToSpannableCache",
        "Ljava/util/concurrent/ConcurrentHashMap;",
        "Landroid/text/Spannable;",
        "setCachedSpannableForTag",
        "",
        "reactTag",
        "sp",
        "deleteCachedSpannableForTag",
        "isRTL",
        "attributedString",
        "Lcom/facebook/react/common/mapbuffer/MapBuffer;",
        "getTextAlignmentAttr",
        "getTextJustificationMode",
        "alignmentAttr",
        "getTextAlignment",
        "Landroid/text/Layout$Alignment;",
        "spanned",
        "getTextGravity",
        "buildSpannableFromFragments",
        "context",
        "Landroid/content/Context;",
        "fragments",
        "sb",
        "Landroid/text/SpannableStringBuilder;",
        "ops",
        "",
        "Lcom/facebook/react/views/text/internal/span/SetSpanOperation;",
        "buildSpannableFromFragmentsOptimized",
        "getOrCreateSpannableForText",
        "reactTextViewManagerCallback",
        "Lcom/facebook/react/views/text/ReactTextViewManagerCallback;",
        "createSpannableFromAttributedString",
        "createLayout",
        "Landroid/text/Layout;",
        "text",
        "boring",
        "Landroid/text/BoringLayout$Metrics;",
        "width",
        "",
        "widthYogaMeasureMode",
        "Lcom/facebook/yoga/YogaMeasureMode;",
        "includeFontPadding",
        "textBreakStrategy",
        "hyphenationFrequency",
        "alignment",
        "justificationMode",
        "ellipsizeMode",
        "Landroid/text/TextUtils$TruncateAt;",
        "maxNumberOfLines",
        "paint",
        "updateTextPaint",
        "baseTextAttributes",
        "Lcom/facebook/react/views/text/TextAttributeProps;",
        "scratchPaintWithAttributes",
        "newPaintWithAttributes",
        "createLayoutForMeasurement",
        "paragraphAttributes",
        "height",
        "heightYogaMeasureMode",
        "createPreparedLayout",
        "Lcom/facebook/react/views/text/PreparedLayout;",
        "Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;",
        "adjustSpannableFontToFit",
        "minimumFontSizeAttr",
        "maximumNumberOfLines",
        "measureText",
        "",
        "attachmentsPositions",
        "",
        "measurePreparedLayout",
        "preparedLayout",
        "getVerticalOffset",
        "layout",
        "heightMeasureMode",
        "calculateLineCount",
        "calculateWidth",
        "Landroid/text/Spanned;",
        "calculatedLineCount",
        "calculateHeight",
        "nextAttachmentMetrics",
        "calculatedWidth",
        "i",
        "verticalOffset",
        "metrics",
        "Lcom/facebook/react/views/text/TextLayoutManager$AttachmentMetrics;",
        "measureLines",
        "Lcom/facebook/react/bridge/WritableArray;",
        "isBoring",
        "FragmentAttributes",
        "AttachmentMetrics",
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
.field public static final AS_KEY_BASE_ATTRIBUTES:I = 0x4

.field public static final AS_KEY_CACHE_ID:I = 0x3

.field public static final AS_KEY_FRAGMENTS:I = 0x2

.field public static final AS_KEY_HASH:I = 0x0

.field public static final AS_KEY_STRING:I = 0x1

.field private static final DEFAULT_ADJUST_FONT_SIZE_TO_FIT:Z = false

.field private static final DEFAULT_INCLUDE_FONT_PADDING:Z = true

.field public static final FR_KEY_HEIGHT:I = 0x4

.field public static final FR_KEY_IS_ATTACHMENT:I = 0x2

.field public static final FR_KEY_REACT_TAG:I = 0x1

.field public static final FR_KEY_STRING:I = 0x0

.field public static final FR_KEY_TEXT_ATTRIBUTES:I = 0x5

.field public static final FR_KEY_WIDTH:I = 0x3

.field public static final INSTANCE:Lcom/facebook/react/views/text/TextLayoutManager;

.field public static final PA_KEY_ADJUST_FONT_SIZE_TO_FIT:I = 0x3

.field public static final PA_KEY_ELLIPSIZE_MODE:I = 0x1

.field public static final PA_KEY_HYPHENATION_FREQUENCY:I = 0x5

.field public static final PA_KEY_INCLUDE_FONT_PADDING:I = 0x4

.field public static final PA_KEY_MAXIMUM_FONT_SIZE:I = 0x7

.field public static final PA_KEY_MAX_NUMBER_OF_LINES:I = 0x0

.field public static final PA_KEY_MINIMUM_FONT_SIZE:I = 0x6

.field public static final PA_KEY_TEXT_ALIGN_VERTICAL:I = 0x8

.field public static final PA_KEY_TEXT_BREAK_STRATEGY:I = 0x2

.field private static final TAG:Ljava/lang/String;

.field private static final tagToSpannableCache:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/Integer;",
            "Landroid/text/Spannable;",
            ">;"
        }
    .end annotation
.end field

.field private static final textPaintInstance:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Landroid/text/TextPaint;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/react/views/text/TextLayoutManager;

    invoke-direct {v0}, Lcom/facebook/react/views/text/TextLayoutManager;-><init>()V

    sput-object v0, Lcom/facebook/react/views/text/TextLayoutManager;->INSTANCE:Lcom/facebook/react/views/text/TextLayoutManager;

    .line 90
    const-string v0, "getSimpleName(...)"

    const-string v1, "TextLayoutManager"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v1, Lcom/facebook/react/views/text/TextLayoutManager;->TAG:Ljava/lang/String;

    .line 95
    new-instance v0, Lcom/facebook/react/views/text/TextLayoutManager$textPaintInstance$1;

    invoke-direct {v0}, Lcom/facebook/react/views/text/TextLayoutManager$textPaintInstance$1;-><init>()V

    check-cast v0, Ljava/lang/ThreadLocal;

    sput-object v0, Lcom/facebook/react/views/text/TextLayoutManager;->textPaintInstance:Ljava/lang/ThreadLocal;

    .line 103
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lcom/facebook/react/views/text/TextLayoutManager;->tagToSpannableCache:Ljava/util/concurrent/ConcurrentHashMap;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final adjustSpannableFontToFit(Landroid/text/Spannable;FLcom/facebook/yoga/YogaMeasureMode;FLcom/facebook/yoga/YogaMeasureMode;FIZIILandroid/text/Layout$Alignment;ILandroid/text/TextPaint;)V
    .locals 19
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v13, p4

    move/from16 v14, p6

    move-object/from16 v12, p12

    const-string/jumbo v0, "text"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "widthYogaMeasureMode"

    move-object/from16 v4, p2

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "heightYogaMeasureMode"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "alignment"

    move-object/from16 v8, p10

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paint"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 801
    sget-object v0, Lcom/facebook/react/views/text/TextLayoutManager;->INSTANCE:Lcom/facebook/react/views/text/TextLayoutManager;

    invoke-direct {v0, v1, v12}, Lcom/facebook/react/views/text/TextLayoutManager;->isBoring(Landroid/text/Spannable;Landroid/text/TextPaint;)Landroid/text/BoringLayout$Metrics;

    move-result-object v2

    const/4 v10, 0x0

    const/4 v11, -0x1

    move/from16 v3, p1

    move/from16 v5, p7

    move/from16 v6, p8

    move/from16 v7, p9

    move/from16 v9, p11

    .line 803
    invoke-direct/range {v0 .. v12}, Lcom/facebook/react/views/text/TextLayoutManager;->createLayout(Landroid/text/Spannable;Landroid/text/BoringLayout$Metrics;FLcom/facebook/yoga/YogaMeasureMode;ZIILandroid/text/Layout$Alignment;ILandroid/text/TextUtils$TruncateAt;ILandroid/text/TextPaint;)Landroid/text/Layout;

    move-result-object v0

    .line 819
    invoke-static/range {p5 .. p5}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-eqz v3, :cond_0

    sget-object v3, Lcom/facebook/react/uimanager/PixelUtil;->INSTANCE:Lcom/facebook/react/uimanager/PixelUtil;

    const/4 v4, 0x4

    invoke-virtual {v3, v4}, Lcom/facebook/react/uimanager/PixelUtil;->dpToPx(I)F

    move-result v3

    goto :goto_0

    :cond_0
    move/from16 v3, p5

    :goto_0
    float-to-int v15, v3

    .line 823
    invoke-interface {v1}, Landroid/text/Spannable;->length()I

    move-result v3

    const-class v4, Lcom/facebook/react/views/text/internal/span/ReactAbsoluteSizeSpan;

    const/4 v5, 0x0

    invoke-interface {v1, v5, v3, v4}, Landroid/text/Spannable;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Lcom/facebook/react/views/text/internal/span/ReactAbsoluteSizeSpan;

    .line 824
    invoke-static {v3}, Lkotlin/jvm/internal/ArrayIteratorKt;->iterator([Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v3

    move v4, v15

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/react/views/text/internal/span/ReactAbsoluteSizeSpan;

    .line 825
    invoke-virtual {v6}, Lcom/facebook/react/views/text/internal/span/ReactAbsoluteSizeSpan;->getSize()I

    move-result v6

    invoke-static {v4, v6}, Ljava/lang/Math;->max(II)I

    move-result v4

    goto :goto_1

    :cond_1
    move v3, v4

    :goto_2
    if-le v3, v15, :cond_7

    const/4 v6, -0x1

    const/4 v7, 0x1

    if-eq v14, v6, :cond_2

    if-eqz v14, :cond_2

    .line 832
    invoke-virtual {v0}, Landroid/text/Layout;->getLineCount()I

    move-result v6

    if-gt v6, v14, :cond_4

    .line 833
    :cond_2
    sget-object v6, Lcom/facebook/yoga/YogaMeasureMode;->UNDEFINED:Lcom/facebook/yoga/YogaMeasureMode;

    if-eq v13, v6, :cond_3

    invoke-virtual {v0}, Landroid/text/Layout;->getHeight()I

    move-result v6

    int-to-float v6, v6

    cmpl-float v6, v6, p3

    if-gtz v6, :cond_4

    .line 834
    :cond_3
    invoke-interface {v1}, Landroid/text/Spannable;->length()I

    move-result v6

    if-ne v6, v7, :cond_7

    invoke-virtual {v0, v5}, Landroid/text/Layout;->getLineWidth(I)F

    move-result v0

    cmpl-float v0, v0, p1

    if-lez v0, :cond_7

    .line 837
    :cond_4
    sget-object v0, Lcom/facebook/react/uimanager/PixelUtil;->INSTANCE:Lcom/facebook/react/uimanager/PixelUtil;

    invoke-virtual {v0, v7}, Lcom/facebook/react/uimanager/PixelUtil;->dpToPx(I)F

    move-result v0

    float-to-int v0, v0

    invoke-static {v7, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    sub-int v0, v3, v0

    int-to-float v3, v0

    int-to-float v6, v4

    div-float/2addr v3, v6

    .line 840
    invoke-virtual {v12}, Landroid/text/TextPaint;->getTextSize()F

    move-result v6

    mul-float/2addr v6, v3

    float-to-int v6, v6

    invoke-static {v6, v15}, Ljava/lang/Math;->max(II)I

    move-result v6

    int-to-float v6, v6

    invoke-virtual {v12, v6}, Landroid/text/TextPaint;->setTextSize(F)V

    .line 842
    invoke-interface {v1}, Landroid/text/Spannable;->length()I

    move-result v6

    const-class v7, Lcom/facebook/react/views/text/internal/span/ReactAbsoluteSizeSpan;

    invoke-interface {v1, v5, v6, v7}, Landroid/text/Spannable;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v6

    check-cast v6, [Lcom/facebook/react/views/text/internal/span/ReactAbsoluteSizeSpan;

    .line 843
    invoke-static {v6}, Lkotlin/jvm/internal/ArrayIteratorKt;->iterator([Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v6

    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/facebook/react/views/text/internal/span/ReactAbsoluteSizeSpan;

    .line 845
    new-instance v8, Lcom/facebook/react/views/text/internal/span/ReactAbsoluteSizeSpan;

    invoke-virtual {v7}, Lcom/facebook/react/views/text/internal/span/ReactAbsoluteSizeSpan;->getSize()I

    move-result v9

    int-to-float v9, v9

    mul-float/2addr v9, v3

    float-to-int v9, v9

    invoke-static {v9, v15}, Ljava/lang/Math;->max(II)I

    move-result v9

    invoke-direct {v8, v9}, Lcom/facebook/react/views/text/internal/span/ReactAbsoluteSizeSpan;-><init>(I)V

    .line 846
    invoke-interface {v1, v7}, Landroid/text/Spannable;->getSpanStart(Ljava/lang/Object;)I

    move-result v9

    .line 847
    invoke-interface {v1, v7}, Landroid/text/Spannable;->getSpanEnd(Ljava/lang/Object;)I

    move-result v10

    .line 848
    invoke-interface {v1, v7}, Landroid/text/Spannable;->getSpanFlags(Ljava/lang/Object;)I

    move-result v11

    .line 844
    invoke-interface {v1, v8, v9, v10, v11}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 849
    invoke-interface {v1, v7}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    goto :goto_3

    :cond_5
    if-eqz v2, :cond_6

    .line 852
    sget-object v2, Lcom/facebook/react/views/text/TextLayoutManager;->INSTANCE:Lcom/facebook/react/views/text/TextLayoutManager;

    invoke-direct {v2, v1, v12}, Lcom/facebook/react/views/text/TextLayoutManager;->isBoring(Landroid/text/Spannable;Landroid/text/TextPaint;)Landroid/text/BoringLayout$Metrics;

    move-result-object v2

    :cond_6
    move v3, v0

    .line 855
    sget-object v0, Lcom/facebook/react/views/text/TextLayoutManager;->INSTANCE:Lcom/facebook/react/views/text/TextLayoutManager;

    const/4 v10, 0x0

    const/4 v11, -0x1

    move/from16 v6, p8

    move/from16 v7, p9

    move-object/from16 v8, p10

    move/from16 v9, p11

    move/from16 v16, v3

    move/from16 v17, v4

    move/from16 v18, v5

    move/from16 v3, p1

    move-object/from16 v4, p2

    move/from16 v5, p7

    invoke-direct/range {v0 .. v12}, Lcom/facebook/react/views/text/TextLayoutManager;->createLayout(Landroid/text/Spannable;Landroid/text/BoringLayout$Metrics;FLcom/facebook/yoga/YogaMeasureMode;ZIILandroid/text/Layout$Alignment;ILandroid/text/TextUtils$TruncateAt;ILandroid/text/TextPaint;)Landroid/text/Layout;

    move-result-object v0

    move-object/from16 v1, p0

    move-object/from16 v12, p12

    move/from16 v3, v16

    move/from16 v4, v17

    move/from16 v5, v18

    goto/16 :goto_2

    :cond_7
    return-void
.end method

.method private final buildSpannableFromFragments(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/MapBuffer;Landroid/text/SpannableStringBuilder;Ljava/util/List;)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/facebook/react/common/mapbuffer/MapBuffer;",
            "Landroid/text/SpannableStringBuilder;",
            "Ljava/util/List<",
            "Lcom/facebook/react/views/text/internal/span/SetSpanOperation;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p4

    .line 223
    invoke-interface/range {p2 .. p2}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getCount()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_10

    move-object/from16 v4, p2

    .line 224
    invoke-interface {v4, v3}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getMapBuffer(I)Lcom/facebook/react/common/mapbuffer/MapBuffer;

    move-result-object v5

    .line 225
    invoke-virtual/range {p3 .. p3}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v6

    const/4 v7, 0x5

    .line 228
    invoke-interface {v5, v7}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getMapBuffer(I)Lcom/facebook/react/common/mapbuffer/MapBuffer;

    move-result-object v7

    invoke-static {v7}, Lcom/facebook/react/views/text/TextAttributeProps;->fromMapBuffer(Lcom/facebook/react/common/mapbuffer/MapBuffer;)Lcom/facebook/react/views/text/TextAttributeProps;

    move-result-object v7

    const-string v8, "fromMapBuffer(...)"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 231
    sget-object v8, Lcom/facebook/react/views/text/TextTransform;->Companion:Lcom/facebook/react/views/text/TextTransform$Companion;

    invoke-interface {v5, v2}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getString(I)Ljava/lang/String;

    move-result-object v9

    iget-object v10, v7, Lcom/facebook/react/views/text/TextAttributeProps;->mTextTransform:Lcom/facebook/react/views/text/TextTransform;

    invoke-virtual {v8, v9, v10}, Lcom/facebook/react/views/text/TextTransform$Companion;->apply(Ljava/lang/String;Lcom/facebook/react/views/text/TextTransform;)Ljava/lang/String;

    move-result-object v8

    check-cast v8, Ljava/lang/CharSequence;

    move-object/from16 v9, p3

    .line 230
    invoke-virtual {v9, v8}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 233
    invoke-virtual {v9}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v8

    const/4 v10, 0x1

    .line 235
    invoke-interface {v5, v10}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->contains(I)Z

    move-result v11

    const/4 v12, -0x1

    if-eqz v11, :cond_0

    invoke-interface {v5, v10}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getInt(I)I

    move-result v11

    goto :goto_1

    :cond_0
    move v11, v12

    :goto_1
    const/4 v13, 0x2

    .line 236
    invoke-interface {v5, v13}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->contains(I)Z

    move-result v14

    if-eqz v14, :cond_1

    invoke-interface {v5, v13}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getBoolean(I)Z

    move-result v13

    if-eqz v13, :cond_1

    const/4 v6, 0x3

    .line 237
    invoke-interface {v5, v6}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getDouble(I)D

    move-result-wide v6

    invoke-static {v6, v7}, Lcom/facebook/react/uimanager/PixelUtil;->toPixelFromSP(D)F

    move-result v6

    const/4 v7, 0x4

    .line 238
    invoke-interface {v5, v7}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getDouble(I)D

    move-result-wide v7

    invoke-static {v7, v8}, Lcom/facebook/react/uimanager/PixelUtil;->toPixelFromSP(D)F

    move-result v5

    .line 240
    new-instance v7, Lcom/facebook/react/views/text/internal/span/SetSpanOperation;

    .line 241
    invoke-virtual {v9}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v8

    sub-int/2addr v8, v10

    .line 242
    invoke-virtual {v9}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v10

    .line 243
    new-instance v12, Lcom/facebook/react/views/text/internal/span/TextInlineViewPlaceholderSpan;

    float-to-int v6, v6

    float-to-int v5, v5

    invoke-direct {v12, v11, v6, v5}, Lcom/facebook/react/views/text/internal/span/TextInlineViewPlaceholderSpan;-><init>(III)V

    check-cast v12, Lcom/facebook/react/views/text/internal/span/ReactSpan;

    .line 240
    invoke-direct {v7, v8, v10, v12}, Lcom/facebook/react/views/text/internal/span/SetSpanOperation;-><init>(IILcom/facebook/react/views/text/internal/span/ReactSpan;)V

    .line 239
    invoke-interface {v0, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_6

    :cond_1
    if-lt v8, v6, :cond_f

    .line 246
    iget-object v5, v7, Lcom/facebook/react/views/text/TextAttributeProps;->mRole:Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Role;

    if-eqz v5, :cond_2

    .line 247
    iget-object v5, v7, Lcom/facebook/react/views/text/TextAttributeProps;->mRole:Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Role;

    sget-object v10, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Role;->LINK:Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Role;

    if-ne v5, v10, :cond_3

    goto :goto_2

    .line 249
    :cond_2
    iget-object v5, v7, Lcom/facebook/react/views/text/TextAttributeProps;->mAccessibilityRole:Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityRole;

    .line 250
    sget-object v10, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityRole;->LINK:Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityRole;

    if-ne v5, v10, :cond_3

    .line 252
    :goto_2
    new-instance v5, Lcom/facebook/react/views/text/internal/span/SetSpanOperation;

    new-instance v10, Lcom/facebook/react/views/text/internal/span/ReactClickableSpan;

    invoke-direct {v10, v11}, Lcom/facebook/react/views/text/internal/span/ReactClickableSpan;-><init>(I)V

    check-cast v10, Lcom/facebook/react/views/text/internal/span/ReactSpan;

    invoke-direct {v5, v6, v8, v10}, Lcom/facebook/react/views/text/internal/span/SetSpanOperation;-><init>(IILcom/facebook/react/views/text/internal/span/ReactSpan;)V

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 254
    :cond_3
    iget-boolean v5, v7, Lcom/facebook/react/views/text/TextAttributeProps;->mIsColorSet:Z

    if-eqz v5, :cond_4

    .line 255
    new-instance v5, Lcom/facebook/react/views/text/internal/span/SetSpanOperation;

    new-instance v10, Lcom/facebook/react/views/text/internal/span/ReactForegroundColorSpan;

    iget v13, v7, Lcom/facebook/react/views/text/TextAttributeProps;->mColor:I

    invoke-direct {v10, v13}, Lcom/facebook/react/views/text/internal/span/ReactForegroundColorSpan;-><init>(I)V

    check-cast v10, Lcom/facebook/react/views/text/internal/span/ReactSpan;

    invoke-direct {v5, v6, v8, v10}, Lcom/facebook/react/views/text/internal/span/SetSpanOperation;-><init>(IILcom/facebook/react/views/text/internal/span/ReactSpan;)V

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 257
    :cond_4
    iget-boolean v5, v7, Lcom/facebook/react/views/text/TextAttributeProps;->mIsBackgroundColorSet:Z

    if-eqz v5, :cond_5

    .line 259
    new-instance v5, Lcom/facebook/react/views/text/internal/span/SetSpanOperation;

    .line 260
    new-instance v10, Lcom/facebook/react/views/text/internal/span/ReactBackgroundColorSpan;

    iget v13, v7, Lcom/facebook/react/views/text/TextAttributeProps;->mBackgroundColor:I

    invoke-direct {v10, v13}, Lcom/facebook/react/views/text/internal/span/ReactBackgroundColorSpan;-><init>(I)V

    check-cast v10, Lcom/facebook/react/views/text/internal/span/ReactSpan;

    .line 259
    invoke-direct {v5, v6, v8, v10}, Lcom/facebook/react/views/text/internal/span/SetSpanOperation;-><init>(IILcom/facebook/react/views/text/internal/span/ReactSpan;)V

    .line 258
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 262
    :cond_5
    invoke-virtual {v7}, Lcom/facebook/react/views/text/TextAttributeProps;->getOpacity()F

    move-result v5

    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    move-result v5

    if-nez v5, :cond_6

    .line 263
    new-instance v5, Lcom/facebook/react/views/text/internal/span/SetSpanOperation;

    new-instance v10, Lcom/facebook/react/views/text/internal/span/ReactOpacitySpan;

    invoke-virtual {v7}, Lcom/facebook/react/views/text/TextAttributeProps;->getOpacity()F

    move-result v13

    invoke-direct {v10, v13}, Lcom/facebook/react/views/text/internal/span/ReactOpacitySpan;-><init>(F)V

    check-cast v10, Lcom/facebook/react/views/text/internal/span/ReactSpan;

    invoke-direct {v5, v6, v8, v10}, Lcom/facebook/react/views/text/internal/span/SetSpanOperation;-><init>(IILcom/facebook/react/views/text/internal/span/ReactSpan;)V

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 265
    :cond_6
    invoke-virtual {v7}, Lcom/facebook/react/views/text/TextAttributeProps;->getLetterSpacing()F

    move-result v5

    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    move-result v5

    if-nez v5, :cond_7

    .line 267
    new-instance v5, Lcom/facebook/react/views/text/internal/span/SetSpanOperation;

    new-instance v10, Lcom/facebook/react/views/text/internal/span/CustomLetterSpacingSpan;

    invoke-virtual {v7}, Lcom/facebook/react/views/text/TextAttributeProps;->getLetterSpacing()F

    move-result v13

    invoke-direct {v10, v13}, Lcom/facebook/react/views/text/internal/span/CustomLetterSpacingSpan;-><init>(F)V

    check-cast v10, Lcom/facebook/react/views/text/internal/span/ReactSpan;

    invoke-direct {v5, v6, v8, v10}, Lcom/facebook/react/views/text/internal/span/SetSpanOperation;-><init>(IILcom/facebook/react/views/text/internal/span/ReactSpan;)V

    .line 266
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 269
    :cond_7
    new-instance v5, Lcom/facebook/react/views/text/internal/span/SetSpanOperation;

    new-instance v10, Lcom/facebook/react/views/text/internal/span/ReactAbsoluteSizeSpan;

    iget v13, v7, Lcom/facebook/react/views/text/TextAttributeProps;->mFontSize:I

    invoke-direct {v10, v13}, Lcom/facebook/react/views/text/internal/span/ReactAbsoluteSizeSpan;-><init>(I)V

    check-cast v10, Lcom/facebook/react/views/text/internal/span/ReactSpan;

    invoke-direct {v5, v6, v8, v10}, Lcom/facebook/react/views/text/internal/span/SetSpanOperation;-><init>(IILcom/facebook/react/views/text/internal/span/ReactSpan;)V

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 270
    iget v5, v7, Lcom/facebook/react/views/text/TextAttributeProps;->mFontStyle:I

    if-ne v5, v12, :cond_9

    .line 271
    iget v5, v7, Lcom/facebook/react/views/text/TextAttributeProps;->mFontWeight:I

    if-ne v5, v12, :cond_9

    .line 272
    iget-object v5, v7, Lcom/facebook/react/views/text/TextAttributeProps;->mFontFamily:Ljava/lang/String;

    if-eqz v5, :cond_8

    goto :goto_3

    :cond_8
    move/from16 v18, v1

    goto :goto_4

    .line 274
    :cond_9
    :goto_3
    new-instance v5, Lcom/facebook/react/views/text/internal/span/SetSpanOperation;

    .line 277
    new-instance v12, Lcom/facebook/react/views/text/internal/span/CustomStyleSpan;

    .line 278
    iget v13, v7, Lcom/facebook/react/views/text/TextAttributeProps;->mFontStyle:I

    .line 279
    iget v14, v7, Lcom/facebook/react/views/text/TextAttributeProps;->mFontWeight:I

    .line 280
    iget-object v15, v7, Lcom/facebook/react/views/text/TextAttributeProps;->mFontFeatureSettings:Ljava/lang/String;

    .line 281
    iget-object v10, v7, Lcom/facebook/react/views/text/TextAttributeProps;->mFontFamily:Ljava/lang/String;

    .line 282
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v2

    move/from16 v18, v1

    const-string v1, "getAssets(...)"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v17, v2

    move-object/from16 v16, v10

    .line 277
    invoke-direct/range {v12 .. v17}, Lcom/facebook/react/views/text/internal/span/CustomStyleSpan;-><init>(IILjava/lang/String;Ljava/lang/String;Landroid/content/res/AssetManager;)V

    check-cast v12, Lcom/facebook/react/views/text/internal/span/ReactSpan;

    .line 274
    invoke-direct {v5, v6, v8, v12}, Lcom/facebook/react/views/text/internal/span/SetSpanOperation;-><init>(IILcom/facebook/react/views/text/internal/span/ReactSpan;)V

    .line 273
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 284
    :goto_4
    iget-boolean v1, v7, Lcom/facebook/react/views/text/TextAttributeProps;->mIsUnderlineTextDecorationSet:Z

    if-eqz v1, :cond_a

    .line 285
    new-instance v1, Lcom/facebook/react/views/text/internal/span/SetSpanOperation;

    new-instance v2, Lcom/facebook/react/views/text/internal/span/ReactUnderlineSpan;

    invoke-direct {v2}, Lcom/facebook/react/views/text/internal/span/ReactUnderlineSpan;-><init>()V

    check-cast v2, Lcom/facebook/react/views/text/internal/span/ReactSpan;

    invoke-direct {v1, v6, v8, v2}, Lcom/facebook/react/views/text/internal/span/SetSpanOperation;-><init>(IILcom/facebook/react/views/text/internal/span/ReactSpan;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 287
    :cond_a
    iget-boolean v1, v7, Lcom/facebook/react/views/text/TextAttributeProps;->mIsLineThroughTextDecorationSet:Z

    if-eqz v1, :cond_b

    .line 288
    new-instance v1, Lcom/facebook/react/views/text/internal/span/SetSpanOperation;

    new-instance v2, Lcom/facebook/react/views/text/internal/span/ReactStrikethroughSpan;

    invoke-direct {v2}, Lcom/facebook/react/views/text/internal/span/ReactStrikethroughSpan;-><init>()V

    check-cast v2, Lcom/facebook/react/views/text/internal/span/ReactSpan;

    invoke-direct {v1, v6, v8, v2}, Lcom/facebook/react/views/text/internal/span/SetSpanOperation;-><init>(IILcom/facebook/react/views/text/internal/span/ReactSpan;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 290
    :cond_b
    iget v1, v7, Lcom/facebook/react/views/text/TextAttributeProps;->mTextShadowOffsetDx:F

    const/4 v2, 0x0

    cmpg-float v1, v1, v2

    if-nez v1, :cond_c

    .line 291
    iget v1, v7, Lcom/facebook/react/views/text/TextAttributeProps;->mTextShadowOffsetDy:F

    cmpg-float v1, v1, v2

    if-nez v1, :cond_c

    .line 292
    iget v1, v7, Lcom/facebook/react/views/text/TextAttributeProps;->mTextShadowRadius:F

    cmpg-float v1, v1, v2

    if-nez v1, :cond_c

    goto :goto_5

    .line 293
    :cond_c
    iget v1, v7, Lcom/facebook/react/views/text/TextAttributeProps;->mTextShadowColor:I

    invoke-static {v1}, Landroid/graphics/Color;->alpha(I)I

    move-result v1

    if-eqz v1, :cond_d

    .line 295
    new-instance v1, Lcom/facebook/react/views/text/internal/span/SetSpanOperation;

    .line 298
    new-instance v2, Lcom/facebook/react/views/text/internal/span/ShadowStyleSpan;

    .line 299
    iget v5, v7, Lcom/facebook/react/views/text/TextAttributeProps;->mTextShadowOffsetDx:F

    .line 300
    iget v10, v7, Lcom/facebook/react/views/text/TextAttributeProps;->mTextShadowOffsetDy:F

    .line 301
    iget v12, v7, Lcom/facebook/react/views/text/TextAttributeProps;->mTextShadowRadius:F

    .line 302
    iget v13, v7, Lcom/facebook/react/views/text/TextAttributeProps;->mTextShadowColor:I

    .line 298
    invoke-direct {v2, v5, v10, v12, v13}, Lcom/facebook/react/views/text/internal/span/ShadowStyleSpan;-><init>(FFFI)V

    check-cast v2, Lcom/facebook/react/views/text/internal/span/ReactSpan;

    .line 295
    invoke-direct {v1, v6, v8, v2}, Lcom/facebook/react/views/text/internal/span/SetSpanOperation;-><init>(IILcom/facebook/react/views/text/internal/span/ReactSpan;)V

    .line 294
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 304
    :cond_d
    :goto_5
    invoke-virtual {v7}, Lcom/facebook/react/views/text/TextAttributeProps;->getEffectiveLineHeight()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-nez v1, :cond_e

    .line 306
    new-instance v1, Lcom/facebook/react/views/text/internal/span/SetSpanOperation;

    .line 307
    new-instance v2, Lcom/facebook/react/views/text/internal/span/CustomLineHeightSpan;

    invoke-virtual {v7}, Lcom/facebook/react/views/text/TextAttributeProps;->getEffectiveLineHeight()F

    move-result v5

    invoke-direct {v2, v5}, Lcom/facebook/react/views/text/internal/span/CustomLineHeightSpan;-><init>(F)V

    check-cast v2, Lcom/facebook/react/views/text/internal/span/ReactSpan;

    .line 306
    invoke-direct {v1, v6, v8, v2}, Lcom/facebook/react/views/text/internal/span/SetSpanOperation;-><init>(IILcom/facebook/react/views/text/internal/span/ReactSpan;)V

    .line 305
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 310
    :cond_e
    new-instance v1, Lcom/facebook/react/views/text/internal/span/SetSpanOperation;

    new-instance v2, Lcom/facebook/react/views/text/internal/span/ReactTagSpan;

    invoke-direct {v2, v11}, Lcom/facebook/react/views/text/internal/span/ReactTagSpan;-><init>(I)V

    check-cast v2, Lcom/facebook/react/views/text/internal/span/ReactSpan;

    invoke-direct {v1, v6, v8, v2}, Lcom/facebook/react/views/text/internal/span/SetSpanOperation;-><init>(IILcom/facebook/react/views/text/internal/span/ReactSpan;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_f
    :goto_6
    move/from16 v18, v1

    :goto_7
    add-int/lit8 v3, v3, 0x1

    move/from16 v1, v18

    const/4 v2, 0x0

    goto/16 :goto_0

    :cond_10
    return-void
.end method

.method private final buildSpannableFromFragmentsOptimized(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/MapBuffer;)Landroid/text/Spannable;
    .locals 20

    .line 328
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 329
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface/range {p2 .. p2}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getCount()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 331
    invoke-interface/range {p2 .. p2}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getCount()I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    const/4 v5, -0x1

    if-ge v4, v2, :cond_4

    move-object/from16 v6, p2

    .line 332
    invoke-interface {v6, v4}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getMapBuffer(I)Lcom/facebook/react/common/mapbuffer/MapBuffer;

    move-result-object v7

    const/4 v8, 0x5

    .line 333
    invoke-interface {v7, v8}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getMapBuffer(I)Lcom/facebook/react/common/mapbuffer/MapBuffer;

    move-result-object v8

    invoke-static {v8}, Lcom/facebook/react/views/text/TextAttributeProps;->fromMapBuffer(Lcom/facebook/react/common/mapbuffer/MapBuffer;)Lcom/facebook/react/views/text/TextAttributeProps;

    move-result-object v10

    const-string v8, "fromMapBuffer(...)"

    invoke-static {v10, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 334
    sget-object v8, Lcom/facebook/react/views/text/TextTransform;->Companion:Lcom/facebook/react/views/text/TextTransform$Companion;

    invoke-interface {v7, v3}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getString(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v10}, Lcom/facebook/react/views/text/TextAttributeProps;->getTextTransform()Lcom/facebook/react/views/text/TextTransform;

    move-result-object v11

    invoke-virtual {v8, v9, v11}, Lcom/facebook/react/views/text/TextTransform$Companion;->apply(Ljava/lang/String;Lcom/facebook/react/views/text/TextTransform;)Ljava/lang/String;

    move-result-object v8

    .line 335
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 337
    new-instance v9, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;

    .line 339
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v11

    const/4 v8, 0x1

    .line 341
    invoke-interface {v7, v8}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->contains(I)Z

    move-result v12

    if-eqz v12, :cond_0

    .line 342
    invoke-interface {v7, v8}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getInt(I)I

    move-result v5

    :cond_0
    move v12, v5

    const/4 v5, 0x2

    .line 347
    invoke-interface {v7, v5}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->contains(I)Z

    move-result v13

    if-eqz v13, :cond_1

    .line 348
    invoke-interface {v7, v5}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getBoolean(I)Z

    move-result v5

    if-eqz v5, :cond_1

    move v13, v8

    goto :goto_1

    :cond_1
    move v13, v3

    :goto_1
    const/4 v5, 0x3

    .line 350
    invoke-interface {v7, v5}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->contains(I)Z

    move-result v8

    const-wide/high16 v14, 0x7ff8000000000000L    # Double.NaN

    if-eqz v8, :cond_2

    .line 351
    invoke-interface {v7, v5}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getDouble(I)D

    move-result-wide v16

    goto :goto_2

    :cond_2
    move-wide/from16 v16, v14

    :goto_2
    const/4 v5, 0x4

    .line 356
    invoke-interface {v7, v5}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->contains(I)Z

    move-result v8

    if-eqz v8, :cond_3

    .line 357
    invoke-interface {v7, v5}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getDouble(I)D

    move-result-wide v14

    :cond_3
    move-wide/from16 v18, v16

    move-wide/from16 v16, v14

    move-wide/from16 v14, v18

    .line 337
    invoke-direct/range {v9 .. v17}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;-><init>(Lcom/facebook/react/views/text/TextAttributeProps;IIZDD)V

    .line 336
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 363
    :cond_4
    new-instance v2, Landroid/text/SpannableString;

    check-cast v0, Ljava/lang/CharSequence;

    invoke-direct {v2, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 366
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-string v1, "iterator(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_14

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    const-string v4, "next(...)"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;

    .line 367
    invoke-virtual {v1}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getLength()I

    move-result v4

    add-int/2addr v4, v3

    if-nez v3, :cond_5

    const/16 v6, 0x12

    goto :goto_4

    :cond_5
    const/16 v6, 0x22

    .line 371
    :goto_4
    invoke-virtual {v1}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->isAttachment()Z

    move-result v7

    if-eqz v7, :cond_6

    .line 373
    new-instance v7, Lcom/facebook/react/views/text/internal/span/TextInlineViewPlaceholderSpan;

    .line 374
    invoke-virtual {v1}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getReactTag()I

    move-result v8

    .line 375
    invoke-virtual {v1}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getWidth()D

    move-result-wide v9

    invoke-static {v9, v10}, Lcom/facebook/react/uimanager/PixelUtil;->toPixelFromSP(D)F

    move-result v9

    float-to-int v9, v9

    .line 376
    invoke-virtual {v1}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getHeight()D

    move-result-wide v10

    invoke-static {v10, v11}, Lcom/facebook/react/uimanager/PixelUtil;->toPixelFromSP(D)F

    move-result v1

    float-to-int v1, v1

    .line 373
    invoke-direct {v7, v8, v9, v1}, Lcom/facebook/react/views/text/internal/span/TextInlineViewPlaceholderSpan;-><init>(III)V

    .line 372
    invoke-virtual {v2, v7, v3, v4, v6}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    goto/16 :goto_7

    .line 382
    :cond_6
    invoke-virtual {v1}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getProps()Lcom/facebook/react/views/text/TextAttributeProps;

    move-result-object v7

    invoke-virtual {v7}, Lcom/facebook/react/views/text/TextAttributeProps;->getRole()Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Role;

    move-result-object v7

    if-eqz v7, :cond_7

    .line 383
    invoke-virtual {v1}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getProps()Lcom/facebook/react/views/text/TextAttributeProps;

    move-result-object v7

    invoke-virtual {v7}, Lcom/facebook/react/views/text/TextAttributeProps;->getRole()Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Role;

    move-result-object v7

    sget-object v8, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Role;->LINK:Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Role;

    if-ne v7, v8, :cond_8

    goto :goto_5

    .line 385
    :cond_7
    invoke-virtual {v1}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getProps()Lcom/facebook/react/views/text/TextAttributeProps;

    move-result-object v7

    invoke-virtual {v7}, Lcom/facebook/react/views/text/TextAttributeProps;->getAccessibilityRole()Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityRole;

    move-result-object v7

    .line 386
    sget-object v8, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityRole;->LINK:Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityRole;

    if-ne v7, v8, :cond_8

    .line 389
    :goto_5
    new-instance v7, Lcom/facebook/react/views/text/internal/span/ReactClickableSpan;

    invoke-virtual {v1}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getReactTag()I

    move-result v8

    invoke-direct {v7, v8}, Lcom/facebook/react/views/text/internal/span/ReactClickableSpan;-><init>(I)V

    invoke-virtual {v2, v7, v3, v4, v6}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 392
    :cond_8
    invoke-virtual {v1}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getProps()Lcom/facebook/react/views/text/TextAttributeProps;

    move-result-object v7

    invoke-virtual {v7}, Lcom/facebook/react/views/text/TextAttributeProps;->isColorSet()Z

    move-result v7

    if-eqz v7, :cond_9

    .line 393
    new-instance v7, Lcom/facebook/react/views/text/internal/span/ReactForegroundColorSpan;

    invoke-virtual {v1}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getProps()Lcom/facebook/react/views/text/TextAttributeProps;

    move-result-object v8

    invoke-virtual {v8}, Lcom/facebook/react/views/text/TextAttributeProps;->getColor()I

    move-result v8

    invoke-direct {v7, v8}, Lcom/facebook/react/views/text/internal/span/ReactForegroundColorSpan;-><init>(I)V

    invoke-virtual {v2, v7, v3, v4, v6}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 396
    :cond_9
    invoke-virtual {v1}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getProps()Lcom/facebook/react/views/text/TextAttributeProps;

    move-result-object v7

    invoke-virtual {v7}, Lcom/facebook/react/views/text/TextAttributeProps;->isBackgroundColorSet()Z

    move-result v7

    if-eqz v7, :cond_a

    .line 398
    new-instance v7, Lcom/facebook/react/views/text/internal/span/ReactBackgroundColorSpan;

    invoke-virtual {v1}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getProps()Lcom/facebook/react/views/text/TextAttributeProps;

    move-result-object v8

    invoke-virtual {v8}, Lcom/facebook/react/views/text/TextAttributeProps;->getBackgroundColor()I

    move-result v8

    invoke-direct {v7, v8}, Lcom/facebook/react/views/text/internal/span/ReactBackgroundColorSpan;-><init>(I)V

    .line 397
    invoke-virtual {v2, v7, v3, v4, v6}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 401
    :cond_a
    invoke-virtual {v1}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getProps()Lcom/facebook/react/views/text/TextAttributeProps;

    move-result-object v7

    invoke-virtual {v7}, Lcom/facebook/react/views/text/TextAttributeProps;->getOpacity()F

    move-result v7

    invoke-static {v7}, Ljava/lang/Float;->isNaN(F)Z

    move-result v7

    if-nez v7, :cond_b

    .line 402
    new-instance v7, Lcom/facebook/react/views/text/internal/span/ReactOpacitySpan;

    invoke-virtual {v1}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getProps()Lcom/facebook/react/views/text/TextAttributeProps;

    move-result-object v8

    invoke-virtual {v8}, Lcom/facebook/react/views/text/TextAttributeProps;->getOpacity()F

    move-result v8

    invoke-direct {v7, v8}, Lcom/facebook/react/views/text/internal/span/ReactOpacitySpan;-><init>(F)V

    invoke-virtual {v2, v7, v3, v4, v6}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 405
    :cond_b
    invoke-virtual {v1}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getProps()Lcom/facebook/react/views/text/TextAttributeProps;

    move-result-object v7

    invoke-virtual {v7}, Lcom/facebook/react/views/text/TextAttributeProps;->getLetterSpacing()F

    move-result v7

    invoke-static {v7}, Ljava/lang/Float;->isNaN(F)Z

    move-result v7

    if-nez v7, :cond_c

    .line 407
    new-instance v7, Lcom/facebook/react/views/text/internal/span/CustomLetterSpacingSpan;

    invoke-virtual {v1}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getProps()Lcom/facebook/react/views/text/TextAttributeProps;

    move-result-object v8

    invoke-virtual {v8}, Lcom/facebook/react/views/text/TextAttributeProps;->getLetterSpacing()F

    move-result v8

    invoke-direct {v7, v8}, Lcom/facebook/react/views/text/internal/span/CustomLetterSpacingSpan;-><init>(F)V

    .line 406
    invoke-virtual {v2, v7, v3, v4, v6}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 411
    :cond_c
    new-instance v7, Lcom/facebook/react/views/text/internal/span/ReactAbsoluteSizeSpan;

    invoke-virtual {v1}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getProps()Lcom/facebook/react/views/text/TextAttributeProps;

    move-result-object v8

    iget v8, v8, Lcom/facebook/react/views/text/TextAttributeProps;->mFontSize:I

    invoke-direct {v7, v8}, Lcom/facebook/react/views/text/internal/span/ReactAbsoluteSizeSpan;-><init>(I)V

    invoke-virtual {v2, v7, v3, v4, v6}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 413
    invoke-virtual {v1}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getProps()Lcom/facebook/react/views/text/TextAttributeProps;

    move-result-object v7

    invoke-virtual {v7}, Lcom/facebook/react/views/text/TextAttributeProps;->getFontStyle()I

    move-result v7

    if-ne v7, v5, :cond_d

    .line 414
    invoke-virtual {v1}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getProps()Lcom/facebook/react/views/text/TextAttributeProps;

    move-result-object v7

    invoke-virtual {v7}, Lcom/facebook/react/views/text/TextAttributeProps;->getFontWeight()I

    move-result v7

    if-ne v7, v5, :cond_d

    .line 415
    invoke-virtual {v1}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getProps()Lcom/facebook/react/views/text/TextAttributeProps;

    move-result-object v7

    invoke-virtual {v7}, Lcom/facebook/react/views/text/TextAttributeProps;->getFontFamily()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_e

    .line 417
    :cond_d
    new-instance v8, Lcom/facebook/react/views/text/internal/span/CustomStyleSpan;

    .line 418
    invoke-virtual {v1}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getProps()Lcom/facebook/react/views/text/TextAttributeProps;

    move-result-object v7

    invoke-virtual {v7}, Lcom/facebook/react/views/text/TextAttributeProps;->getFontStyle()I

    move-result v9

    .line 419
    invoke-virtual {v1}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getProps()Lcom/facebook/react/views/text/TextAttributeProps;

    move-result-object v7

    invoke-virtual {v7}, Lcom/facebook/react/views/text/TextAttributeProps;->getFontWeight()I

    move-result v10

    .line 420
    invoke-virtual {v1}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getProps()Lcom/facebook/react/views/text/TextAttributeProps;

    move-result-object v7

    invoke-virtual {v7}, Lcom/facebook/react/views/text/TextAttributeProps;->getFontFeatureSettings()Ljava/lang/String;

    move-result-object v11

    .line 421
    invoke-virtual {v1}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getProps()Lcom/facebook/react/views/text/TextAttributeProps;

    move-result-object v7

    invoke-virtual {v7}, Lcom/facebook/react/views/text/TextAttributeProps;->getFontFamily()Ljava/lang/String;

    move-result-object v12

    .line 422
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v13

    const-string v7, "getAssets(...)"

    invoke-static {v13, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 417
    invoke-direct/range {v8 .. v13}, Lcom/facebook/react/views/text/internal/span/CustomStyleSpan;-><init>(IILjava/lang/String;Ljava/lang/String;Landroid/content/res/AssetManager;)V

    .line 416
    invoke-virtual {v2, v8, v3, v4, v6}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 428
    :cond_e
    invoke-virtual {v1}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getProps()Lcom/facebook/react/views/text/TextAttributeProps;

    move-result-object v7

    invoke-virtual {v7}, Lcom/facebook/react/views/text/TextAttributeProps;->isUnderlineTextDecorationSet()Z

    move-result v7

    if-eqz v7, :cond_f

    .line 429
    new-instance v7, Lcom/facebook/react/views/text/internal/span/ReactUnderlineSpan;

    invoke-direct {v7}, Lcom/facebook/react/views/text/internal/span/ReactUnderlineSpan;-><init>()V

    invoke-virtual {v2, v7, v3, v4, v6}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 432
    :cond_f
    invoke-virtual {v1}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getProps()Lcom/facebook/react/views/text/TextAttributeProps;

    move-result-object v7

    invoke-virtual {v7}, Lcom/facebook/react/views/text/TextAttributeProps;->isLineThroughTextDecorationSet()Z

    move-result v7

    if-eqz v7, :cond_10

    .line 433
    new-instance v7, Lcom/facebook/react/views/text/internal/span/ReactStrikethroughSpan;

    invoke-direct {v7}, Lcom/facebook/react/views/text/internal/span/ReactStrikethroughSpan;-><init>()V

    invoke-virtual {v2, v7, v3, v4, v6}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 436
    :cond_10
    invoke-virtual {v1}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getProps()Lcom/facebook/react/views/text/TextAttributeProps;

    move-result-object v7

    invoke-virtual {v7}, Lcom/facebook/react/views/text/TextAttributeProps;->getTextShadowOffsetDx()F

    move-result v7

    const/4 v8, 0x0

    cmpg-float v7, v7, v8

    if-nez v7, :cond_11

    .line 437
    invoke-virtual {v1}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getProps()Lcom/facebook/react/views/text/TextAttributeProps;

    move-result-object v7

    invoke-virtual {v7}, Lcom/facebook/react/views/text/TextAttributeProps;->getTextShadowOffsetDy()F

    move-result v7

    cmpg-float v7, v7, v8

    if-nez v7, :cond_11

    .line 438
    invoke-virtual {v1}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getProps()Lcom/facebook/react/views/text/TextAttributeProps;

    move-result-object v7

    invoke-virtual {v7}, Lcom/facebook/react/views/text/TextAttributeProps;->getTextShadowRadius()F

    move-result v7

    cmpg-float v7, v7, v8

    if-nez v7, :cond_11

    goto :goto_6

    .line 439
    :cond_11
    invoke-virtual {v1}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getProps()Lcom/facebook/react/views/text/TextAttributeProps;

    move-result-object v7

    invoke-virtual {v7}, Lcom/facebook/react/views/text/TextAttributeProps;->getTextShadowColor()I

    move-result v7

    invoke-static {v7}, Landroid/graphics/Color;->alpha(I)I

    move-result v7

    if-eqz v7, :cond_12

    .line 441
    new-instance v7, Lcom/facebook/react/views/text/internal/span/ShadowStyleSpan;

    .line 442
    invoke-virtual {v1}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getProps()Lcom/facebook/react/views/text/TextAttributeProps;

    move-result-object v8

    invoke-virtual {v8}, Lcom/facebook/react/views/text/TextAttributeProps;->getTextShadowOffsetDx()F

    move-result v8

    .line 443
    invoke-virtual {v1}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getProps()Lcom/facebook/react/views/text/TextAttributeProps;

    move-result-object v9

    invoke-virtual {v9}, Lcom/facebook/react/views/text/TextAttributeProps;->getTextShadowOffsetDy()F

    move-result v9

    .line 444
    invoke-virtual {v1}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getProps()Lcom/facebook/react/views/text/TextAttributeProps;

    move-result-object v10

    invoke-virtual {v10}, Lcom/facebook/react/views/text/TextAttributeProps;->getTextShadowRadius()F

    move-result v10

    .line 445
    invoke-virtual {v1}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getProps()Lcom/facebook/react/views/text/TextAttributeProps;

    move-result-object v11

    invoke-virtual {v11}, Lcom/facebook/react/views/text/TextAttributeProps;->getTextShadowColor()I

    move-result v11

    .line 441
    invoke-direct {v7, v8, v9, v10, v11}, Lcom/facebook/react/views/text/internal/span/ShadowStyleSpan;-><init>(FFFI)V

    .line 440
    invoke-virtual {v2, v7, v3, v4, v6}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 451
    :cond_12
    :goto_6
    invoke-virtual {v1}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getProps()Lcom/facebook/react/views/text/TextAttributeProps;

    move-result-object v7

    invoke-virtual {v7}, Lcom/facebook/react/views/text/TextAttributeProps;->getEffectiveLineHeight()F

    move-result v7

    invoke-static {v7}, Ljava/lang/Float;->isNaN(F)Z

    move-result v7

    if-nez v7, :cond_13

    .line 453
    new-instance v7, Lcom/facebook/react/views/text/internal/span/CustomLineHeightSpan;

    invoke-virtual {v1}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getProps()Lcom/facebook/react/views/text/TextAttributeProps;

    move-result-object v8

    invoke-virtual {v8}, Lcom/facebook/react/views/text/TextAttributeProps;->getEffectiveLineHeight()F

    move-result v8

    invoke-direct {v7, v8}, Lcom/facebook/react/views/text/internal/span/CustomLineHeightSpan;-><init>(F)V

    .line 452
    invoke-virtual {v2, v7, v3, v4, v6}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 456
    :cond_13
    new-instance v7, Lcom/facebook/react/views/text/internal/span/ReactTagSpan;

    invoke-virtual {v1}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getReactTag()I

    move-result v1

    invoke-direct {v7, v1}, Lcom/facebook/react/views/text/internal/span/ReactTagSpan;-><init>(I)V

    invoke-virtual {v2, v7, v3, v4, v6}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    :goto_7
    move v3, v4

    goto/16 :goto_3

    .line 462
    :cond_14
    check-cast v2, Landroid/text/Spannable;

    return-object v2
.end method

.method private final calculateHeight(Landroid/text/Layout;FLcom/facebook/yoga/YogaMeasureMode;I)F
    .locals 1

    .line 1050
    sget-object v0, Lcom/facebook/yoga/YogaMeasureMode;->EXACTLY:Lcom/facebook/yoga/YogaMeasureMode;

    if-eq p3, v0, :cond_1

    add-int/lit8 p4, p4, -0x1

    .line 1053
    invoke-virtual {p1, p4}, Landroid/text/Layout;->getLineBottom(I)I

    move-result p1

    int-to-float p1, p1

    .line 1054
    sget-object p4, Lcom/facebook/yoga/YogaMeasureMode;->AT_MOST:Lcom/facebook/yoga/YogaMeasureMode;

    if-ne p3, p4, :cond_0

    cmpl-float p3, p1, p2

    if-lez p3, :cond_0

    goto :goto_0

    :cond_0
    return p1

    :cond_1
    :goto_0
    return p2
.end method

.method private final calculateLineCount(Landroid/text/Layout;I)I
    .locals 1

    const/4 v0, -0x1

    if-eq p2, v0, :cond_0

    if-eqz p2, :cond_0

    .line 1025
    invoke-virtual {p1}, Landroid/text/Layout;->getLineCount()I

    move-result p1

    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    return p1

    .line 1024
    :cond_0
    invoke-virtual {p1}, Landroid/text/Layout;->getLineCount()I

    move-result p1

    return p1
.end method

.method private final calculateWidth(Landroid/text/Layout;Landroid/text/Spanned;FLcom/facebook/yoga/YogaMeasureMode;I)F
    .locals 0

    .line 1036
    sget-object p2, Lcom/facebook/yoga/YogaMeasureMode;->EXACTLY:Lcom/facebook/yoga/YogaMeasureMode;

    if-ne p4, p2, :cond_0

    return p3

    .line 1040
    :cond_0
    invoke-virtual {p1}, Landroid/text/Layout;->getWidth()I

    move-result p1

    int-to-float p1, p1

    return p1
.end method

.method private final createLayout(Landroid/text/Spannable;Landroid/text/BoringLayout$Metrics;FLcom/facebook/yoga/YogaMeasureMode;ZIILandroid/text/Layout$Alignment;ILandroid/text/TextUtils$TruncateAt;ILandroid/text/TextPaint;)Landroid/text/Layout;
    .locals 3

    if-eqz p2, :cond_2

    .line 537
    sget-object v0, Lcom/facebook/yoga/YogaMeasureMode;->UNDEFINED:Lcom/facebook/yoga/YogaMeasureMode;

    if-eq p4, v0, :cond_0

    iget v0, p2, Landroid/text/BoringLayout$Metrics;->width:I

    int-to-float v0, v0

    float-to-double v1, p3

    invoke-static {v1, v2}, Ljava/lang/Math;->floor(D)D

    move-result-wide v1

    double-to-float v1, v1

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_2

    .line 539
    :cond_0
    sget-object p6, Lcom/facebook/yoga/YogaMeasureMode;->EXACTLY:Lcom/facebook/yoga/YogaMeasureMode;

    if-ne p4, p6, :cond_1

    float-to-double p3, p3

    invoke-static {p3, p4}, Ljava/lang/Math;->floor(D)D

    move-result-wide p3

    double-to-float p3, p3

    float-to-int p3, p3

    goto :goto_0

    .line 540
    :cond_1
    iget p3, p2, Landroid/text/BoringLayout$Metrics;->width:I

    :goto_0
    move p6, p3

    .line 542
    move-object p4, p1

    check-cast p4, Ljava/lang/CharSequence;

    move-object p7, p8

    const/high16 p8, 0x3f800000    # 1.0f

    const/4 p9, 0x0

    move-object p10, p2

    move p11, p5

    move-object p5, p12

    .line 541
    invoke-static/range {p4 .. p11}, Landroid/text/BoringLayout;->make(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFLandroid/text/BoringLayout$Metrics;Z)Landroid/text/BoringLayout;

    move-result-object p1

    const-string p2, "make(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/text/Layout;

    return-object p1

    :cond_2
    move p2, p5

    move-object p5, p8

    move-object p8, p12

    .line 545
    move-object p12, p1

    check-cast p12, Ljava/lang/CharSequence;

    invoke-static {p12, p8}, Landroid/text/Layout;->getDesiredWidth(Ljava/lang/CharSequence;Landroid/text/TextPaint;)F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-float v0, v0

    float-to-int v0, v0

    .line 548
    sget-object v1, Lcom/facebook/react/views/text/TextLayoutManager$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-virtual {p4}, Lcom/facebook/yoga/YogaMeasureMode;->ordinal()I

    move-result p4

    aget p4, v1, p4

    const/4 v1, 0x1

    if-eq p4, v1, :cond_4

    const/4 v2, 0x2

    if-eq p4, v2, :cond_3

    goto :goto_1

    :cond_3
    float-to-double p3, p3

    .line 550
    invoke-static {p3, p4}, Ljava/lang/Math;->floor(D)D

    move-result-wide p3

    double-to-float p3, p3

    float-to-int p3, p3

    invoke-static {v0, p3}, Ljava/lang/Math;->min(II)I

    move-result v0

    goto :goto_1

    :cond_4
    float-to-double p3, p3

    .line 549
    invoke-static {p3, p4}, Ljava/lang/Math;->floor(D)D

    move-result-wide p3

    double-to-float p3, p3

    float-to-int v0, p3

    :goto_1
    const/4 p3, 0x0

    .line 555
    invoke-interface {p1}, Landroid/text/Spannable;->length()I

    move-result p1

    invoke-static {p12, p3, p1, p8, v0}, Landroid/text/StaticLayout$Builder;->obtain(Ljava/lang/CharSequence;IILandroid/text/TextPaint;I)Landroid/text/StaticLayout$Builder;

    move-result-object p1

    .line 556
    invoke-virtual {p1, p5}, Landroid/text/StaticLayout$Builder;->setAlignment(Landroid/text/Layout$Alignment;)Landroid/text/StaticLayout$Builder;

    move-result-object p1

    const/4 p3, 0x0

    const/high16 p4, 0x3f800000    # 1.0f

    .line 557
    invoke-virtual {p1, p3, p4}, Landroid/text/StaticLayout$Builder;->setLineSpacing(FF)Landroid/text/StaticLayout$Builder;

    move-result-object p1

    .line 558
    invoke-virtual {p1, p2}, Landroid/text/StaticLayout$Builder;->setIncludePad(Z)Landroid/text/StaticLayout$Builder;

    move-result-object p1

    .line 559
    invoke-virtual {p1, p6}, Landroid/text/StaticLayout$Builder;->setBreakStrategy(I)Landroid/text/StaticLayout$Builder;

    move-result-object p1

    .line 560
    invoke-virtual {p1, p7}, Landroid/text/StaticLayout$Builder;->setHyphenationFrequency(I)Landroid/text/StaticLayout$Builder;

    move-result-object p1

    const-string p2, "setHyphenationFrequency(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, -0x1

    if-eq p11, p2, :cond_5

    if-eqz p11, :cond_5

    .line 563
    invoke-virtual {p1, p10}, Landroid/text/StaticLayout$Builder;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)Landroid/text/StaticLayout$Builder;

    move-result-object p2

    invoke-virtual {p2, p11}, Landroid/text/StaticLayout$Builder;->setMaxLines(I)Landroid/text/StaticLayout$Builder;

    .line 566
    :cond_5
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p3, 0x1a

    if-lt p2, p3, :cond_6

    .line 567
    invoke-virtual {p1, p9}, Landroid/text/StaticLayout$Builder;->setJustificationMode(I)Landroid/text/StaticLayout$Builder;

    .line 570
    :cond_6
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p3, 0x1c

    if-lt p2, p3, :cond_7

    .line 571
    invoke-virtual {p1, v1}, Landroid/text/StaticLayout$Builder;->setUseLineSpacingFromFallbacks(Z)Landroid/text/StaticLayout$Builder;

    .line 574
    :cond_7
    invoke-virtual {p1}, Landroid/text/StaticLayout$Builder;->build()Landroid/text/StaticLayout;

    move-result-object p1

    const-string p2, "build(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/text/Layout;

    return-object p1
.end method

.method private final createLayout(Landroid/text/Spannable;Landroid/text/TextPaint;Lcom/facebook/react/common/mapbuffer/MapBuffer;Lcom/facebook/react/common/mapbuffer/MapBuffer;FLcom/facebook/yoga/YogaMeasureMode;FLcom/facebook/yoga/YogaMeasureMode;)Landroid/text/Layout;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    .line 680
    invoke-direct/range {p0 .. p2}, Lcom/facebook/react/views/text/TextLayoutManager;->isBoring(Landroid/text/Spannable;Landroid/text/TextPaint;)Landroid/text/BoringLayout$Metrics;

    move-result-object v3

    const/4 v4, 0x2

    .line 684
    invoke-interface {v2, v4}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 683
    invoke-static {v4}, Lcom/facebook/react/views/text/TextAttributeProps;->getTextBreakStrategy(Ljava/lang/String;)I

    move-result v13

    const/4 v4, 0x4

    .line 686
    invoke-interface {v2, v4}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->contains(I)Z

    move-result v5

    const/4 v6, 0x1

    if-eqz v5, :cond_0

    .line 687
    invoke-interface {v2, v4}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getBoolean(I)Z

    move-result v4

    move v12, v4

    goto :goto_0

    :cond_0
    move v12, v6

    :goto_0
    const/4 v4, 0x5

    .line 691
    invoke-interface {v2, v4}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 690
    invoke-static {v4}, Lcom/facebook/react/views/text/TextAttributeProps;->getHyphenationFrequency(Ljava/lang/String;)I

    move-result v7

    const/4 v4, 0x3

    .line 693
    invoke-interface {v2, v4}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->contains(I)Z

    move-result v5

    const/4 v8, 0x0

    if-eqz v5, :cond_1

    .line 694
    invoke-interface {v2, v4}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getBoolean(I)Z

    move-result v4

    goto :goto_1

    :cond_1
    move v4, v8

    .line 697
    :goto_1
    invoke-interface {v2, v8}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->contains(I)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 698
    invoke-interface {v2, v8}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getInt(I)I

    move-result v5

    goto :goto_2

    :cond_2
    const/4 v5, -0x1

    :goto_2
    move v11, v5

    .line 701
    invoke-interface {v2, v6}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->contains(I)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 703
    invoke-interface {v2, v6}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 702
    invoke-static {v5}, Lcom/facebook/react/views/text/TextAttributeProps;->getEllipsizeMode(Ljava/lang/String;)Landroid/text/TextUtils$TruncateAt;

    move-result-object v5

    goto :goto_3

    :cond_3
    const/4 v5, 0x0

    :goto_3
    move-object/from16 v18, v5

    .line 707
    invoke-direct {v0, v1}, Lcom/facebook/react/views/text/TextLayoutManager;->getTextAlignmentAttr(Lcom/facebook/react/common/mapbuffer/MapBuffer;)Ljava/lang/String;

    move-result-object v5

    move-object/from16 v6, p1

    .line 708
    invoke-direct {v0, v1, v6, v5}, Lcom/facebook/react/views/text/TextLayoutManager;->getTextAlignment(Lcom/facebook/react/common/mapbuffer/MapBuffer;Landroid/text/Spannable;Ljava/lang/String;)Landroid/text/Layout$Alignment;

    move-result-object v8

    .line 709
    invoke-direct {v0, v5}, Lcom/facebook/react/views/text/TextLayoutManager;->getTextJustificationMode(Ljava/lang/String;)I

    move-result v9

    if-eqz v4, :cond_5

    const/4 v1, 0x6

    .line 713
    invoke-interface {v2, v1}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->contains(I)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 714
    invoke-interface {v2, v1}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getDouble(I)D

    move-result-wide v1

    double-to-float v1, v1

    goto :goto_4

    :cond_4
    const/high16 v1, 0x7fc00000    # Float.NaN

    :goto_4
    move v10, v1

    move v14, v7

    .line 720
    sget-object v7, Lcom/facebook/yoga/YogaMeasureMode;->EXACTLY:Lcom/facebook/yoga/YogaMeasureMode;

    move-object/from16 v17, p2

    move-object v5, v6

    move-object v15, v8

    move/from16 v16, v9

    move/from16 v6, p5

    move/from16 v8, p7

    move-object/from16 v9, p8

    .line 717
    invoke-static/range {v5 .. v17}, Lcom/facebook/react/views/text/TextLayoutManager;->adjustSpannableFontToFit(Landroid/text/Spannable;FLcom/facebook/yoga/YogaMeasureMode;FLcom/facebook/yoga/YogaMeasureMode;FIZIILandroid/text/Layout$Alignment;ILandroid/text/TextPaint;)V

    move v7, v14

    move-object v8, v15

    move/from16 v9, v16

    :cond_5
    move-object/from16 v1, p1

    move-object/from16 v4, p6

    move-object v2, v3

    move v5, v12

    move v6, v13

    move-object/from16 v10, v18

    move-object/from16 v12, p2

    move/from16 v3, p5

    .line 733
    invoke-direct/range {v0 .. v12}, Lcom/facebook/react/views/text/TextLayoutManager;->createLayout(Landroid/text/Spannable;Landroid/text/BoringLayout$Metrics;FLcom/facebook/yoga/YogaMeasureMode;ZIILandroid/text/Layout$Alignment;ILandroid/text/TextUtils$TruncateAt;ILandroid/text/TextPaint;)Landroid/text/Layout;

    move-result-object v1

    return-object v1
.end method

.method private final createLayoutForMeasurement(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/MapBuffer;Lcom/facebook/react/common/mapbuffer/MapBuffer;FLcom/facebook/yoga/YogaMeasureMode;FLcom/facebook/yoga/YogaMeasureMode;Lcom/facebook/react/views/text/ReactTextViewManagerCallback;)Landroid/text/Layout;
    .locals 9

    move-object/from16 v0, p8

    .line 648
    invoke-virtual {p0, p1, p2, v0}, Lcom/facebook/react/views/text/TextLayoutManager;->getOrCreateSpannableForText(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/MapBuffer;Lcom/facebook/react/views/text/ReactTextViewManagerCallback;)Landroid/text/Spannable;

    move-result-object v1

    const/4 v0, 0x3

    .line 651
    invoke-interface {p2, v0}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->contains(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 652
    const-class p1, Lcom/facebook/react/views/text/internal/span/ReactTextPaintHolderSpan;

    const/4 v0, 0x0

    invoke-interface {v1, v0, v0, p1}, Landroid/text/Spannable;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lcom/facebook/react/views/text/internal/span/ReactTextPaintHolderSpan;

    aget-object p1, p1, v0

    invoke-virtual {p1}, Lcom/facebook/react/views/text/internal/span/ReactTextPaintHolderSpan;->getTextPaint()Landroid/text/TextPaint;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 v0, 0x4

    .line 655
    invoke-interface {p2, v0}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getMapBuffer(I)Lcom/facebook/react/common/mapbuffer/MapBuffer;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/react/views/text/TextAttributeProps;->fromMapBuffer(Lcom/facebook/react/common/mapbuffer/MapBuffer;)Lcom/facebook/react/views/text/TextAttributeProps;

    move-result-object v0

    const-string v2, "fromMapBuffer(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 656
    invoke-direct {p0, v0, p1}, Lcom/facebook/react/views/text/TextLayoutManager;->scratchPaintWithAttributes(Lcom/facebook/react/views/text/TextAttributeProps;Landroid/content/Context;)Landroid/text/TextPaint;

    move-result-object p1

    :goto_0
    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move-object v6, p5

    move v7, p6

    move-object/from16 v8, p7

    .line 659
    invoke-direct/range {v0 .. v8}, Lcom/facebook/react/views/text/TextLayoutManager;->createLayout(Landroid/text/Spannable;Landroid/text/TextPaint;Lcom/facebook/react/common/mapbuffer/MapBuffer;Lcom/facebook/react/common/mapbuffer/MapBuffer;FLcom/facebook/yoga/YogaMeasureMode;FLcom/facebook/yoga/YogaMeasureMode;)Landroid/text/Layout;

    move-result-object p1

    return-object p1
.end method

.method public static final createPreparedLayout(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;FLcom/facebook/yoga/YogaMeasureMode;FLcom/facebook/yoga/YogaMeasureMode;Lcom/facebook/react/views/text/ReactTextViewManagerCallback;)Lcom/facebook/react/views/text/PreparedLayout;
    .locals 10
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attributedString"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paragraphAttributes"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "widthYogaMeasureMode"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "heightYogaMeasureMode"

    move-object/from16 v9, p6

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 759
    sget-object v1, Lcom/facebook/react/views/text/TextLayoutManager;->INSTANCE:Lcom/facebook/react/views/text/TextLayoutManager;

    move-object v4, p1

    check-cast v4, Lcom/facebook/react/common/mapbuffer/MapBuffer;

    move-object/from16 v0, p7

    invoke-virtual {v1, p0, v4, v0}, Lcom/facebook/react/views/text/TextLayoutManager;->getOrCreateSpannableForText(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/MapBuffer;Lcom/facebook/react/views/text/ReactTextViewManagerCallback;)Landroid/text/Spannable;

    move-result-object v2

    const/4 v0, 0x4

    .line 761
    invoke-virtual {p1, v0}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->getMapBuffer(I)Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;

    move-result-object p1

    check-cast p1, Lcom/facebook/react/common/mapbuffer/MapBuffer;

    invoke-static {p1}, Lcom/facebook/react/views/text/TextAttributeProps;->fromMapBuffer(Lcom/facebook/react/common/mapbuffer/MapBuffer;)Lcom/facebook/react/views/text/TextAttributeProps;

    move-result-object p1

    const-string v0, "fromMapBuffer(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 765
    invoke-direct {v1, p1, p0}, Lcom/facebook/react/views/text/TextLayoutManager;->newPaintWithAttributes(Lcom/facebook/react/views/text/TextAttributeProps;Landroid/content/Context;)Landroid/text/TextPaint;

    move-result-object v3

    .line 767
    move-object v5, p2

    check-cast v5, Lcom/facebook/react/common/mapbuffer/MapBuffer;

    move v6, p3

    move-object v7, p4

    move v8, p5

    .line 763
    invoke-direct/range {v1 .. v9}, Lcom/facebook/react/views/text/TextLayoutManager;->createLayout(Landroid/text/Spannable;Landroid/text/TextPaint;Lcom/facebook/react/common/mapbuffer/MapBuffer;Lcom/facebook/react/common/mapbuffer/MapBuffer;FLcom/facebook/yoga/YogaMeasureMode;FLcom/facebook/yoga/YogaMeasureMode;)Landroid/text/Layout;

    move-result-object v2

    const/4 p0, 0x0

    .line 774
    invoke-virtual {p2, p0}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->contains(I)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 775
    invoke-virtual {p2, p0}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->getInt(I)I

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, -0x1

    :goto_0
    move v6, p0

    move-object v3, p2

    move v4, p5

    move-object/from16 v5, p6

    .line 779
    invoke-direct/range {v1 .. v6}, Lcom/facebook/react/views/text/TextLayoutManager;->getVerticalOffset(Landroid/text/Layout;Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;FLcom/facebook/yoga/YogaMeasureMode;I)F

    move-result p0

    move p1, v6

    .line 782
    new-instance p2, Lcom/facebook/react/views/text/PreparedLayout;

    invoke-direct {p2, v2, p1, p0}, Lcom/facebook/react/views/text/PreparedLayout;-><init>(Landroid/text/Layout;IF)V

    return-object p2
.end method

.method private final createSpannableFromAttributedString(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/MapBuffer;Lcom/facebook/react/views/text/ReactTextViewManagerCallback;)Landroid/text/Spannable;
    .locals 3

    .line 488
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->enableAndroidTextMeasurementOptimizations()Z

    move-result v0

    const/4 v1, 0x2

    if-eqz v0, :cond_1

    .line 491
    invoke-interface {p2, v1}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getMapBuffer(I)Lcom/facebook/react/common/mapbuffer/MapBuffer;

    move-result-object p2

    .line 490
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/views/text/TextLayoutManager;->buildSpannableFromFragmentsOptimized(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/MapBuffer;)Landroid/text/Spannable;

    move-result-object p1

    if-eqz p3, :cond_0

    .line 493
    invoke-interface {p3, p1}, Lcom/facebook/react/views/text/ReactTextViewManagerCallback;->onPostProcessSpannable(Landroid/text/Spannable;)V

    :cond_0
    return-object p1

    .line 496
    :cond_1
    new-instance v0, Landroid/text/SpannableStringBuilder;

    invoke-direct {v0}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 501
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/List;

    .line 503
    invoke-interface {p2, v1}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getMapBuffer(I)Lcom/facebook/react/common/mapbuffer/MapBuffer;

    move-result-object p2

    invoke-direct {p0, p1, p2, v0, v2}, Lcom/facebook/react/views/text/TextLayoutManager;->buildSpannableFromFragments(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/MapBuffer;Landroid/text/SpannableStringBuilder;Ljava/util/List;)V

    .line 507
    move-object p1, v2

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result p1

    const/4 p2, 0x0

    :goto_0
    if-ge p2, p1, :cond_2

    .line 508
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v1

    sub-int/2addr v1, p2

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/react/views/text/internal/span/SetSpanOperation;

    .line 512
    invoke-virtual {v1, v0, p2}, Lcom/facebook/react/views/text/internal/span/SetSpanOperation;->execute(Landroid/text/SpannableStringBuilder;I)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_2
    if-eqz p3, :cond_3

    .line 515
    move-object p1, v0

    check-cast p1, Landroid/text/Spannable;

    invoke-interface {p3, p1}, Lcom/facebook/react/views/text/ReactTextViewManagerCallback;->onPostProcessSpannable(Landroid/text/Spannable;)V

    .line 516
    :cond_3
    check-cast v0, Landroid/text/Spannable;

    return-object v0
.end method

.method private final getTextAlignment(Lcom/facebook/react/common/mapbuffer/MapBuffer;Landroid/text/Spannable;Ljava/lang/String;)Landroid/text/Layout$Alignment;
    .locals 3

    .line 178
    invoke-virtual {p0, p1}, Lcom/facebook/react/views/text/TextLayoutManager;->isRTL(Lcom/facebook/react/common/mapbuffer/MapBuffer;)Z

    move-result p1

    .line 179
    sget-object v0, Landroid/text/TextDirectionHeuristics;->FIRSTSTRONG_LTR:Landroid/text/TextDirectionHeuristic;

    move-object v1, p2

    check-cast v1, Ljava/lang/CharSequence;

    invoke-interface {p2}, Landroid/text/Spannable;->length()I

    move-result p2

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2, p2}, Landroid/text/TextDirectionHeuristic;->isRtl(Ljava/lang/CharSequence;II)Z

    move-result p2

    if-eq p1, p2, :cond_0

    const/4 v2, 0x1

    :cond_0
    if-eqz v2, :cond_1

    .line 183
    sget-object p1, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    goto :goto_0

    .line 184
    :cond_1
    sget-object p1, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    :goto_0
    if-nez p3, :cond_2

    goto :goto_1

    .line 190
    :cond_2
    const-string p2, "center"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    .line 191
    sget-object p1, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    return-object p1

    .line 192
    :cond_3
    const-string p2, "right"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_5

    if-eqz v2, :cond_4

    .line 194
    sget-object p1, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    return-object p1

    .line 195
    :cond_4
    sget-object p1, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    :cond_5
    :goto_1
    return-object p1
.end method

.method private final getTextAlignmentAttr(Lcom/facebook/react/common/mapbuffer/MapBuffer;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x2

    .line 140
    invoke-interface {p1, v0}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->contains(I)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return-object v2

    .line 144
    :cond_0
    invoke-interface {p1, v0}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getMapBuffer(I)Lcom/facebook/react/common/mapbuffer/MapBuffer;

    move-result-object p1

    .line 145
    invoke-interface {p1}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getCount()I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 146
    invoke-interface {p1, v0}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getMapBuffer(I)Lcom/facebook/react/common/mapbuffer/MapBuffer;

    move-result-object p1

    const/4 v0, 0x5

    .line 147
    invoke-interface {p1, v0}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getMapBuffer(I)Lcom/facebook/react/common/mapbuffer/MapBuffer;

    move-result-object p1

    const/16 v0, 0xc

    .line 149
    invoke-interface {p1, v0}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->contains(I)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 150
    invoke-interface {p1, v0}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    return-object v2
.end method

.method public static final getTextGravity(Lcom/facebook/react/common/mapbuffer/MapBuffer;Landroid/text/Spannable;)I
    .locals 4
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "attributedString"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "spanned"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 203
    sget-object v0, Lcom/facebook/react/views/text/TextLayoutManager;->INSTANCE:Lcom/facebook/react/views/text/TextLayoutManager;

    invoke-direct {v0, p0}, Lcom/facebook/react/views/text/TextLayoutManager;->getTextAlignmentAttr(Lcom/facebook/react/common/mapbuffer/MapBuffer;)Ljava/lang/String;

    move-result-object v1

    .line 204
    invoke-direct {v0, p0, p1, v1}, Lcom/facebook/react/views/text/TextLayoutManager;->getTextAlignment(Lcom/facebook/react/common/mapbuffer/MapBuffer;Landroid/text/Spannable;Ljava/lang/String;)Landroid/text/Layout$Alignment;

    move-result-object p0

    .line 208
    sget-object v0, Landroid/text/TextDirectionHeuristics;->FIRSTSTRONG_LTR:Landroid/text/TextDirectionHeuristic;

    move-object v1, p1

    check-cast v1, Ljava/lang/CharSequence;

    const/4 v2, 0x0

    invoke-interface {p1}, Landroid/text/Spannable;->length()I

    move-result p1

    invoke-interface {v0, v1, v2, p1}, Landroid/text/TextDirectionHeuristic;->isRtl(Ljava/lang/CharSequence;II)Z

    move-result p1

    .line 210
    sget-object v0, Lcom/facebook/react/views/text/TextLayoutManager$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Landroid/text/Layout$Alignment;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x5

    const/4 v1, 0x3

    const/4 v2, 0x1

    if-eq p0, v2, :cond_3

    const/4 v3, 0x2

    if-eq p0, v3, :cond_1

    if-ne p0, v1, :cond_0

    return v2

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    if-eqz p1, :cond_2

    return v1

    :cond_2
    return v0

    :cond_3
    if-eqz p1, :cond_4

    return v0

    :cond_4
    return v1
.end method

.method private final getTextJustificationMode(Ljava/lang/String;)I
    .locals 2

    .line 158
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-ge v0, v1, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    if-eqz p1, :cond_1

    .line 162
    const-string v0, "justified"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private final getVerticalOffset(Landroid/text/Layout;Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;FLcom/facebook/yoga/YogaMeasureMode;I)F
    .locals 2

    const/16 v0, 0x8

    .line 994
    invoke-virtual {p2, v0}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->contains(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 995
    invoke-virtual {p2, v0}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->getString(I)Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    const/4 v0, 0x0

    if-nez p2, :cond_1

    return v0

    .line 1002
    :cond_1
    invoke-virtual {p1}, Landroid/text/Layout;->getHeight()I

    move-result v1

    .line 1003
    invoke-direct {p0, p1, p5}, Lcom/facebook/react/views/text/TextLayoutManager;->calculateLineCount(Landroid/text/Layout;I)I

    move-result p5

    .line 1004
    invoke-direct {p0, p1, p3, p4, p5}, Lcom/facebook/react/views/text/TextLayoutManager;->calculateHeight(Landroid/text/Layout;FLcom/facebook/yoga/YogaMeasureMode;I)F

    move-result p1

    int-to-float p3, v1

    cmpl-float p4, p3, p1

    if-lez p4, :cond_2

    return v0

    .line 1010
    :cond_2
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result p4

    sparse-switch p4, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string p1, "auto"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_1

    :sswitch_1
    const-string/jumbo p1, "top"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_1

    :cond_3
    return v0

    :sswitch_2
    const-string p4, "center"

    invoke-virtual {p2, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-nez p4, :cond_4

    goto :goto_1

    :cond_4
    sub-float/2addr p1, p3

    const/high16 p2, 0x40000000    # 2.0f

    div-float/2addr p1, p2

    return p1

    :sswitch_3
    const-string p4, "bottom"

    invoke-virtual {p2, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-nez p4, :cond_5

    goto :goto_1

    :cond_5
    sub-float/2addr p1, p3

    return p1

    .line 1016
    :goto_1
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p3, "Invalid textAlignVertical: "

    invoke-direct {p1, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "ReactNative"

    invoke-static {p2, p1}, Lcom/facebook/common/logging/FLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return v0

    :sswitch_data_0
    .sparse-switch
        -0x527265d5 -> :sswitch_3
        -0x514d33ab -> :sswitch_2
        0x1c155 -> :sswitch_1
        0x2dddaf -> :sswitch_0
    .end sparse-switch
.end method

.method private final isBoring(Landroid/text/Spannable;Landroid/text/TextPaint;)Landroid/text/BoringLayout$Metrics;
    .locals 3

    .line 1188
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-ge v0, v1, :cond_0

    .line 1189
    check-cast p1, Ljava/lang/CharSequence;

    invoke-static {p1, p2}, Landroid/text/BoringLayout;->isBoring(Ljava/lang/CharSequence;Landroid/text/TextPaint;)Landroid/text/BoringLayout$Metrics;

    move-result-object p1

    return-object p1

    .line 1193
    :cond_0
    check-cast p1, Ljava/lang/CharSequence;

    sget-object v0, Landroid/text/TextDirectionHeuristics;->FIRSTSTRONG_LTR:Landroid/text/TextDirectionHeuristic;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, p2, v0, v1, v2}, Landroid/text/BoringLayout;->isBoring(Ljava/lang/CharSequence;Landroid/text/TextPaint;Landroid/text/TextDirectionHeuristic;ZLandroid/text/BoringLayout$Metrics;)Landroid/text/BoringLayout$Metrics;

    move-result-object p1

    return-object p1
.end method

.method public static final measureLines(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/MapBuffer;Lcom/facebook/react/common/mapbuffer/MapBuffer;FFLcom/facebook/react/views/text/ReactTextViewManagerCallback;)Lcom/facebook/react/bridge/WritableArray;
    .locals 10
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attributedString"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paragraphAttributes"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1175
    sget-object v1, Lcom/facebook/react/views/text/TextLayoutManager;->INSTANCE:Lcom/facebook/react/views/text/TextLayoutManager;

    .line 1180
    sget-object v6, Lcom/facebook/yoga/YogaMeasureMode;->EXACTLY:Lcom/facebook/yoga/YogaMeasureMode;

    .line 1182
    sget-object v8, Lcom/facebook/yoga/YogaMeasureMode;->EXACTLY:Lcom/facebook/yoga/YogaMeasureMode;

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    move v7, p4

    move-object v9, p5

    .line 1175
    invoke-direct/range {v1 .. v9}, Lcom/facebook/react/views/text/TextLayoutManager;->createLayoutForMeasurement(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/MapBuffer;Lcom/facebook/react/common/mapbuffer/MapBuffer;FLcom/facebook/yoga/YogaMeasureMode;FLcom/facebook/yoga/YogaMeasureMode;Lcom/facebook/react/views/text/ReactTextViewManagerCallback;)Landroid/text/Layout;

    move-result-object p0

    .line 1184
    invoke-virtual {p0}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    const-string p2, "getText(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p0, v2}, Lcom/facebook/react/views/text/FontMetricsUtil;->getFontMetrics(Ljava/lang/CharSequence;Landroid/text/Layout;Landroid/content/Context;)Lcom/facebook/react/bridge/WritableArray;

    move-result-object p0

    return-object p0
.end method

.method public static final measurePreparedLayout(Lcom/facebook/react/views/text/PreparedLayout;FLcom/facebook/yoga/YogaMeasureMode;FLcom/facebook/yoga/YogaMeasureMode;)[F
    .locals 9
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "preparedLayout"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "widthYogaMeasureMode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "heightYogaMeasureMode"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 941
    invoke-virtual {p0}, Lcom/facebook/react/views/text/PreparedLayout;->getLayout()Landroid/text/Layout;

    move-result-object v2

    .line 942
    invoke-virtual {v2}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.text.Spanned"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, v0

    check-cast v3, Landroid/text/Spanned;

    .line 943
    invoke-virtual {p0}, Lcom/facebook/react/views/text/PreparedLayout;->getMaximumNumberOfLines()I

    move-result v0

    .line 945
    sget-object v1, Lcom/facebook/react/views/text/TextLayoutManager;->INSTANCE:Lcom/facebook/react/views/text/TextLayoutManager;

    invoke-direct {v1, v2, v0}, Lcom/facebook/react/views/text/TextLayoutManager;->calculateLineCount(Landroid/text/Layout;I)I

    move-result v5

    move v4, p1

    move v6, v5

    move-object v5, p2

    .line 947
    invoke-direct/range {v1 .. v6}, Lcom/facebook/react/views/text/TextLayoutManager;->calculateWidth(Landroid/text/Layout;Landroid/text/Spanned;FLcom/facebook/yoga/YogaMeasureMode;I)F

    move-result v4

    move v5, v6

    .line 949
    invoke-direct {v1, v2, p3, p4, v5}, Lcom/facebook/react/views/text/TextLayoutManager;->calculateHeight(Landroid/text/Layout;FLcom/facebook/yoga/YogaMeasureMode;I)F

    move-result p1

    .line 951
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 952
    sget-object p3, Lcom/facebook/react/uimanager/PixelUtil;->INSTANCE:Lcom/facebook/react/uimanager/PixelUtil;

    invoke-virtual {p3, v4}, Lcom/facebook/react/uimanager/PixelUtil;->pxToDp(F)F

    move-result p3

    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 953
    sget-object p3, Lcom/facebook/react/uimanager/PixelUtil;->INSTANCE:Lcom/facebook/react/uimanager/PixelUtil;

    invoke-virtual {p3, p1}, Lcom/facebook/react/uimanager/PixelUtil;->pxToDp(F)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 955
    new-instance v8, Lcom/facebook/react/views/text/TextLayoutManager$AttachmentMetrics;

    invoke-direct {v8}, Lcom/facebook/react/views/text/TextLayoutManager$AttachmentMetrics;-><init>()V

    const/4 p1, 0x0

    move v6, p1

    .line 959
    :cond_0
    :goto_0
    invoke-interface {v3}, Landroid/text/Spanned;->length()I

    move-result p3

    if-ge v6, p3, :cond_1

    .line 967
    invoke-virtual {p0}, Lcom/facebook/react/views/text/PreparedLayout;->getVerticalOffset()F

    move-result v7

    .line 961
    invoke-direct/range {v1 .. v8}, Lcom/facebook/react/views/text/TextLayoutManager;->nextAttachmentMetrics(Landroid/text/Layout;Landroid/text/Spanned;FIIFLcom/facebook/react/views/text/TextLayoutManager$AttachmentMetrics;)I

    move-result v6

    .line 969
    invoke-virtual {v8}, Lcom/facebook/react/views/text/TextLayoutManager$AttachmentMetrics;->getWasFound()Z

    move-result p3

    if-eqz p3, :cond_0

    .line 970
    sget-object p3, Lcom/facebook/react/uimanager/PixelUtil;->INSTANCE:Lcom/facebook/react/uimanager/PixelUtil;

    invoke-virtual {v8}, Lcom/facebook/react/views/text/TextLayoutManager$AttachmentMetrics;->getTop()F

    move-result p4

    invoke-virtual {p3, p4}, Lcom/facebook/react/uimanager/PixelUtil;->pxToDp(F)F

    move-result p3

    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 971
    sget-object p3, Lcom/facebook/react/uimanager/PixelUtil;->INSTANCE:Lcom/facebook/react/uimanager/PixelUtil;

    invoke-virtual {v8}, Lcom/facebook/react/views/text/TextLayoutManager$AttachmentMetrics;->getLeft()F

    move-result p4

    invoke-virtual {p3, p4}, Lcom/facebook/react/uimanager/PixelUtil;->pxToDp(F)F

    move-result p3

    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 972
    sget-object p3, Lcom/facebook/react/uimanager/PixelUtil;->INSTANCE:Lcom/facebook/react/uimanager/PixelUtil;

    invoke-virtual {v8}, Lcom/facebook/react/views/text/TextLayoutManager$AttachmentMetrics;->getWidth()F

    move-result p4

    invoke-virtual {p3, p4}, Lcom/facebook/react/uimanager/PixelUtil;->pxToDp(F)F

    move-result p3

    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 973
    sget-object p3, Lcom/facebook/react/uimanager/PixelUtil;->INSTANCE:Lcom/facebook/react/uimanager/PixelUtil;

    invoke-virtual {v8}, Lcom/facebook/react/views/text/TextLayoutManager$AttachmentMetrics;->getHeight()F

    move-result p4

    invoke-virtual {p3, p4}, Lcom/facebook/react/uimanager/PixelUtil;->pxToDp(F)F

    move-result p3

    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 979
    :cond_1
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p0

    new-array p0, p0, [F

    .line 980
    move-object p3, p2

    check-cast p3, Ljava/util/Collection;

    invoke-interface {p3}, Ljava/util/Collection;->size()I

    move-result p3

    :goto_1
    if-ge p1, p3, :cond_2

    .line 981
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p4

    const-string v0, "get(...)"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->floatValue()F

    move-result p4

    aput p4, p0, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    :cond_2
    return-object p0
.end method

.method public static final measureText(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/MapBuffer;Lcom/facebook/react/common/mapbuffer/MapBuffer;FLcom/facebook/yoga/YogaMeasureMode;FLcom/facebook/yoga/YogaMeasureMode;Lcom/facebook/react/views/text/ReactTextViewManagerCallback;[F)J
    .locals 9
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attributedString"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paragraphAttributes"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "widthYogaMeasureMode"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "heightYogaMeasureMode"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 885
    sget-object v0, Lcom/facebook/react/views/text/TextLayoutManager;->INSTANCE:Lcom/facebook/react/views/text/TextLayoutManager;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lcom/facebook/react/views/text/TextLayoutManager;->createLayoutForMeasurement(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/MapBuffer;Lcom/facebook/react/common/mapbuffer/MapBuffer;FLcom/facebook/yoga/YogaMeasureMode;FLcom/facebook/yoga/YogaMeasureMode;Lcom/facebook/react/views/text/ReactTextViewManagerCallback;)Landroid/text/Layout;

    move-result-object p1

    const/4 p0, 0x0

    .line 896
    invoke-interface {p2, p0}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->contains(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 897
    invoke-interface {p2, p0}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getInt(I)I

    move-result p2

    goto :goto_0

    :cond_0
    const/4 p2, -0x1

    .line 900
    :goto_0
    invoke-virtual {p1}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type android.text.Spanned"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, v1

    check-cast v3, Landroid/text/Spanned;

    .line 902
    invoke-direct {v0, p1, p2}, Lcom/facebook/react/views/text/TextLayoutManager;->calculateLineCount(Landroid/text/Layout;I)I

    move-result v6

    move-object v2, p1

    move v4, p3

    move-object v5, p4

    move-object v1, v0

    .line 904
    invoke-direct/range {v1 .. v6}, Lcom/facebook/react/views/text/TextLayoutManager;->calculateWidth(Landroid/text/Layout;Landroid/text/Spanned;FLcom/facebook/yoga/YogaMeasureMode;I)F

    move-result p3

    move-object p2, v3

    move p4, v6

    .line 906
    invoke-direct {v0, p1, p5, p6, p4}, Lcom/facebook/react/views/text/TextLayoutManager;->calculateHeight(Landroid/text/Layout;FLcom/facebook/yoga/YogaMeasureMode;I)F

    move-result v0

    if-eqz p8, :cond_2

    .line 912
    new-instance v1, Lcom/facebook/react/views/text/TextLayoutManager$AttachmentMetrics;

    invoke-direct {v1}, Lcom/facebook/react/views/text/TextLayoutManager$AttachmentMetrics;-><init>()V

    move v2, p0

    .line 914
    :cond_1
    :goto_1
    invoke-interface {p2}, Landroid/text/Spanned;->length()I

    move-result v3

    if-ge p0, v3, :cond_2

    .line 916
    sget-object v3, Lcom/facebook/react/views/text/TextLayoutManager;->INSTANCE:Lcom/facebook/react/views/text/TextLayoutManager;

    const/4 v4, 0x0

    move p5, p0

    move-object/from16 p7, v1

    move-object p0, v3

    move p6, v4

    invoke-direct/range {p0 .. p7}, Lcom/facebook/react/views/text/TextLayoutManager;->nextAttachmentMetrics(Landroid/text/Layout;Landroid/text/Spanned;FIIFLcom/facebook/react/views/text/TextLayoutManager$AttachmentMetrics;)I

    move-result p0

    .line 918
    invoke-virtual {v1}, Lcom/facebook/react/views/text/TextLayoutManager$AttachmentMetrics;->getWasFound()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 919
    sget-object v3, Lcom/facebook/react/uimanager/PixelUtil;->INSTANCE:Lcom/facebook/react/uimanager/PixelUtil;

    invoke-virtual {v1}, Lcom/facebook/react/views/text/TextLayoutManager$AttachmentMetrics;->getTop()F

    move-result v4

    invoke-virtual {v3, v4}, Lcom/facebook/react/uimanager/PixelUtil;->pxToDp(F)F

    move-result v3

    aput v3, p8, v2

    add-int/lit8 v3, v2, 0x1

    .line 920
    sget-object v4, Lcom/facebook/react/uimanager/PixelUtil;->INSTANCE:Lcom/facebook/react/uimanager/PixelUtil;

    invoke-virtual {v1}, Lcom/facebook/react/views/text/TextLayoutManager$AttachmentMetrics;->getLeft()F

    move-result v5

    invoke-virtual {v4, v5}, Lcom/facebook/react/uimanager/PixelUtil;->pxToDp(F)F

    move-result v4

    aput v4, p8, v3

    add-int/lit8 v2, v2, 0x2

    goto :goto_1

    .line 927
    :cond_2
    sget-object p0, Lcom/facebook/react/uimanager/PixelUtil;->INSTANCE:Lcom/facebook/react/uimanager/PixelUtil;

    invoke-virtual {p0, p3}, Lcom/facebook/react/uimanager/PixelUtil;->pxToDp(F)F

    move-result p0

    .line 928
    sget-object p1, Lcom/facebook/react/uimanager/PixelUtil;->INSTANCE:Lcom/facebook/react/uimanager/PixelUtil;

    invoke-virtual {p1, v0}, Lcom/facebook/react/uimanager/PixelUtil;->pxToDp(F)F

    move-result p1

    .line 930
    invoke-static {p0, p1}, Lcom/facebook/yoga/YogaMeasureOutput;->make(FF)J

    move-result-wide p0

    return-wide p0
.end method

.method private final newPaintWithAttributes(Lcom/facebook/react/views/text/TextAttributeProps;Landroid/content/Context;)Landroid/text/TextPaint;
    .locals 2

    .line 633
    new-instance v0, Landroid/text/TextPaint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/text/TextPaint;-><init>(I)V

    .line 634
    invoke-direct {p0, v0, p1, p2}, Lcom/facebook/react/views/text/TextLayoutManager;->updateTextPaint(Landroid/text/TextPaint;Lcom/facebook/react/views/text/TextAttributeProps;Landroid/content/Context;)V

    return-object v0
.end method

.method private final nextAttachmentMetrics(Landroid/text/Layout;Landroid/text/Spanned;FIIFLcom/facebook/react/views/text/TextLayoutManager$AttachmentMetrics;)I
    .locals 13

    move/from16 v1, p5

    move-object/from16 v2, p7

    .line 1074
    invoke-interface {p2}, Landroid/text/Spanned;->length()I

    move-result v3

    const-class v4, Lcom/facebook/react/views/text/internal/span/TextInlineViewPlaceholderSpan;

    invoke-interface {p2, v1, v3, v4}, Landroid/text/Spanned;->nextSpanTransition(IILjava/lang/Class;)I

    move-result v3

    .line 1076
    const-class v4, Lcom/facebook/react/views/text/internal/span/TextInlineViewPlaceholderSpan;

    invoke-interface {p2, v1, v3, v4}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lcom/facebook/react/views/text/internal/span/TextInlineViewPlaceholderSpan;

    .line 1078
    array-length v4, v1

    const/4 v5, 0x0

    if-nez v4, :cond_0

    .line 1079
    invoke-virtual {v2, v5}, Lcom/facebook/react/views/text/TextLayoutManager$AttachmentMetrics;->setWasFound(Z)V

    return v3

    .line 1083
    :cond_0
    array-length v4, v1

    const/4 v6, 0x1

    if-ne v4, v6, :cond_1

    move v4, v6

    goto :goto_0

    :cond_1
    move v4, v5

    :goto_0
    invoke-static {v4}, Lcom/facebook/infer/annotation/Assertions;->assertCondition(Z)V

    .line 1084
    aget-object v1, v1, v5

    .line 1086
    invoke-interface {p2, v1}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result v4

    .line 1087
    invoke-virtual {p1, v4}, Landroid/text/Layout;->getLineForOffset(I)I

    move-result v7

    .line 1088
    invoke-virtual {p1, v7}, Landroid/text/Layout;->getEllipsisCount(I)I

    move-result v8

    if-lez v8, :cond_2

    move v9, v6

    goto :goto_1

    :cond_2
    move v9, v5

    :goto_1
    move/from16 v8, p4

    if-gt v7, v8, :cond_b

    if-eqz v9, :cond_3

    .line 1091
    invoke-virtual {p1, v7}, Landroid/text/Layout;->getLineStart(I)I

    move-result v8

    invoke-virtual {p1, v7}, Landroid/text/Layout;->getEllipsisStart(I)I

    move-result v9

    add-int/2addr v8, v9

    if-lt v4, v8, :cond_3

    goto/16 :goto_6

    .line 1096
    :cond_3
    invoke-virtual {v1}, Lcom/facebook/react/views/text/internal/span/TextInlineViewPlaceholderSpan;->getWidth()I

    move-result v8

    int-to-float v8, v8

    .line 1097
    invoke-virtual {v1}, Lcom/facebook/react/views/text/internal/span/TextInlineViewPlaceholderSpan;->getHeight()I

    move-result v9

    int-to-float v9, v9

    .line 1099
    invoke-virtual {p1, v4}, Landroid/text/Layout;->isRtlCharAt(I)Z

    move-result v10

    .line 1100
    invoke-virtual {p1, v7}, Landroid/text/Layout;->getParagraphDirection(I)I

    move-result v11

    const/4 v12, -0x1

    if-ne v11, v12, :cond_4

    move v5, v6

    .line 1105
    :cond_4
    invoke-interface {p2}, Landroid/text/Spanned;->length()I

    move-result v11

    sub-int/2addr v11, v6

    if-ne v4, v11, :cond_7

    .line 1106
    invoke-interface {p2}, Landroid/text/Spanned;->length()I

    move-result v4

    if-lez v4, :cond_5

    invoke-virtual {p1, v7}, Landroid/text/Layout;->getLineEnd(I)I

    move-result v4

    sub-int/2addr v4, v6

    invoke-interface {p2, v4}, Landroid/text/Spanned;->charAt(I)C

    move-result v0

    const/16 v4, 0xa

    if-ne v0, v4, :cond_5

    .line 1107
    invoke-virtual {p1, v7}, Landroid/text/Layout;->getLineMax(I)F

    move-result v0

    goto :goto_2

    :cond_5
    invoke-virtual {p1, v7}, Landroid/text/Layout;->getLineWidth(I)F

    move-result v0

    :goto_2
    if-eqz v5, :cond_6

    sub-float v0, p3, v0

    goto :goto_5

    .line 1117
    :cond_6
    invoke-virtual {p1, v7}, Landroid/text/Layout;->getLineRight(I)F

    move-result v0

    goto :goto_4

    :cond_7
    if-ne v5, v10, :cond_8

    .line 1128
    invoke-virtual {p1, v4}, Landroid/text/Layout;->getPrimaryHorizontal(I)F

    move-result v0

    goto :goto_3

    .line 1129
    :cond_8
    invoke-virtual {p1, v4}, Landroid/text/Layout;->getSecondaryHorizontal(I)F

    move-result v0

    :goto_3
    if-eqz v5, :cond_9

    if-nez v10, :cond_9

    .line 1141
    invoke-virtual {p1, v7}, Landroid/text/Layout;->getLineRight(I)F

    move-result v4

    sub-float/2addr v4, v0

    sub-float v0, p3, v4

    :cond_9
    if-eqz v10, :cond_a

    :goto_4
    sub-float/2addr v0, v8

    .line 1148
    :cond_a
    :goto_5
    invoke-virtual {p1, v7}, Landroid/text/Layout;->getLineBaseline(I)I

    move-result p1

    int-to-float p1, p1

    sub-float/2addr p1, v9

    .line 1151
    invoke-virtual {v2, p1}, Lcom/facebook/react/views/text/TextLayoutManager$AttachmentMetrics;->setTop(F)V

    .line 1152
    invoke-virtual {v2, v0}, Lcom/facebook/react/views/text/TextLayoutManager$AttachmentMetrics;->setLeft(F)V

    goto :goto_7

    :cond_b
    :goto_6
    const/high16 p1, 0x7fc00000    # Float.NaN

    .line 1093
    invoke-virtual {v2, p1}, Lcom/facebook/react/views/text/TextLayoutManager$AttachmentMetrics;->setTop(F)V

    .line 1094
    invoke-virtual {v2, p1}, Lcom/facebook/react/views/text/TextLayoutManager$AttachmentMetrics;->setLeft(F)V

    .line 1157
    :goto_7
    invoke-virtual {v2}, Lcom/facebook/react/views/text/TextLayoutManager$AttachmentMetrics;->getTop()F

    move-result p1

    add-float p1, p1, p6

    invoke-virtual {v2, p1}, Lcom/facebook/react/views/text/TextLayoutManager$AttachmentMetrics;->setTop(F)V

    .line 1159
    invoke-virtual {v2, v6}, Lcom/facebook/react/views/text/TextLayoutManager$AttachmentMetrics;->setWasFound(Z)V

    .line 1160
    invoke-virtual {v1}, Lcom/facebook/react/views/text/internal/span/TextInlineViewPlaceholderSpan;->getWidth()I

    move-result p1

    int-to-float p1, p1

    invoke-virtual {v2, p1}, Lcom/facebook/react/views/text/TextLayoutManager$AttachmentMetrics;->setWidth(F)V

    .line 1161
    invoke-virtual {v1}, Lcom/facebook/react/views/text/internal/span/TextInlineViewPlaceholderSpan;->getHeight()I

    move-result p1

    int-to-float p1, p1

    invoke-virtual {v2, p1}, Lcom/facebook/react/views/text/TextLayoutManager$AttachmentMetrics;->setHeight(F)V

    return v3
.end method

.method private final scratchPaintWithAttributes(Lcom/facebook/react/views/text/TextAttributeProps;Landroid/content/Context;)Landroid/text/TextPaint;
    .locals 2

    .line 620
    sget-object v0, Lcom/facebook/react/views/text/TextLayoutManager;->textPaintInstance:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    check-cast v0, Landroid/text/TextPaint;

    const/4 v1, 0x0

    .line 621
    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    const/high16 v1, 0x41400000    # 12.0f

    .line 622
    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setTextSize(F)V

    const/4 v1, 0x0

    .line 623
    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setFakeBoldText(Z)V

    const/4 v1, 0x0

    .line 624
    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setTextSkewX(F)V

    .line 625
    invoke-direct {p0, v0, p1, p2}, Lcom/facebook/react/views/text/TextLayoutManager;->updateTextPaint(Landroid/text/TextPaint;Lcom/facebook/react/views/text/TextAttributeProps;Landroid/content/Context;)V

    return-object v0

    .line 620
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Required value was null."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final updateTextPaint(Landroid/text/TextPaint;Lcom/facebook/react/views/text/TextAttributeProps;Landroid/content/Context;)V
    .locals 5

    .line 586
    invoke-virtual {p2}, Lcom/facebook/react/views/text/TextAttributeProps;->getEffectiveFontSize()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 587
    invoke-virtual {p2}, Lcom/facebook/react/views/text/TextAttributeProps;->getEffectiveFontSize()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p1, v0}, Landroid/text/TextPaint;->setTextSize(F)V

    .line 590
    :cond_0
    invoke-virtual {p2}, Lcom/facebook/react/views/text/TextAttributeProps;->getFontStyle()I

    move-result v0

    if-ne v0, v1, :cond_1

    .line 591
    invoke-virtual {p2}, Lcom/facebook/react/views/text/TextAttributeProps;->getFontWeight()I

    move-result v0

    if-ne v0, v1, :cond_1

    .line 592
    invoke-virtual {p2}, Lcom/facebook/react/views/text/TextAttributeProps;->getFontFamily()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 596
    :cond_1
    invoke-virtual {p2}, Lcom/facebook/react/views/text/TextAttributeProps;->getFontStyle()I

    move-result v0

    .line 597
    invoke-virtual {p2}, Lcom/facebook/react/views/text/TextAttributeProps;->getFontWeight()I

    move-result v2

    .line 598
    invoke-virtual {p2}, Lcom/facebook/react/views/text/TextAttributeProps;->getFontFamily()Ljava/lang/String;

    move-result-object v3

    .line 599
    invoke-virtual {p3}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object p3

    const-string v4, "getAssets(...)"

    invoke-static {p3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    .line 594
    invoke-static {v4, v0, v2, v3, p3}, Lcom/facebook/react/views/text/ReactTypefaceUtils;->applyStyles(Landroid/graphics/Typeface;IILjava/lang/String;Landroid/content/res/AssetManager;)Landroid/graphics/Typeface;

    move-result-object p3

    .line 600
    invoke-virtual {p1, p3}, Landroid/text/TextPaint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 602
    invoke-virtual {p2}, Lcom/facebook/react/views/text/TextAttributeProps;->getFontStyle()I

    move-result v0

    if-eq v0, v1, :cond_4

    .line 603
    invoke-virtual {p2}, Lcom/facebook/react/views/text/TextAttributeProps;->getFontStyle()I

    move-result v0

    invoke-virtual {p3}, Landroid/graphics/Typeface;->getStyle()I

    move-result v1

    if-eq v0, v1, :cond_4

    .line 605
    invoke-virtual {p2}, Lcom/facebook/react/views/text/TextAttributeProps;->getFontStyle()I

    move-result p2

    invoke-virtual {p3}, Landroid/graphics/Typeface;->getStyle()I

    move-result p3

    not-int p3, p3

    and-int/2addr p2, p3

    and-int/lit8 p3, p2, 0x1

    if-eqz p3, :cond_2

    const/4 p3, 0x1

    goto :goto_0

    :cond_2
    const/4 p3, 0x0

    .line 606
    :goto_0
    invoke-virtual {p1, p3}, Landroid/text/TextPaint;->setFakeBoldText(Z)V

    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_3

    const/high16 p2, -0x41800000    # -0.25f

    goto :goto_1

    :cond_3
    const/4 p2, 0x0

    .line 607
    :goto_1
    invoke-virtual {p1, p2}, Landroid/text/TextPaint;->setTextSkewX(F)V

    :cond_4
    return-void
.end method


# virtual methods
.method public final deleteCachedSpannableForTag(I)V
    .locals 1

    .line 110
    sget-object v0, Lcom/facebook/react/views/text/TextLayoutManager;->tagToSpannableCache:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final getOrCreateSpannableForText(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/MapBuffer;Lcom/facebook/react/views/text/ReactTextViewManagerCallback;)Landroid/text/Spannable;
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attributedString"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x3

    .line 471
    invoke-interface {p2, v0}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->contains(I)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 472
    invoke-interface {p2, v0}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getInt(I)I

    move-result p1

    .line 473
    sget-object p2, Lcom/facebook/react/views/text/TextLayoutManager;->tagToSpannableCache:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    check-cast p1, Landroid/text/Spannable;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Required value was null."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 476
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/react/views/text/TextLayoutManager;->createSpannableFromAttributedString(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/MapBuffer;Lcom/facebook/react/views/text/ReactTextViewManagerCallback;)Landroid/text/Spannable;

    move-result-object p1

    return-object p1
.end method

.method public final isRTL(Lcom/facebook/react/common/mapbuffer/MapBuffer;)Z
    .locals 3

    const-string v0, "attributedString"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    .line 116
    invoke-interface {p1, v0}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->contains(I)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    .line 120
    :cond_0
    invoke-interface {p1, v0}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getMapBuffer(I)Lcom/facebook/react/common/mapbuffer/MapBuffer;

    move-result-object p1

    .line 121
    invoke-interface {p1}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getCount()I

    move-result v0

    if-nez v0, :cond_1

    return v2

    .line 125
    :cond_1
    invoke-interface {p1, v2}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getMapBuffer(I)Lcom/facebook/react/common/mapbuffer/MapBuffer;

    move-result-object p1

    const/4 v0, 0x5

    .line 126
    invoke-interface {p1, v0}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getMapBuffer(I)Lcom/facebook/react/common/mapbuffer/MapBuffer;

    move-result-object p1

    const/16 v0, 0x17

    .line 128
    invoke-interface {p1, v0}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->contains(I)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    .line 133
    :cond_2
    invoke-interface {p1, v0}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 132
    invoke-static {p1}, Lcom/facebook/react/views/text/TextAttributeProps;->getLayoutDirection(Ljava/lang/String;)I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_3

    return v0

    :cond_3
    return v2
.end method

.method public final setCachedSpannableForTag(ILandroid/text/Spannable;)V
    .locals 1

    const-string/jumbo v0, "sp"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    .line 106
    sget-object v0, Lcom/facebook/react/views/text/TextLayoutManager;->tagToSpannableCache:Ljava/util/concurrent/ConcurrentHashMap;

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
