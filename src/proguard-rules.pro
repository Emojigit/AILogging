# Add any ProGuard configurations specific to this
# extension here.

-keep public class emo.confounded.AILogging.AILogging {
    public *;
 }
-keeppackagenames gnu.kawa**, gnu.expr**

-optimizationpasses 4
-allowaccessmodification
-mergeinterfacesaggressively

-repackageclasses 'emo/confounded/AILogging/repack'
-flattenpackagehierarchy
-dontpreverify
