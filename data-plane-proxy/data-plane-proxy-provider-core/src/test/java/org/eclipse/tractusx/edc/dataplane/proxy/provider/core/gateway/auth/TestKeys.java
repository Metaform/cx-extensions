package org.eclipse.tractusx.edc.dataplane.proxy.provider.core.gateway.auth;

/**
 * Keys for testing.
 */
public interface TestKeys {

    String TEST_JWT = "eyJhbGciOiJSUzI1NiIsInZlcnNpb24iOnRydWV9.eyJpc3MiOiJ0ZXN0LWNvbm5lY3RvciIsInN1YiI6ImNvbnN1bWVyLWNvbm5lY3RvciIsImF1ZCI6InRlc3QtY29ubmVjdG9yIiwiaWF0IjoxNjgxOTEzNjM2LCJleHAiOjMzNDU5NzQwNzg4LCJjaWQiOiIzMmE2M2E3ZC04MGQ2LTRmMmUtOTBlNi04MGJhZjVmYzJiM2MifQ.QAuotoRxpEqfuzkTcTq2w5Tcyy3Rc3UzUjjvNc_zwgNROGLe-wO9tFET1dJ_I5BttRxkngDS37dS4R6lN5YXaGHgcH2rf_FuVcJUSFqTp_usGAcx6m7pQQwqpNdcYgmq0NJp3xP87EFPHAy4kBxB5bqpmx4J-zrj9U_gerZ2WlRqpu0SdgP0S5v5D1Gm-vYkLqgvsugrAWH3Ti7OjC5UMdj0kDFwro2NpMY8SSNryiVvBEv8hn0KZdhhebIqPdhqbEQZ9d8WKzcgoqQ3DBd4ijzkd3Fz7ADD2gy_Hxn8Hi2LcItuB514TjCxYAncTNqZC_JSFEyuxwcGFVz3LdSXgw";

    String TEST_PUBLIC_KEY = "-----BEGIN PUBLIC KEY-----\n" +
            "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAyMkG7DSIhMjFOtqQJsr+\n" +
            "KtzfKKGGQ/7mBdjwDCEj0ijKLG/LiEYWsbPA8L/oMAIdR4xpLGaajtz6wj7NbMiA\n" +
            "rtHF1HA3mNoeKGix7SfobfQ9J7gJJmSE5DA4BxatL4sPMfoV2SJanJQQjOEAA6/i\n" +
            "I+o8SeeBc/2YE55O3yeFjdHK5JIwDi9vIkGnDRBd9poyrHYV+7dcyBB45r6BwvoW\n" +
            "G41mezzlKbOl0ZtPW1T9fqp+lOiZWIHMY5ml1daGSbTWwfJxc7XfHHa8KCNQcsPR\n" +
            "hWYx6PnxvgqQwYPjvqZF7OYAMUOQX8pg6jfYiU4HgUI1jwwGw3UpJq4b3kzD3u4T\n" +
            "DQIDAQAB\n" +
            "-----END PUBLIC KEY-----";

    String TEST_PRIVATE_KEY = "-----BEGIN PRIVATE KEY-----\n" +
            "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQDIyQbsNIiEyMU6\n" +
            "2pAmyv4q3N8ooYZD/uYF2PAMISPSKMosb8uIRhaxs8Dwv+gwAh1HjGksZpqO3PrC\n" +
            "Ps1syICu0cXUcDeY2h4oaLHtJ+ht9D0nuAkmZITkMDgHFq0viw8x+hXZIlqclBCM\n" +
            "4QADr+Ij6jxJ54Fz/ZgTnk7fJ4WN0crkkjAOL28iQacNEF32mjKsdhX7t1zIEHjm\n" +
            "voHC+hYbjWZ7POUps6XRm09bVP1+qn6U6JlYgcxjmaXV1oZJtNbB8nFztd8cdrwo\n" +
            "I1Byw9GFZjHo+fG+CpDBg+O+pkXs5gAxQ5BfymDqN9iJTgeBQjWPDAbDdSkmrhve\n" +
            "TMPe7hMNAgMBAAECggEAJ2793lGh90w0Gi83TPskqHfpFyKEC2IqPH9DA+rVTW7n\n" +
            "6ArL0zeKuPtX+yCBoj4kEHuF42vCUqkZUaGCeGk3hr4Zx7ODY9CAyEhpm21xU3j6\n" +
            "ssyM9X6b7/H9avz75gC+av8WH+dEmwhkaLq+5Tp7pDiafxxJ2yU04zN+A4tQSk4O\n" +
            "QgLJ0J/1JiuEKu6ECj7mFXRo73/gS2qvfwDRzVlPZ9U7MBBCd4nMtQ8cy3m8kRJ0\n" +
            "yI/qTmt/kwDmGmfvp7t+Gtl0nzkweOiP+/1oaKIBpLwHBLUYyC6jqyllOOtY/Eit\n" +
            "xh2V1cjAbimWO4KfUaMsNxALelpj7I5chZBumLGBOQKBgQD/zke//M3JkdyC5Rwb\n" +
            "vUQovNtJrTk9vv1Ju62W4TMtZK8LzT2hzTkFKQAqW5UI22OEXzeRfyDamiTLz1uN\n" +
            "18Q2RyQvbz9PyvQgEHSr1P37oGcW5RVd1tTNmZ/2lP33mhGzyXL3UUBzqrD1R6Ei\n" +
            "1Dh4JgiE2EFBnm6k5ltbOnJqtQKBgQDI8A19kclGQIV5eOKNhQVhlgN1KyDW75jf\n" +
            "MIybnqnPmKYoGGksSKOdUKd6kijC6dWET4YVFXF4+/2eRFC7/4ioqtPCAaSBUwfx\n" +
            "1tNLyPL70tWNQS3vQ5ej9qNiDQAk14HpMSCHaFtpUHPNErWuySRLhkF3f7GefWhU\n" +
            "p/BzbMvF+QKBgQCyTKXWO+90QCbjVa5x50pK2tg+Um9DiowhiJ9GO1Hgof0gzL3Y\n" +
            "uaK05g8ndw46TjDfYz7oOyQ7OpXLOY0nIO2yp4OhTHlktKHUd6Pa4WrmqLcyThrG\n" +
            "fad2Z04IIXGj08/i8Ncha5DxDlipnnPCQwnZNSla7yENC9EzPx0OSX7WwQKBgG4b\n" +
            "XMkaQfjFEl7l5v81jSVUVsC1yWD+Gf7zU5lS8CpZs3L1LWyewUlLEPsRbFSiXeYK\n" +
            "zaZwAaYSL3+yX6sk83W5ZiBBViunnArhdRdqHfvwJCUrOkiJ+WZXmF/6T8Hgdcea\n" +
            "rACHJtAmzc3qGrSUc9cO0oDw8BuxDKKXBCO70k3BAoGAJNAs3IkbwFDuCwMeKwMS\n" +
            "DzozIcLFkOatnp2+VLe5bjOEFrvolfwYmKBArZEOFtrTHI7LnXossTnbS8PfpvnX\n" +
            "k1v+LRmbUHk7nBafLADbxzFCYpPur/AQ5j1VyyvxYKstfc3/bOT7K/N4Axe3MgOq\n" +
            "Fc4k+Bp746fDFd+Q5ELHTu8=\n" +
            "-----END PRIVATE KEY-----";


}
