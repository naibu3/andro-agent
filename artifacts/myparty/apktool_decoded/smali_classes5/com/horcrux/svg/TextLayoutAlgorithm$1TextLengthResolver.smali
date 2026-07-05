.class Lcom/horcrux/svg/TextLayoutAlgorithm$1TextLengthResolver;
.super Ljava/lang/Object;
.source "TextLayoutAlgorithm.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/horcrux/svg/TextLayoutAlgorithm;->layoutText(Lcom/horcrux/svg/TextLayoutAlgorithm$LayoutInput;)[Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "TextLengthResolver"
.end annotation


# instance fields
.field global:I

.field final synthetic this$0:Lcom/horcrux/svg/TextLayoutAlgorithm;

.field final synthetic val$result:[Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;


# direct methods
.method static bridge synthetic -$$Nest$mresolveTextLength(Lcom/horcrux/svg/TextLayoutAlgorithm$1TextLengthResolver;Lcom/horcrux/svg/TextView;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/horcrux/svg/TextLayoutAlgorithm$1TextLengthResolver;->resolveTextLength(Lcom/horcrux/svg/TextView;)V

    return-void
.end method

.method constructor <init>(Lcom/horcrux/svg/TextLayoutAlgorithm;[Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 567
    iput-object p1, p0, Lcom/horcrux/svg/TextLayoutAlgorithm$1TextLengthResolver;->this$0:Lcom/horcrux/svg/TextLayoutAlgorithm;

    iput-object p2, p0, Lcom/horcrux/svg/TextLayoutAlgorithm$1TextLengthResolver;->val$result:[Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private resolveTextLength(Lcom/horcrux/svg/TextView;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 576
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    .line 577
    iget-object v3, v1, Lcom/horcrux/svg/TextView;->mTextLength:Lcom/horcrux/svg/SVGLength;

    if-eqz v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 578
    :goto_0
    const-class v6, Lcom/horcrux/svg/TSpanView;

    if-ne v2, v6, :cond_9

    if-eqz v3, :cond_9

    .line 591
    move-object v2, v1

    check-cast v2, Lcom/horcrux/svg/TSpanView;

    iget-object v3, v2, Lcom/horcrux/svg/TSpanView;->mContent:Ljava/lang/String;

    .line 592
    iget v6, v0, Lcom/horcrux/svg/TextLayoutAlgorithm$1TextLengthResolver;->global:I

    if-nez v3, :cond_1

    const/4 v3, 0x0

    goto :goto_1

    .line 593
    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    :goto_1
    add-int/2addr v3, v6

    const-wide/high16 v9, -0x10000000000000L    # Double.NEGATIVE_INFINITY

    move v11, v6

    const-wide/high16 v12, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    :goto_2
    if-gt v11, v3, :cond_3

    .line 604
    iget-object v14, v0, Lcom/horcrux/svg/TextLayoutAlgorithm$1TextLengthResolver;->val$result:[Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;

    aget-object v14, v14, v6

    iget-boolean v14, v14, Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;->addressable:Z

    if-nez v14, :cond_2

    move/from16 v18, v6

    const-wide/high16 v16, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    goto :goto_3

    .line 613
    :cond_2
    iget-object v14, v0, Lcom/horcrux/svg/TextLayoutAlgorithm$1TextLengthResolver;->val$result:[Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;

    aget-object v14, v14, v6

    iget-char v14, v14, Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;->character:C

    const/16 v15, 0xa

    if-eq v14, v15, :cond_9

    const/16 v15, 0xd

    if-eq v14, v15, :cond_9

    .line 623
    iget-object v14, v0, Lcom/horcrux/svg/TextLayoutAlgorithm$1TextLengthResolver;->val$result:[Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;

    aget-object v14, v14, v11

    iget-wide v14, v14, Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;->x:D

    .line 630
    iget-object v4, v0, Lcom/horcrux/svg/TextLayoutAlgorithm$1TextLengthResolver;->val$result:[Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;

    aget-object v4, v4, v11

    const-wide/high16 v16, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    iget-wide v7, v4, Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;->advance:D

    add-double/2addr v7, v14

    move/from16 v18, v6

    .line 641
    invoke-static {v14, v15, v7, v8}, Ljava/lang/Math;->min(DD)D

    move-result-wide v5

    invoke-static {v12, v13, v5, v6}, Ljava/lang/Math;->min(DD)D

    move-result-wide v12

    .line 642
    invoke-static {v14, v15, v7, v8}, Ljava/lang/Math;->max(DD)D

    move-result-wide v5

    invoke-static {v9, v10, v5, v6}, Ljava/lang/Math;->max(DD)D

    move-result-wide v5

    move-wide v9, v5

    :goto_3
    add-int/lit8 v11, v11, 0x1

    move/from16 v6, v18

    goto :goto_2

    :cond_3
    move/from16 v18, v6

    const-wide/high16 v16, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    cmpl-double v5, v12, v16

    if-eqz v5, :cond_9

    .line 655
    iget-object v5, v1, Lcom/horcrux/svg/TextView;->mTextLength:Lcom/horcrux/svg/SVGLength;

    iget-wide v5, v5, Lcom/horcrux/svg/SVGLength;->value:D

    sub-double/2addr v9, v12

    sub-double/2addr v5, v9

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    .line 683
    :goto_4
    invoke-virtual {v1}, Lcom/horcrux/svg/TextView;->getChildCount()I

    move-result v10

    if-ge v7, v10, :cond_6

    .line 684
    invoke-virtual {v1, v7}, Lcom/horcrux/svg/TextView;->getChildAt(I)Landroid/view/View;

    move-result-object v10

    check-cast v10, Lcom/horcrux/svg/TextPathView;

    iget-object v10, v10, Lcom/horcrux/svg/TextPathView;->mTextLength:Lcom/horcrux/svg/SVGLength;

    if-nez v10, :cond_5

    .line 685
    iget-object v10, v2, Lcom/horcrux/svg/TSpanView;->mContent:Ljava/lang/String;

    if-nez v10, :cond_4

    const/4 v10, 0x0

    goto :goto_5

    .line 686
    :cond_4
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v10

    :goto_5
    add-int/2addr v8, v10

    const/4 v4, 0x1

    goto :goto_6

    .line 688
    :cond_5
    iget-object v10, v0, Lcom/horcrux/svg/TextLayoutAlgorithm$1TextLengthResolver;->val$result:[Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;

    aget-object v10, v10, v8

    const/4 v4, 0x1

    iput-boolean v4, v10, Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;->firstCharacterInResolvedDescendant:Z

    add-int/lit8 v9, v9, 0x1

    :goto_6
    add-int/lit8 v7, v7, 0x1

    goto :goto_4

    :cond_6
    const/4 v4, 0x1

    sub-int/2addr v9, v4

    add-int/2addr v8, v9

    int-to-double v1, v8

    div-double/2addr v5, v1

    const-wide/16 v1, 0x0

    move/from16 v4, v18

    :goto_7
    if-gt v4, v3, :cond_9

    .line 721
    iget-object v7, v0, Lcom/horcrux/svg/TextLayoutAlgorithm$1TextLengthResolver;->val$result:[Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;

    aget-object v7, v7, v4

    iget-wide v8, v7, Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;->x:D

    add-double/2addr v8, v1

    iput-wide v8, v7, Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;->x:D

    .line 732
    iget-object v7, v0, Lcom/horcrux/svg/TextLayoutAlgorithm$1TextLengthResolver;->val$result:[Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;

    aget-object v7, v7, v4

    iget-boolean v7, v7, Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;->middle:Z

    if-nez v7, :cond_8

    iget-object v7, v0, Lcom/horcrux/svg/TextLayoutAlgorithm$1TextLengthResolver;->val$result:[Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;

    aget-object v7, v7, v4

    iget-boolean v7, v7, Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;->resolved:Z

    if-eqz v7, :cond_7

    iget-object v7, v0, Lcom/horcrux/svg/TextLayoutAlgorithm$1TextLengthResolver;->val$result:[Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;

    aget-object v7, v7, v4

    iget-boolean v7, v7, Lcom/horcrux/svg/TextLayoutAlgorithm$CharacterInformation;->firstCharacterInResolvedDescendant:Z

    if-eqz v7, :cond_8

    :cond_7
    add-double/2addr v1, v5

    :cond_8
    add-int/lit8 v4, v4, 0x1

    goto :goto_7

    :cond_9
    return-void
.end method
