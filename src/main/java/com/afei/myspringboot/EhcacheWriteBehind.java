�}c  *  ��K3�rD�i�e����gu֩�*�OQ]� [���w�	�2�xl�YL�P ��
�=�z�����/6�����\!�'("zr���	�t?�;�R��������iĂJI�TM�;�����h;7H컡P�9��� 8�oMFj�Z�]�T�j6C)J^�˜��)���3��"�큒�do={�̋�ۉ�[���i�Q�%��B����ϰ�D����F�8��*�Pʞ���wG"#(�6|cmHC�,��E1P uX�09{�� 7qƐ�.���R_��y��yp���0â���/��-$���U���8S0M$}ۢ���$�z��!���K��&��:[�	,���@\��OD�����ÂQ؍��C�����Ϋ��5�;�h"�3�AjT{*�r��¬FPڳs���\�ʴ`�V/,�2_I��y���� �mX����������>�i�f@�w��DZ���g���4�� B�%�OY;i4O�:��/�/�l�"+|�5�F7�g�ŔS-_+y>�h�,�a>sjHf({#ҝ�ک���v����?>8���Q+DG@}~]��yT��f۫-��ԫ��w�W�q�vZ���i��|�FXk��ׇ ����7E�ic��t:���M�V����S���K��I��T5e�G������Xao��k��(K�H�O�!�O-|S��{K�IM�#�t
�������oA�`�T
�!��mN��Ɔ��'��M�o	��f��q; �G��2;EwM�{�y�ȴ����;ڂ�y�G��Ƃa���f��K�&���j����F��0���[��og�zEN4�o�����5� (o"��C�6c)��Lz�PϕN7Ƃ=H�7� ��q��$1g���Wa�߽cH��y�@�z� ����<��c!�Fe��L@�N�]���RK�Z��F
���l���3�V�p)�^��|.�#y�Gc6뻼���i��,�l����B@�)h� ��>�0�Pblic void delete(CacheEntry cacheEntry) throws CacheException {

        System.out.println("delete");
    }

    @Override
    public void deleteAll(Collection<CacheEntry> collection) throws CacheException {

        System.out.println("deleteAll");
    }

    @Override
    public void throwAway(Element element, SingleOperationType singleOperationType, RuntimeException e) {

        System.out.println("throwAway");
    }
}
