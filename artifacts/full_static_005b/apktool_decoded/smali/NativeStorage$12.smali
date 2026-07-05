.class LNativeStorage$12;
.super Ljava/lang/Object;
.source "NativeStorage.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LNativeStorage;->execute(Ljava/lang/String;Lorg/json/JSONArray;Lorg/apache/cordova/CallbackContext;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:LNativeStorage;

.field final synthetic val$args:Lorg/json/JSONArray;

.field final synthetic val$callbackContext:Lorg/apache/cordova/CallbackContext;


# direct methods
.method constructor <init>(LNativeStorage;Lorg/json/JSONArray;Lorg/apache/cordova/CallbackContext;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 253
    iput-object p1, p0, LNativeStorage$12;->this$0:LNativeStorage;

    iput-object p2, p0, LNativeStorage$12;->val$args:Lorg/json/JSONArray;

    iput-object p3, p0, LNativeStorage$12;->val$callbackContext:Lorg/apache/cordova/CallbackContext;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 257
    const-string v0, ""

    :try_start_0
    iget-object v1, p0, LNativeStorage$12;->val$args:Lorg/json/JSONArray;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 258
    iget-object v2, p0, LNativeStorage$12;->val$args:Lorg/json/JSONArray;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 259
    iget-object v4, p0, LNativeStorage$12;->val$args:Lorg/json/JSONArray;

    const/4 v5, 0x2

    invoke-virtual {v4, v5}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_8

    .line 263
    :try_start_1
    invoke-static {v2, v4}, LCrypto;->encrypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4
    :try_end_1
    .catch Ljava/security/spec/InvalidKeySpecException; {:try_start_1 .. :try_end_1} :catch_7
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_1 .. :try_end_1} :catch_6
    .catch Ljavax/crypto/NoSuchPaddingException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/security/InvalidAlgorithmParameterException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/security/InvalidKeyException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljavax/crypto/BadPaddingException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljavax/crypto/IllegalBlockSizeException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_8

    goto/16 :goto_1

    :catch_0
    move-exception v4

    .line 286
    :try_start_2
    invoke-virtual {v4}, Ljavax/crypto/IllegalBlockSizeException;->printStackTrace()V

    .line 287
    iget-object v5, p0, LNativeStorage$12;->val$callbackContext:Lorg/apache/cordova/CallbackContext;

    invoke-virtual {v4}, Ljavax/crypto/IllegalBlockSizeException;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Lorg/apache/cordova/CallbackContext;->error(Ljava/lang/String;)V

    goto :goto_0

    :catch_1
    move-exception v4

    .line 283
    invoke-virtual {v4}, Ljavax/crypto/BadPaddingException;->printStackTrace()V

    .line 284
    iget-object v5, p0, LNativeStorage$12;->val$callbackContext:Lorg/apache/cordova/CallbackContext;

    invoke-virtual {v4}, Ljavax/crypto/BadPaddingException;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Lorg/apache/cordova/CallbackContext;->error(Ljava/lang/String;)V

    goto :goto_0

    :catch_2
    move-exception v4

    .line 280
    invoke-virtual {v4}, Ljava/io/UnsupportedEncodingException;->printStackTrace()V

    .line 281
    iget-object v5, p0, LNativeStorage$12;->val$callbackContext:Lorg/apache/cordova/CallbackContext;

    invoke-virtual {v4}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Lorg/apache/cordova/CallbackContext;->error(Ljava/lang/String;)V

    goto :goto_0

    :catch_3
    move-exception v4

    .line 277
    invoke-virtual {v4}, Ljava/security/InvalidKeyException;->printStackTrace()V

    .line 278
    iget-object v5, p0, LNativeStorage$12;->val$callbackContext:Lorg/apache/cordova/CallbackContext;

    invoke-virtual {v4}, Ljava/security/InvalidKeyException;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Lorg/apache/cordova/CallbackContext;->error(Ljava/lang/String;)V

    goto :goto_0

    :catch_4
    move-exception v4

    .line 274
    invoke-virtual {v4}, Ljava/security/InvalidAlgorithmParameterException;->printStackTrace()V

    .line 275
    iget-object v5, p0, LNativeStorage$12;->val$callbackContext:Lorg/apache/cordova/CallbackContext;

    invoke-virtual {v4}, Ljava/security/InvalidAlgorithmParameterException;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Lorg/apache/cordova/CallbackContext;->error(Ljava/lang/String;)V

    goto :goto_0

    :catch_5
    move-exception v4

    .line 271
    invoke-virtual {v4}, Ljavax/crypto/NoSuchPaddingException;->printStackTrace()V

    .line 272
    iget-object v5, p0, LNativeStorage$12;->val$callbackContext:Lorg/apache/cordova/CallbackContext;

    invoke-virtual {v4}, Ljavax/crypto/NoSuchPaddingException;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Lorg/apache/cordova/CallbackContext;->error(Ljava/lang/String;)V

    goto :goto_0

    :catch_6
    move-exception v4

    .line 268
    invoke-virtual {v4}, Ljava/security/NoSuchAlgorithmException;->printStackTrace()V

    .line 269
    iget-object v5, p0, LNativeStorage$12;->val$callbackContext:Lorg/apache/cordova/CallbackContext;

    invoke-virtual {v4}, Ljava/security/NoSuchAlgorithmException;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Lorg/apache/cordova/CallbackContext;->error(Ljava/lang/String;)V

    goto :goto_0

    :catch_7
    move-exception v4

    .line 265
    invoke-virtual {v4}, Ljava/security/spec/InvalidKeySpecException;->printStackTrace()V

    .line 266
    iget-object v5, p0, LNativeStorage$12;->val$callbackContext:Lorg/apache/cordova/CallbackContext;

    invoke-virtual {v4}, Ljava/security/spec/InvalidKeySpecException;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Lorg/apache/cordova/CallbackContext;->error(Ljava/lang/String;)V

    :goto_0
    move-object v4, v0

    .line 289
    :goto_1
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 290
    iget-object v0, p0, LNativeStorage$12;->this$0:LNativeStorage;

    invoke-static {v0}, LNativeStorage;->-$$Nest$fgeteditor(LNativeStorage;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, v1, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 291
    iget-object v0, p0, LNativeStorage$12;->this$0:LNativeStorage;

    invoke-static {v0}, LNativeStorage;->-$$Nest$fgeteditor(LNativeStorage;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 292
    iget-object v0, p0, LNativeStorage$12;->val$callbackContext:Lorg/apache/cordova/CallbackContext;

    invoke-virtual {v0, v2}, Lorg/apache/cordova/CallbackContext;->success(Ljava/lang/String;)V

    goto :goto_2

    .line 293
    :cond_0
    iget-object v0, p0, LNativeStorage$12;->val$callbackContext:Lorg/apache/cordova/CallbackContext;

    invoke-virtual {v0, v3}, Lorg/apache/cordova/CallbackContext;->error(I)V

    goto :goto_2

    .line 295
    :cond_1
    iget-object v0, p0, LNativeStorage$12;->val$callbackContext:Lorg/apache/cordova/CallbackContext;

    const-string v1, "Encryption failed"

    invoke-virtual {v0, v1}, Lorg/apache/cordova/CallbackContext;->error(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_8

    goto :goto_2

    :catch_8
    move-exception v0

    .line 299
    const-string v1, "Native Storage"

    const-string v2, "setItem :"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 300
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 301
    iget-object v1, p0, LNativeStorage$12;->val$callbackContext:Lorg/apache/cordova/CallbackContext;

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lorg/apache/cordova/CallbackContext;->error(Ljava/lang/String;)V

    :goto_2
    return-void
.end method
