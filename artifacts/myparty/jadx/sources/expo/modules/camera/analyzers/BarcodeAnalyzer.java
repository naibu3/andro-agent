package expo.modules.camera.analyzers;

import android.graphics.Point;
import android.media.Image;
import android.util.Log;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageProxy;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.vision.barcode.BarcodeScanner;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import com.google.mlkit.vision.barcode.BarcodeScanning;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.common.InputImage;
import expo.modules.camera.CameraViewHelper;
import expo.modules.camera.records.BarcodeType;
import expo.modules.camera.records.CameraType;
import expo.modules.camera.utils.BarCodeScannerResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* compiled from: BarcodeAnalyzer.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lexpo/modules/camera/analyzers/BarcodeAnalyzer;", "Landroidx/camera/core/ImageAnalysis$Analyzer;", "lensFacing", "Lexpo/modules/camera/records/CameraType;", "formats", "", "Lexpo/modules/camera/records/BarcodeType;", "onComplete", "Lkotlin/Function1;", "Lexpo/modules/camera/utils/BarCodeScannerResult;", "", "<init>", "(Lexpo/modules/camera/records/CameraType;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "getOnComplete", "()Lkotlin/jvm/functions/Function1;", "barcodeFormats", "", "barcodeScannerOptions", "Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions;", "barcodeScanner", "Lcom/google/mlkit/vision/barcode/BarcodeScanner;", "analyze", "imageProxy", "Landroidx/camera/core/ImageProxy;", "expo-camera_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BarcodeAnalyzer implements ImageAnalysis.Analyzer {
    private final int barcodeFormats;
    private BarcodeScanner barcodeScanner;
    private BarcodeScannerOptions barcodeScannerOptions;
    private final CameraType lensFacing;
    private final Function1<BarCodeScannerResult, Unit> onComplete;

    /* JADX WARN: Multi-variable type inference failed */
    public BarcodeAnalyzer(CameraType lensFacing, List<? extends BarcodeType> formats, Function1<? super BarCodeScannerResult, Unit> onComplete) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(lensFacing, "lensFacing");
        Intrinsics.checkNotNullParameter(formats, "formats");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        this.lensFacing = lensFacing;
        this.onComplete = onComplete;
        if (formats.isEmpty()) {
            iIntValue = 0;
        } else {
            List<? extends BarcodeType> list = formats;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((BarcodeType) it.next()).mapToBarcode()));
            }
            Iterator it2 = arrayList.iterator();
            if (!it2.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next = it2.next();
            while (it2.hasNext()) {
                next = Integer.valueOf(((Number) next).intValue() | ((Number) it2.next()).intValue());
            }
            iIntValue = ((Number) next).intValue();
        }
        this.barcodeFormats = iIntValue;
        BarcodeScannerOptions barcodeScannerOptionsBuild = new BarcodeScannerOptions.Builder().setBarcodeFormats(iIntValue, new int[0]).build();
        Intrinsics.checkNotNullExpressionValue(barcodeScannerOptionsBuild, "build(...)");
        this.barcodeScannerOptions = barcodeScannerOptionsBuild;
        BarcodeScanner client = BarcodeScanning.getClient(barcodeScannerOptionsBuild);
        Intrinsics.checkNotNullExpressionValue(client, "getClient(...)");
        this.barcodeScanner = client;
    }

    public final Function1<BarCodeScannerResult, Unit> getOnComplete() {
        return this.onComplete;
    }

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    public void analyze(final ImageProxy imageProxy) {
        Intrinsics.checkNotNullParameter(imageProxy, "imageProxy");
        Image image = imageProxy.getImage();
        if (image != null) {
            InputImage inputImageFromMediaImage = InputImage.fromMediaImage(image, CameraViewHelper.getCorrectCameraRotation(imageProxy.getImageInfo().getRotationDegrees(), this.lensFacing));
            Intrinsics.checkNotNullExpressionValue(inputImageFromMediaImage, "fromMediaImage(...)");
            Task<List<Barcode>> taskProcess = this.barcodeScanner.process(inputImageFromMediaImage);
            final Function1 function1 = new Function1() { // from class: expo.modules.camera.analyzers.BarcodeAnalyzer$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BarcodeAnalyzer.analyze$lambda$6(this.f$0, imageProxy, (List) obj);
                }
            };
            taskProcess.addOnSuccessListener(new OnSuccessListener() { // from class: expo.modules.camera.analyzers.BarcodeAnalyzer$$ExternalSyntheticLambda1
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    function1.invoke(obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: expo.modules.camera.analyzers.BarcodeAnalyzer$$ExternalSyntheticLambda2
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    BarcodeAnalyzer.analyze$lambda$8(exc);
                }
            }).addOnCompleteListener(new OnCompleteListener() { // from class: expo.modules.camera.analyzers.BarcodeAnalyzer$$ExternalSyntheticLambda3
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    BarcodeAnalyzer.analyze$lambda$9(imageProxy, task);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit analyze$lambda$6(BarcodeAnalyzer barcodeAnalyzer, ImageProxy imageProxy, List list) {
        String str;
        ArrayList arrayList;
        if (list.isEmpty()) {
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNull(list);
        Barcode barcode = (Barcode) CollectionsKt.first(list);
        String rawValue = barcode.getRawValue();
        if (rawValue != null) {
            str = rawValue;
        } else {
            byte[] rawBytes = barcode.getRawBytes();
            if (rawBytes != null) {
                str = new String(rawBytes, Charsets.UTF_8);
            } else {
                rawValue = null;
                str = rawValue;
            }
        }
        Point[] cornerPoints = barcode.getCornerPoints();
        if (cornerPoints != null) {
            int[] iArr = new int[cornerPoints.length * 2];
            int length = cornerPoints.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                Point point = cornerPoints[i];
                int i3 = i2 + 1;
                int i4 = i2 * 2;
                iArr[i4] = point.x;
                iArr[i4 + 1] = point.y;
                i++;
                i2 = i3;
            }
            arrayList = ArraysKt.toMutableList(iArr);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
        }
        List list2 = arrayList;
        BarCodeScannerResultSerializer barCodeScannerResultSerializer = BarCodeScannerResultSerializer.INSTANCE;
        Intrinsics.checkNotNull(barcode);
        barcodeAnalyzer.onComplete.invoke(new BarCodeScannerResult(barcode.getFormat(), barcode.getDisplayValue(), str, barCodeScannerResultSerializer.parseExtraDate(barcode), list2, imageProxy.getWidth(), imageProxy.getHeight()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void analyze$lambda$8(Exception it) {
        String message;
        Intrinsics.checkNotNullParameter(it, "it");
        Throwable cause = it.getCause();
        if (cause == null || (message = cause.getMessage()) == null) {
            message = "Barcode scanning failed";
        }
        Log.d("SCANNER", message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void analyze$lambda$9(ImageProxy imageProxy, Task it) {
        Intrinsics.checkNotNullParameter(it, "it");
        imageProxy.close();
    }
}
