�}yc  '  �ا�Φ����e��-��u���*�OI������vqQ[�� K@����X>"|-K�G�� ��^�2m(�>=���ԖY0R�_!�0�ȟ}�s��`�O��ؽ�S>!�prx�̻�:�@v��&]�(hS�*�-kxW�b���o�'ח���&my����!�G�~�?^B�^���[�$� �'|vKEa+f��
�ҕU�����x,�ӫ���	?-�����#��6!S�,��Va�Ԙ=��ҢE��#D>w�;M���Y@�5�V"��RTʦ����MgJ%;����Ԥ�C�ig��
�z&}A'�s|u�S@� ��M$}ۢ���$�z��!���K��&��:[�	,���@\��OD�����ÂQ؍��C�����Ϋ��5�;�h"�3�AjT{*�r��¬FPڳs���\�ʴ`�V/,�2_I��y���� �mX����������>�i�f@�w��DZ���g���4�� B�%�OY;i4O�:��/�/�l�I�r�oۥ��������3��3Ʃn�~ۻ�`�B������Y*��&ߏ���0v"�,�����wX�4�:1ݤY���O[7_Q��PG�t���1�`�C�};%�HI��'[�S'u7)O���4k���/������7S]3�ܱ�p($����|�_Q�='zHZ��q�z��H	��)��8���J83�����BIiё��C�F��u�JY�+,4'�S�����f�{G ��3r%a��*��avY�����ni�:��O𧗣�e�A7�[�
��.�;; v���� ��/���`W@I�>�+i��~�(���*�l��q����fuŐ���L=$���L[.� �"��ʞ�8�y��k�o��T���h��Ԝ2�1��H��d�{(ݕ?�1�C�ӽ�hr��p%M�������Vb�r�����:����䚱��p� �wB��C��tA��h��R����?~����bi���\T?<�=��4���/ɞ�e;  //权限值{View=1，Edit=2，Manage access=4，Delete=8}

    @ManyToOne(cascade = {CascadeType.REFRESH})
    private  Item item;

    /*@ManyToOne(cascade = {CascadeType.DETACH}, fetch = FetchType.EAGER)
    @JoinTable(name="t_item_right",
            joinColumns = {@JoinColumn(name = "right_id")},
            inverseJoinColumns = {@JoinColumn(name="item_id")})
    //@JoinColumn(name = "item_id")  //itemRights 表里加一个外键 item_id
    private Item item;*/

}
