.class public Lcom/horcrux/svg/FilterRegion;
.super Ljava/lang/Object;
.source "FilterRegion.java"


# instance fields
.field mH:Lcom/horcrux/svg/SVGLength;

.field mW:Lcom/horcrux/svg/SVGLength;

.field mX:Lcom/horcrux/svg/SVGLength;

.field mY:Lcom/horcrux/svg/SVGLength;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private getRelativeOrDefault(Lcom/horcrux/svg/VirtualView;Lcom/horcrux/svg/SVGLength;FD)D
    .locals 2

    if-eqz p2, :cond_1

    .line 31
    iget-object v0, p2, Lcom/horcrux/svg/SVGLength;->unit:Lcom/horcrux/svg/SVGLength$UnitType;

    sget-object v1, Lcom/horcrux/svg/SVGLength$UnitType;->UNKNOWN:Lcom/horcrux/svg/SVGLength$UnitType;

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 34
    :cond_0
    invoke-virtual {p1, p2, p3}, Lcom/horcrux/svg/VirtualView;->relativeOn(Lcom/horcrux/svg/SVGLength;F)D

    move-result-wide p1

    return-wide p1

    :cond_1
    :goto_0
    return-wide p4
.end method


# virtual methods
.method public getCropRect(Lcom/horcrux/svg/VirtualView;Lcom/horcrux/svg/FilterProperties$Units;Landroid/graphics/RectF;)Landroid/graphics/Rect;
    .locals 12

    if-nez p3, :cond_0

    .line 40
    new-instance p1, Landroid/graphics/Rect;

    const/4 p2, 0x0

    invoke-direct {p1, p2, p2, p2, p2}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object p1

    .line 42
    :cond_0
    sget-object v0, Lcom/horcrux/svg/FilterProperties$Units;->OBJECT_BOUNDING_BOX:Lcom/horcrux/svg/FilterProperties$Units;

    if-ne p2, v0, :cond_1

    .line 43
    iget p2, p3, Landroid/graphics/RectF;->left:F

    float-to-double v0, p2

    iget-object p2, p0, Lcom/horcrux/svg/FilterRegion;->mX:Lcom/horcrux/svg/SVGLength;

    invoke-virtual {p3}, Landroid/graphics/RectF;->width()F

    move-result v2

    invoke-virtual {p1, p2, v2}, Lcom/horcrux/svg/VirtualView;->relativeOnFraction(Lcom/horcrux/svg/SVGLength;F)D

    move-result-wide v2

    add-double/2addr v0, v2

    .line 44
    iget p2, p3, Landroid/graphics/RectF;->top:F

    float-to-double v2, p2

    iget-object p2, p0, Lcom/horcrux/svg/FilterRegion;->mY:Lcom/horcrux/svg/SVGLength;

    invoke-virtual {p3}, Landroid/graphics/RectF;->height()F

    move-result v4

    invoke-virtual {p1, p2, v4}, Lcom/horcrux/svg/VirtualView;->relativeOnFraction(Lcom/horcrux/svg/SVGLength;F)D

    move-result-wide v4

    add-double/2addr v2, v4

    .line 45
    iget-object p2, p0, Lcom/horcrux/svg/FilterRegion;->mW:Lcom/horcrux/svg/SVGLength;

    invoke-virtual {p3}, Landroid/graphics/RectF;->width()F

    move-result v4

    invoke-virtual {p1, p2, v4}, Lcom/horcrux/svg/VirtualView;->relativeOnFraction(Lcom/horcrux/svg/SVGLength;F)D

    move-result-wide v4

    .line 46
    iget-object p2, p0, Lcom/horcrux/svg/FilterRegion;->mH:Lcom/horcrux/svg/SVGLength;

    invoke-virtual {p3}, Landroid/graphics/RectF;->height()F

    move-result p3

    invoke-virtual {p1, p2, p3}, Lcom/horcrux/svg/VirtualView;->relativeOnFraction(Lcom/horcrux/svg/SVGLength;F)D

    move-result-wide p1

    goto :goto_0

    .line 48
    :cond_1
    invoke-virtual {p1}, Lcom/horcrux/svg/VirtualView;->getSvgView()Lcom/horcrux/svg/SvgView;

    move-result-object p2

    invoke-virtual {p2}, Lcom/horcrux/svg/SvgView;->getCanvasWidth()F

    move-result v3

    .line 49
    invoke-virtual {p1}, Lcom/horcrux/svg/VirtualView;->getSvgView()Lcom/horcrux/svg/SvgView;

    move-result-object p2

    invoke-virtual {p2}, Lcom/horcrux/svg/SvgView;->getCanvasHeight()F

    move-result v7

    .line 50
    iget-object v2, p0, Lcom/horcrux/svg/FilterRegion;->mX:Lcom/horcrux/svg/SVGLength;

    iget p2, p3, Landroid/graphics/RectF;->left:F

    float-to-double v4, p2

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/horcrux/svg/FilterRegion;->getRelativeOrDefault(Lcom/horcrux/svg/VirtualView;Lcom/horcrux/svg/SVGLength;FD)D

    move-result-wide p1

    .line 51
    iget-object v6, v0, Lcom/horcrux/svg/FilterRegion;->mY:Lcom/horcrux/svg/SVGLength;

    iget v2, p3, Landroid/graphics/RectF;->top:F

    float-to-double v8, v2

    move-object v4, v0

    move-object v5, v1

    invoke-direct/range {v4 .. v9}, Lcom/horcrux/svg/FilterRegion;->getRelativeOrDefault(Lcom/horcrux/svg/VirtualView;Lcom/horcrux/svg/SVGLength;FD)D

    move-result-wide v10

    .line 52
    iget-object v2, v0, Lcom/horcrux/svg/FilterRegion;->mW:Lcom/horcrux/svg/SVGLength;

    invoke-virtual {p3}, Landroid/graphics/RectF;->width()F

    move-result v4

    float-to-double v4, v4

    invoke-direct/range {v0 .. v5}, Lcom/horcrux/svg/FilterRegion;->getRelativeOrDefault(Lcom/horcrux/svg/VirtualView;Lcom/horcrux/svg/SVGLength;FD)D

    move-result-wide v2

    .line 53
    iget-object v6, v0, Lcom/horcrux/svg/FilterRegion;->mH:Lcom/horcrux/svg/SVGLength;

    invoke-virtual {p3}, Landroid/graphics/RectF;->height()F

    move-result p3

    float-to-double v8, p3

    move-object v4, v0

    move-object v5, v1

    invoke-direct/range {v4 .. v9}, Lcom/horcrux/svg/FilterRegion;->getRelativeOrDefault(Lcom/horcrux/svg/VirtualView;Lcom/horcrux/svg/SVGLength;FD)D

    move-result-wide v0

    move-wide v4, v0

    move-wide v0, p1

    move-wide p1, v4

    move-wide v4, v2

    move-wide v2, v10

    .line 55
    :goto_0
    new-instance p3, Landroid/graphics/Rect;

    double-to-int v6, v0

    double-to-int v7, v2

    add-double/2addr v0, v4

    double-to-int v0, v0

    add-double/2addr v2, p1

    double-to-int p1, v2

    invoke-direct {p3, v6, v7, v0, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object p3
.end method

.method public setHeight(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 26
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->from(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    move-result-object p1

    iput-object p1, p0, Lcom/horcrux/svg/FilterRegion;->mH:Lcom/horcrux/svg/SVGLength;

    return-void
.end method

.method public setWidth(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 22
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->from(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    move-result-object p1

    iput-object p1, p0, Lcom/horcrux/svg/FilterRegion;->mW:Lcom/horcrux/svg/SVGLength;

    return-void
.end method

.method public setX(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 14
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->from(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    move-result-object p1

    iput-object p1, p0, Lcom/horcrux/svg/FilterRegion;->mX:Lcom/horcrux/svg/SVGLength;

    return-void
.end method

.method public setY(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 18
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->from(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    move-result-object p1

    iput-object p1, p0, Lcom/horcrux/svg/FilterRegion;->mY:Lcom/horcrux/svg/SVGLength;

    return-void
.end method
