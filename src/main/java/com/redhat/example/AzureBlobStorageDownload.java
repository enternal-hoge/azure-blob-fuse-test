package com.redhat.example;

import org.springframework.stereotype.Component;

import com.azure.storage.blob.BlobClient;
import com.azure.storage.blob.BlobContainerClient;
import com.azure.storage.blob.BlobServiceClient;
import com.azure.storage.blob.BlobServiceClientBuilder;
import com.azure.storage.common.StorageSharedKeyCredential;

import java.util.Locale;

@Component("azure-blob")
public class AzureBlobStorageDownload {

    //<method method="getDispatchInfo(${exchangeProperty.sapclient},${header.sap_user},${header.app_id})" ref="sapuser-conv" />

    /*
    public void download() throws Exception {
        //ストレージ アカウント名
        String accountName = "hogeeee";
        //アクセスキーのkey1の値
        String accountKey = "PDkMj6AUDv5eOQ3bfNZKOOcF24u0Ckwtn08MOnLPBjzvCwHl3GZIf5VVna4Ftxde0jonVIYPe1Ifbs7vh4Y+4w==";

        StorageSharedKeyCredential credential = new StorageSharedKeyCredential(accountName, accountKey);

        //ストレージアカウントの「プロパティ」
        String endpoint = String.format(Locale.ROOT, "https://hogeeee.blob.core.windows.net/", accountName);

        //Blobサービスの大元のクライアントAPIを作成する
        BlobServiceClient storageClient = new BlobServiceClientBuilder().endpoint(endpoint).credential(credential).buildClient();

        //Blob内で使用されるコンテナの実態を表すクライアントAPIを作成する。
        BlobContainerClient blobContainerClient = storageClient.getBlobContainerClient("mtgback-stor01-container01-eval-jpe");

        //コンテナクライアントAPIを使用して、ファイルの実体（この場合Blob自体）を取得する。
        BlobClient blobClient = blobContainerClient.getBlobClient("test.txt");

        //ローカル上にファイルをダウンロードする。
        blobClient.downloadToFile("./" + "test.txt");
    }
     */

    public void download(String accountName, String accountKey, String blobUrl, String ContainerName, String blobName) throws Exception {

        StorageSharedKeyCredential credential = new StorageSharedKeyCredential(accountName, accountKey);

        //ストレージアカウントの「プロパティ」
        String endpoint = String.format(Locale.ROOT, blobUrl, accountName);

        //Blobサービスの大元のクライアントAPIを作成する
        BlobServiceClient storageClient = new BlobServiceClientBuilder().endpoint(endpoint).credential(credential).buildClient();

        //Blob内で使用されるコンテナの実態を表すクライアントAPIを作成する。
        BlobContainerClient blobContainerClient = storageClient.getBlobContainerClient(ContainerName);

        //コンテナクライアントAPIを使用して、ファイルの実体（この場合Blob自体）を取得する。
        BlobClient blobClient = blobContainerClient.getBlobClient(blobName);

        //ローカル上にファイルをダウンロードする。
        blobClient.downloadToFile("./" + blobName);
    }
}
