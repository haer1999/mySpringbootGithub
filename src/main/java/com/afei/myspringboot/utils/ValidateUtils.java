�}�c    �
|\�2���e��O��uZ��*�Q]2�?Rm�I:�{�@�X�9\ȿ�aEV�՜��9"]cq��R��
�k������F�!ZV�zR�%#��"�,X��F�Y3�R���`c���	e�6�:̈S{CV��&�lդDL�>��Ɔ/_wS��{|��ma�7�f�R{��m�`��yq��-��6�w�@�O(�*��ï�o��������$���M8����Fc..SF-�5!(ё�Nӷ4��G�$��#g�P�񽑆K�ZW)��9	Zw��
֔�E��ϱ��A����z�?��T[V�oӦi-Y�I#�o���j�������N��-���8v�a	,���@\��OD�����ÂQ؍��C�����Ϋ��5�;�h"�3�AjT{*�r��¬FPڳs���\�ʴ`�V/,�2_I��y���� �mX����������>�i�f@�w��DZ���g���4�� B�%�OY;i4O�:��/�/�lD)�E�|��X0�O��P8h�rٙ��ď��W�3���\��UW@�S�3��[�\���V"63]����Z�\պ��1�(�<�r��4D����" N?�V��wфaJ��`ܩoI�Aρ��G{ō�dBv�:\C�2=�a��t�!�ߪn���K�o*-�J|��֭�onRT��mt4����Uc�����z�ՑI$���{�����ޝ["���I �F��:���B(�e�w#j<��9q��ӥ3f�3��V�Ck��C(�J�K`����Vx��ps\�=:��b�!����3ܟ�4=�ڢ���RD�ٺ��7P3,@v_�t�`J�_k���H<� �&����8^M�ZJU���l�� ��ᤗ��y���&�e���6Y��Ԡ3[��Z�i������(�ws<�m
�8��R��V�K���i���vuAik�V1@�Q�:C��b�S��ܔ���_��Wۢ.ᬀ�n'q,�|����f���Nomu�ase64(String s) {
        byte[] b;
        String result = null;
        if (s != null) {
            BASE64Decoder decoder = new BASE64Decoder();
            try {
                b = decoder.decodeBuffer(s);
                result = new String(b, "utf-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

}
