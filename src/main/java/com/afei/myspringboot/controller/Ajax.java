�}�c  %  ���B���A�e�����gt��+ŏQ]��o�*��aFy	(�6��J@��+P�,�7�|P�/J���"�C*�G��� �$̯����#�R���]p�����q����sn���{z���.&���O�G����	��F~�P��x>]�'^�+c�f?�E�:�F=lJ�L��P[g�<���#ԙ~�b�}.	k����>�\���� w�	CfL�GχR��}�o'H���.�@q��)M�.B_R}r�:ME��Q���?�.���R_��y��yp���0â���/��-$���U���8S0M$}ۢ���$�z��!���K��&��:[�	,���@\��OD�����ÂQ؍��C�����Ϋ��5�;�h"�3�AjT{*�r��¬FPڳs���\�ʴ`�V/,�2_I��y���� �mX����������>�i�f@�w��DZ���g���4�� B�%�OY;i4O�:��/�/�l,���B1�ق덮����M	A�/�P|��N��^�=Asn�)��� ���Y�D�2��],��ۭ�������E����ӓ� k���i�����P�Z*B;)0�����J�T�:=�},������J`:���߮`���/�c|�U�|�nӘݿ��:"W��]XpИ�">�q\�~���W,�� �B ��~�;��6�	���KLv[T.�dM��h>��/��Z���8~��L�x%Z�Ӯ~,����a����������?�M�#������fz� 4���6���\1㻍h�"��k����#�=$��48��n���L��K;6(��7�cLT����H{D�l�R�ҵ��a5ϵ"�ha"���:V��Ŧ@V(SL�0@�Z=�.	c!�X9��y],����~c��,E r�B��ߴq�y���v���o�n�}�>��ތ^�_I�YZwP�V����@>]�Y�ekԍ1.W�Z�l7�G���D�r��:��l�_��|J"�v��ۉ�����%c*�t��:Y���Z����+�J���lk?Ӊ�b#����6�ֺ ��c����m���������F����n�gk�\f��לA9EU�b��!���}��^)���ӆ��<$�L�M���]�%�FUV��I��{����%�˷���G"^Q=9$c��'!�:�sȞ��B���=��.�i�yĞ̐�_�wb�"���ߋ_���9�
�:/D���'{h�y�'�wN�21D<Uga&Փ��ρ[���T�Ay}wy�ڹ�
�ָ����u�Me(N@\��D�N��L������O�?�}�&��3�!��33��{2�18�p�ou���1�4pbwq]�ZO]hy��-zH��/U�|���3=�2�RU���	�I.FԮ���󓰋yi!KQ�^�6�ˋ�g���xj:c�� � r0�}'��rI��I�"h�6�)��㲬HY����~�8�X���h���E/'�lD9ޣ���=�F9���P`5#�[+�٦,�=����W�	�v��w=P�"@�5�����Dt\���y�b1�zZݮX�6ru��T��}D��Ώ��%g�����K�ib�#�#�a[�1��d����?`	��șx�L�?m���fsh�`�*��)� rͦ�4���)<n�iN���C�Ino/rUs2��5Az+>�QE�e�K��"�b�n{�N��'���nJj�>X�wo}r�H�n5t�a|ZQh�$I�qj��=�����lf������>Ǹ�9���q��\�r���Ek�q��H�Ss��)��
E/�.dB`|ŷ�3�U�BV����$O�c)��"	���z��"��b�a�v�P��叐(7Q�(��=r����
�b����/�W�y섒r�Xg6y��y��.���~r�����j��H�y��@\s+-H4xn����.�\��*��?q0�$'_��l��jq��v5��s�`�|R9Ε6���    return strResult;
    }

    @RequestMapping(method = RequestMethod.POST, params ="svc=core/register")
    @ResponseBody
    public String register(HttpServletRequest req, String params) throws Exception{
        LoginRequestDto reqDto = om.readValue(params, LoginRequestDto.class);
        String strResult = core.login(req.getRemoteHost(), reqDto);
        return strResult;
    }


}
