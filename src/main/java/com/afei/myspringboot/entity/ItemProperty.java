�}�c    �}h��ub��e��3��t���*�OI� C*�aQ�C4�@Of��"���܅<ڌ��N�)�E��N�Z0J�d�	�;
o��'0���ȍ�y�8��\~�!3[DN�I�=��Gbw���N4XfG��V���'p?�_`!ֺ�8��t�Յ͒Qc�Q0/�O��,S�Ս�[3�'x�^�iN@�#������/Ҥ�Q�W�>`�W�"���I���� �f�>P�:j�%��?���+3�.��K�m��+���IY����K�&?$������폿���T3{�<�f�d�H��(����l�3$�	���$�z��!���K��&��:[�	,���@\��OD�����ÂQ؍��C�����Ϋ��5�;�h"�3�AjT{*�r��¬FPڳs���\�ʴ`�V/,�2_I��y���� �mX����������>�i�f@�w��DZ���g���4�� B�%�OY;i4O�:��/�/�ate int id;

    @Column(name = "k")
    @NonNull
    private String k;

    @Column(name = "v")
    @NonNull
    private String v;

    @ManyToOne(cascade = {CascadeType.REFRESH})
    private Item item;
}
