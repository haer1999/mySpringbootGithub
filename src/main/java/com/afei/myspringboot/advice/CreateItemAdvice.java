�}�c  -  �t���r7��e�����wjV��Z�Lі��
���಺�a�f�ma�d�񆲂��"\����f$���q���Yз�'�;��Y�vB�c�͏�]�5���F�(���w_))W�!z��ٙ�BiZ	�E	���o���]G�o%>A-��?`v�lu�n��&��Х�X�&J&͵O﯐/#ed��Ȑ�P�J�'?%�ؿ<����B����5i��x�N[ �d�����Ǚ�V�l�l����)M�.B_R}r�:ME��Q���?�.���R_��y��yp���0â���/��-$���U���8S0M$}ۢ���$�z��!���K��&��:[�	,���@\��OD�����ÂQ؍��C�����Ϋ��5�;�h"�3�AjT{*�r��¬FPڳs���\�ʴ`�V/,�2_I��y���� �mX����������>�i�f@�w��DZ���g���4�� B�%�OY;i4O�:��/�/�lD.	"A8�Q-��X�L�ΐ���T����_ ��z8?u�<D7��bɼ�Q�)�r�"F� �b��՟2��*�٘7.�<�?��; Ee�@b��f@{�o UNh�U��������4$:���4��J\��x����{�w� ş �~V�8%:OGgXb/H�ŧt��hp��,�l+�-�����A�@��~�X_�(�c7������ �&�k�Ed1��9/yo�\#U�i-��{DxD��.��U��W3֙3�b< �o�_��?ۈ�}��KP�S/(���Z��&��mwV_��W������r|������#�(o��A����uyM��C>�fw&0�~P���oV��(��B������wV��<�C��&q�'LA���9L��S���h��S���M��z�F�T�W��2��"�1��7���jc2�#��do��v��:�-���sk�H�;HU��EJ��'B�SY�s6㳷�����'�&; ���m�K�F �]�s);
        return returnValue;
    }


    public boolean canCreateItem(Session session) {
        int fl = session.getUserFlags();
        return (fl & 0x4) !=0;

    }

}
