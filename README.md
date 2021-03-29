# azure-blob-fuse-test
FuseのAzure Blob Storage Componentが動かなくて試行錯誤

# Fuse製品マニュアル

最終的には、以下のソースコードでも動かずAzure SDKの更新に伴う、credintial情報やオブジェクトの変更などがあると思っている。

https://access.redhat.com/documentation/en-us/red_hat_fuse/7.8/html/apache_camel_component_reference/azure-blob-component

但し、Azure Blob StorageのSDKのAPIが便利なので、Fuse[Cmael]で頑張るモチベーションは現時点でない。（当ソースコードの通り、BeanかProcessorで実装すれば良い）
