package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.ArrayRow;
import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class Chain {
    private static final boolean DEBUG = false;
    public static final boolean USE_CHAIN_OPTIMIZATION = false;

    public static void applyChainConstraints(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem system, ArrayList<ConstraintWidget> widgets, int orientation) {
        int offset;
        int chainsSize;
        ChainHead[] chainsArray;
        if (orientation == 0) {
            offset = 0;
            chainsSize = constraintWidgetContainer.mHorizontalChainsSize;
            chainsArray = constraintWidgetContainer.mHorizontalChainsArray;
        } else {
            offset = 2;
            chainsSize = constraintWidgetContainer.mVerticalChainsSize;
            chainsArray = constraintWidgetContainer.mVerticalChainsArray;
        }
        for (int i = 0; i < chainsSize; i++) {
            ChainHead first = chainsArray[i];
            first.define();
            if (widgets == null || (widgets != null && widgets.contains(first.mFirst))) {
                applyChainConstraints(constraintWidgetContainer, system, orientation, offset, first);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0631  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x065a  */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v86 */
    /* JADX WARN: Type inference failed for: r4v87 */
    /* JADX WARN: Type inference failed for: r4v88 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void applyChainConstraints(ConstraintWidgetContainer container, LinearSystem system, int orientation, int offset, ChainHead chainHead) {
        boolean isChainSpread;
        boolean isChainSpreadInside;
        ConstraintWidget widget;
        boolean done;
        ConstraintWidget next;
        ConstraintWidget widget2;
        LinearSystem linearSystem;
        SolverVariable beginTarget;
        SolverVariable endTarget;
        ConstraintAnchor end;
        ConstraintAnchor end2;
        ConstraintAnchor endTarget2;
        ConstraintWidget previousVisibleWidget;
        ConstraintWidget widget3;
        ConstraintWidget next2;
        int nextMargin;
        ConstraintAnchor beginNextAnchor;
        SolverVariable beginNext;
        SolverVariable beginNext2;
        int nextMargin2;
        ConstraintWidget next3;
        ConstraintAnchor beginNextAnchor2;
        ConstraintWidget previousVisibleWidget2;
        ConstraintWidget widget4;
        ConstraintWidget next4;
        int nextMargin3;
        int nextMargin4;
        float bias;
        int count;
        float totalWeights;
        ArrayList<ConstraintWidget> listMatchConstraints;
        int count2;
        float currentWeight;
        int margin;
        float totalWeights2;
        ConstraintWidget firstMatchConstraintsWidget;
        ConstraintWidget next5;
        int strength;
        ConstraintWidget first = chainHead.mFirst;
        ConstraintWidget last = chainHead.mLast;
        ConstraintWidget firstVisibleWidget = chainHead.mFirstVisibleWidget;
        ConstraintWidget lastVisibleWidget = chainHead.mLastVisibleWidget;
        ConstraintWidget head = chainHead.mHead;
        float totalWeights3 = chainHead.mTotalWeight;
        ConstraintWidget firstMatchConstraintsWidget2 = chainHead.mFirstMatchConstraintWidget;
        ConstraintWidget constraintWidget = chainHead.mLastMatchConstraintWidget;
        boolean isWrapContent = container.mListDimensionBehaviors[orientation] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (orientation == 0) {
            boolean isChainSpread2 = head.mHorizontalChainStyle == 0;
            isChainSpread = isChainSpread2;
            boolean isChainSpreadInside2 = head.mHorizontalChainStyle == 1;
            isChainSpreadInside = isChainSpreadInside2;
            widget = first;
            done = false;
            next = head.mHorizontalChainStyle == 2 ? 1 : 0;
        } else {
            boolean isChainSpread3 = head.mVerticalChainStyle == 0;
            isChainSpread = isChainSpread3;
            boolean isChainSpreadInside3 = head.mVerticalChainStyle == 1;
            isChainSpreadInside = isChainSpreadInside3;
            widget = first;
            done = false;
            next = head.mVerticalChainStyle == 2 ? 1 : 0;
        }
        while (!done) {
            ConstraintAnchor begin = widget.mListAnchors[offset];
            int strength2 = 4;
            if (next != null) {
                strength2 = 1;
            }
            int margin2 = begin.getMargin();
            boolean isSpreadOnly = widget.mListDimensionBehaviors[orientation] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && widget.mResolvedMatchConstraintDefault[orientation] == 0;
            if (begin.mTarget != null && widget != first) {
                margin = margin2 + begin.mTarget.getMargin();
            } else {
                margin = margin2;
            }
            if (next != null && widget != first && widget != firstVisibleWidget) {
                strength2 = 8;
            }
            boolean isSpreadOnly2 = isSpreadOnly;
            if (begin.mTarget == null) {
                totalWeights2 = totalWeights3;
                firstMatchConstraintsWidget = firstMatchConstraintsWidget2;
            } else {
                if (widget == firstVisibleWidget) {
                    totalWeights2 = totalWeights3;
                    firstMatchConstraintsWidget = firstMatchConstraintsWidget2;
                    system.addGreaterThan(begin.mSolverVariable, begin.mTarget.mSolverVariable, margin, 6);
                } else {
                    totalWeights2 = totalWeights3;
                    firstMatchConstraintsWidget = firstMatchConstraintsWidget2;
                    system.addGreaterThan(begin.mSolverVariable, begin.mTarget.mSolverVariable, margin, 8);
                }
                if (isSpreadOnly2 && next == null) {
                    strength2 = 5;
                }
                if (widget == firstVisibleWidget && next != null && widget.isInBarrier(orientation)) {
                    strength = 5;
                } else {
                    strength = strength2;
                }
                system.addEquality(begin.mSolverVariable, begin.mTarget.mSolverVariable, margin, strength);
            }
            if (isWrapContent) {
                if (widget.getVisibility() != 8 && widget.mListDimensionBehaviors[orientation] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    system.addGreaterThan(widget.mListAnchors[offset + 1].mSolverVariable, widget.mListAnchors[offset].mSolverVariable, 0, 5);
                }
                system.addGreaterThan(widget.mListAnchors[offset].mSolverVariable, container.mListAnchors[offset].mSolverVariable, 0, 8);
            }
            ConstraintAnchor nextAnchor = widget.mListAnchors[offset + 1].mTarget;
            if (nextAnchor != null) {
                ConstraintWidget next6 = nextAnchor.mOwner;
                next5 = (next6.mListAnchors[offset].mTarget == null || next6.mListAnchors[offset].mTarget.mOwner != widget) ? null : next6;
            } else {
                next5 = null;
            }
            if (next5 != null) {
                widget = next5;
            } else {
                done = true;
            }
            totalWeights3 = totalWeights2;
            firstMatchConstraintsWidget2 = firstMatchConstraintsWidget;
        }
        float totalWeights4 = totalWeights3;
        if (lastVisibleWidget == null || last.mListAnchors[offset + 1].mTarget == null) {
            widget2 = widget;
        } else {
            ConstraintAnchor end3 = lastVisibleWidget.mListAnchors[offset + 1];
            boolean isSpreadOnly3 = lastVisibleWidget.mListDimensionBehaviors[orientation] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && lastVisibleWidget.mResolvedMatchConstraintDefault[orientation] == 0;
            if (!isSpreadOnly3 || next != null || end3.mTarget.mOwner != container) {
                widget2 = widget;
                if (next != null && end3.mTarget.mOwner == container) {
                    system.addEquality(end3.mSolverVariable, end3.mTarget.mSolverVariable, -end3.getMargin(), 4);
                }
            } else {
                widget2 = widget;
                system.addEquality(end3.mSolverVariable, end3.mTarget.mSolverVariable, -end3.getMargin(), 5);
            }
            system.addLowerThan(end3.mSolverVariable, last.mListAnchors[offset + 1].mTarget.mSolverVariable, -end3.getMargin(), 6);
        }
        if (isWrapContent) {
            system.addGreaterThan(container.mListAnchors[offset + 1].mSolverVariable, last.mListAnchors[offset + 1].mSolverVariable, last.mListAnchors[offset + 1].getMargin(), 8);
        }
        ArrayList<ConstraintWidget> listMatchConstraints2 = chainHead.mWeightedMatchConstraintsWidgets;
        if (listMatchConstraints2 != null && (count = listMatchConstraints2.size()) > 1) {
            ConstraintWidget lastMatch = null;
            if (chainHead.mHasUndefinedWeights && !chainHead.mHasComplexMatchWeights) {
                totalWeights = chainHead.mWidgetsMatchCount;
            } else {
                totalWeights = totalWeights4;
            }
            int i = 0;
            float lastWeight = 0.0f;
            for (count = listMatchConstraints2.size(); i < count; count = count2) {
                ConstraintWidget match = listMatchConstraints2.get(i);
                float currentWeight2 = match.mWeight[orientation];
                if (currentWeight2 >= 0.0f) {
                    listMatchConstraints = listMatchConstraints2;
                    count2 = count;
                    currentWeight = currentWeight2;
                } else if (chainHead.mHasComplexMatchWeights) {
                    listMatchConstraints = listMatchConstraints2;
                    count2 = count;
                    system.addEquality(match.mListAnchors[offset + 1].mSolverVariable, match.mListAnchors[offset].mSolverVariable, 0, 4);
                    i++;
                    listMatchConstraints2 = listMatchConstraints;
                } else {
                    listMatchConstraints = listMatchConstraints2;
                    count2 = count;
                    currentWeight = 1.0f;
                }
                if (currentWeight == 0.0f) {
                    system.addEquality(match.mListAnchors[offset + 1].mSolverVariable, match.mListAnchors[offset].mSolverVariable, 0, 8);
                } else {
                    if (lastMatch != null) {
                        SolverVariable begin2 = lastMatch.mListAnchors[offset].mSolverVariable;
                        SolverVariable end4 = lastMatch.mListAnchors[offset + 1].mSolverVariable;
                        SolverVariable nextBegin = match.mListAnchors[offset].mSolverVariable;
                        SolverVariable nextEnd = match.mListAnchors[offset + 1].mSolverVariable;
                        ArrayRow row = system.createRow();
                        row.createRowEqualMatchDimensions(lastWeight, totalWeights, currentWeight, begin2, end4, nextBegin, nextEnd);
                        system.addConstraint(row);
                    }
                    lastMatch = match;
                    lastWeight = currentWeight;
                }
                i++;
                listMatchConstraints2 = listMatchConstraints;
            }
        }
        if (firstVisibleWidget != null && (firstVisibleWidget == lastVisibleWidget || next != null)) {
            ConstraintAnchor begin3 = first.mListAnchors[offset];
            ConstraintAnchor end5 = last.mListAnchors[offset + 1];
            SolverVariable beginTarget2 = begin3.mTarget != null ? begin3.mTarget.mSolverVariable : null;
            SolverVariable endTarget3 = end5.mTarget != null ? end5.mTarget.mSolverVariable : null;
            ConstraintAnchor begin4 = firstVisibleWidget.mListAnchors[offset];
            if (lastVisibleWidget != null) {
                end5 = lastVisibleWidget.mListAnchors[offset + 1];
            }
            if (beginTarget2 != null && endTarget3 != null) {
                if (orientation == 0) {
                    bias = head.mHorizontalBiasPercent;
                } else {
                    bias = head.mVerticalBiasPercent;
                }
                int beginMargin = begin4.getMargin();
                int endMargin = end5.getMargin();
                system.addCentering(begin4.mSolverVariable, beginTarget2, beginMargin, bias, endTarget3, end5.mSolverVariable, endMargin, 7);
            }
            linearSystem = system;
            if (!isChainSpread) {
            }
            ConstraintAnchor begin5 = firstVisibleWidget.mListAnchors[offset];
            if (lastVisibleWidget == null) {
            }
            ConstraintAnchor end6 = lastVisibleWidget.mListAnchors[offset + 1];
            if (begin5.mTarget == null) {
            }
            if (end6.mTarget == null) {
            }
            if (last != lastVisibleWidget) {
            }
            if (firstVisibleWidget == lastVisibleWidget) {
            }
            if (beginTarget != null) {
                return;
            }
        }
        if (!isChainSpread || firstVisibleWidget == null) {
            int i2 = 8;
            if (!isChainSpreadInside || firstVisibleWidget == null) {
                linearSystem = system;
            } else {
                boolean applyFixedEquality = chainHead.mWidgetsMatchCount > 0 && chainHead.mWidgetsCount == chainHead.mWidgetsMatchCount;
                ConstraintWidget previousVisibleWidget3 = firstVisibleWidget;
                ConstraintWidget widget5 = firstVisibleWidget;
                while (previousVisibleWidget3 != null) {
                    ConstraintWidget next7 = previousVisibleWidget3.mNextChainWidget[orientation];
                    while (next7 != null && next7.getVisibility() == i2) {
                        next7 = next7.mNextChainWidget[orientation];
                    }
                    if (previousVisibleWidget3 == firstVisibleWidget || previousVisibleWidget3 == lastVisibleWidget || next7 == null) {
                        previousVisibleWidget = widget5;
                        widget3 = previousVisibleWidget3;
                        next2 = next7;
                    } else {
                        if (next7 == lastVisibleWidget) {
                            next7 = null;
                        }
                        ConstraintAnchor beginAnchor = previousVisibleWidget3.mListAnchors[offset];
                        SolverVariable begin6 = beginAnchor.mSolverVariable;
                        if (beginAnchor.mTarget != null) {
                            SolverVariable solverVariable = beginAnchor.mTarget.mSolverVariable;
                        }
                        SolverVariable beginTarget3 = widget5.mListAnchors[offset + 1].mSolverVariable;
                        SolverVariable beginNext3 = null;
                        int beginMargin2 = beginAnchor.getMargin();
                        int nextMargin5 = previousVisibleWidget3.mListAnchors[offset + 1].getMargin();
                        if (next7 != null) {
                            nextMargin = nextMargin5;
                            beginNextAnchor = next7.mListAnchors[offset];
                            beginNext2 = beginNextAnchor.mSolverVariable;
                            beginNext = beginNextAnchor.mTarget != null ? beginNextAnchor.mTarget.mSolverVariable : null;
                        } else {
                            nextMargin = nextMargin5;
                            beginNextAnchor = lastVisibleWidget.mListAnchors[offset];
                            if (beginNextAnchor != null) {
                                beginNext3 = beginNextAnchor.mSolverVariable;
                            }
                            SolverVariable solverVariable2 = beginNext3;
                            beginNext = previousVisibleWidget3.mListAnchors[offset + 1].mSolverVariable;
                            beginNext2 = solverVariable2;
                        }
                        if (beginNextAnchor == null) {
                            nextMargin2 = nextMargin;
                        } else {
                            nextMargin2 = nextMargin + beginNextAnchor.getMargin();
                        }
                        int beginMargin3 = beginMargin2 + widget5.mListAnchors[offset + 1].getMargin();
                        int strength3 = 4;
                        if (applyFixedEquality) {
                            strength3 = 8;
                        }
                        if (begin6 == null || beginTarget3 == null || beginNext2 == null || beginNext == null) {
                            widget3 = previousVisibleWidget3;
                            next3 = next7;
                            previousVisibleWidget = widget5;
                        } else {
                            widget3 = previousVisibleWidget3;
                            next3 = next7;
                            SolverVariable beginTarget4 = beginNext2;
                            SolverVariable beginNext4 = beginNext;
                            int nextMargin6 = nextMargin2;
                            int nextMargin7 = strength3;
                            previousVisibleWidget = widget5;
                            system.addCentering(begin6, beginTarget3, beginMargin3, 0.5f, beginTarget4, beginNext4, nextMargin6, nextMargin7);
                        }
                        next2 = next3;
                    }
                    if (widget3.getVisibility() != 8) {
                        previousVisibleWidget = widget3;
                    }
                    previousVisibleWidget3 = next2;
                    widget5 = previousVisibleWidget;
                    i2 = 8;
                }
                linearSystem = system;
                ConstraintAnchor begin7 = firstVisibleWidget.mListAnchors[offset];
                ConstraintAnchor beginTarget5 = first.mListAnchors[offset].mTarget;
                ConstraintAnchor end7 = lastVisibleWidget.mListAnchors[offset + 1];
                ConstraintAnchor endTarget4 = last.mListAnchors[offset + 1].mTarget;
                if (beginTarget5 == null) {
                    end2 = end7;
                    endTarget2 = endTarget4;
                } else if (firstVisibleWidget != lastVisibleWidget) {
                    linearSystem.addEquality(begin7.mSolverVariable, beginTarget5.mSolverVariable, begin7.getMargin(), 5);
                    end2 = end7;
                    endTarget2 = endTarget4;
                } else if (endTarget4 != null) {
                    end2 = end7;
                    endTarget2 = endTarget4;
                    linearSystem.addCentering(begin7.mSolverVariable, beginTarget5.mSolverVariable, begin7.getMargin(), 0.5f, end7.mSolverVariable, endTarget4.mSolverVariable, end7.getMargin(), 5);
                } else {
                    end2 = end7;
                    endTarget2 = endTarget4;
                }
                if (endTarget2 != null && firstVisibleWidget != lastVisibleWidget) {
                    linearSystem.addEquality(end2.mSolverVariable, endTarget2.mSolverVariable, -end2.getMargin(), 5);
                }
            }
        } else {
            boolean applyFixedEquality2 = chainHead.mWidgetsMatchCount > 0 && chainHead.mWidgetsCount == chainHead.mWidgetsMatchCount;
            ConstraintWidget previousVisibleWidget4 = firstVisibleWidget;
            for (ConstraintWidget previousVisibleWidget5 = firstVisibleWidget; previousVisibleWidget5 != null; previousVisibleWidget5 = next4) {
                ConstraintWidget next8 = previousVisibleWidget5.mNextChainWidget[orientation];
                while (next8 != null && next8.getVisibility() == 8) {
                    next8 = next8.mNextChainWidget[orientation];
                }
                if (next8 != null || previousVisibleWidget5 == lastVisibleWidget) {
                    ConstraintAnchor beginAnchor2 = previousVisibleWidget5.mListAnchors[offset];
                    SolverVariable begin8 = beginAnchor2.mSolverVariable;
                    SolverVariable beginTarget6 = beginAnchor2.mTarget != null ? beginAnchor2.mTarget.mSolverVariable : null;
                    if (previousVisibleWidget4 != previousVisibleWidget5) {
                        beginTarget6 = previousVisibleWidget4.mListAnchors[offset + 1].mSolverVariable;
                    } else if (previousVisibleWidget5 == firstVisibleWidget) {
                        beginTarget6 = first.mListAnchors[offset].mTarget != null ? first.mListAnchors[offset].mTarget.mSolverVariable : null;
                    }
                    SolverVariable beginNext5 = null;
                    int beginMargin4 = beginAnchor2.getMargin();
                    int nextMargin8 = previousVisibleWidget5.mListAnchors[offset + 1].getMargin();
                    if (next8 != null) {
                        ConstraintAnchor beginNextAnchor3 = next8.mListAnchors[offset];
                        beginNext5 = beginNextAnchor3.mSolverVariable;
                        beginNextAnchor2 = beginNextAnchor3;
                    } else {
                        ConstraintAnchor beginNextAnchor4 = last.mListAnchors[offset + 1].mTarget;
                        if (beginNextAnchor4 == null) {
                            beginNextAnchor2 = beginNextAnchor4;
                        } else {
                            beginNext5 = beginNextAnchor4.mSolverVariable;
                            beginNextAnchor2 = beginNextAnchor4;
                        }
                    }
                    SolverVariable beginNextTarget = previousVisibleWidget5.mListAnchors[offset + 1].mSolverVariable;
                    if (beginNextAnchor2 != null) {
                        nextMargin8 += beginNextAnchor2.getMargin();
                    }
                    int beginMargin5 = beginMargin4 + previousVisibleWidget4.mListAnchors[offset + 1].getMargin();
                    if (begin8 == null || beginTarget6 == null || beginNext5 == null || beginNextTarget == null) {
                        previousVisibleWidget2 = previousVisibleWidget4;
                        widget4 = previousVisibleWidget5;
                        next4 = next8;
                        nextMargin3 = 8;
                    } else {
                        int margin1 = beginMargin5;
                        if (previousVisibleWidget5 != firstVisibleWidget) {
                            nextMargin4 = nextMargin8;
                        } else {
                            nextMargin4 = nextMargin8;
                            margin1 = firstVisibleWidget.mListAnchors[offset].getMargin();
                        }
                        int margin22 = nextMargin4;
                        if (previousVisibleWidget5 == lastVisibleWidget) {
                            margin22 = lastVisibleWidget.mListAnchors[offset + 1].getMargin();
                        }
                        int strength4 = 5;
                        if (applyFixedEquality2) {
                            strength4 = 8;
                        }
                        widget4 = previousVisibleWidget5;
                        previousVisibleWidget2 = previousVisibleWidget4;
                        next4 = next8;
                        int margin12 = margin1;
                        int margin13 = margin22;
                        nextMargin3 = 8;
                        system.addCentering(begin8, beginTarget6, margin12, 0.5f, beginNext5, beginNextTarget, margin13, strength4);
                    }
                } else {
                    previousVisibleWidget2 = previousVisibleWidget4;
                    widget4 = previousVisibleWidget5;
                    next4 = next8;
                    nextMargin3 = 8;
                }
                if (widget4.getVisibility() == nextMargin3) {
                    previousVisibleWidget4 = previousVisibleWidget2;
                } else {
                    previousVisibleWidget4 = widget4;
                }
            }
            linearSystem = system;
        }
        if ((!isChainSpread || isChainSpreadInside) && firstVisibleWidget != null && firstVisibleWidget != lastVisibleWidget) {
            ConstraintAnchor begin52 = firstVisibleWidget.mListAnchors[offset];
            if (lastVisibleWidget == null) {
                lastVisibleWidget = firstVisibleWidget;
            }
            ConstraintAnchor end62 = lastVisibleWidget.mListAnchors[offset + 1];
            beginTarget = begin52.mTarget == null ? begin52.mTarget.mSolverVariable : null;
            SolverVariable endTarget5 = end62.mTarget == null ? end62.mTarget.mSolverVariable : null;
            if (last != lastVisibleWidget) {
                endTarget = endTarget5;
            } else {
                ConstraintAnchor realEnd = last.mListAnchors[offset + 1];
                SolverVariable endTarget6 = realEnd.mTarget != null ? realEnd.mTarget.mSolverVariable : null;
                endTarget = endTarget6;
            }
            if (firstVisibleWidget == lastVisibleWidget) {
                end = end62;
            } else {
                begin52 = firstVisibleWidget.mListAnchors[offset];
                end = firstVisibleWidget.mListAnchors[offset + 1];
            }
            if (beginTarget != null && endTarget != null) {
                int beginMargin6 = begin52.getMargin();
                int endMargin2 = lastVisibleWidget.mListAnchors[offset + 1].getMargin();
                linearSystem.addCentering(begin52.mSolverVariable, beginTarget, beginMargin6, 0.5f, endTarget, end.mSolverVariable, endMargin2, 5);
            }
        }
    }
}
