�}nc    �L��w���e����wt(��*�I��R���I�C���8u�KKr&)��ĭ�{;y�y�����`���aUY9]��k7��y/Xy�7�k|Gu������+��ڿX�����b���ߨSk<mq�?@3U�t�NN W{�g��T�y#`����^�v�ui��-R�l�OFM�W<���G^$5q�p��<�(�����������~&�E9.1fd���q�uT�Ѥӑj���ҥ���7��4���&U_ΟCo6�f����=��cε?�$�x��R_��y��yp���0â���/��-$���U���8S0M$}ۢ���$�z��!���K��&��:[�	,���@\��OD�����ÂQ؍��C�����Ϋ��5�;�h"�3�AjT{*�r��¬FPڳs���\�ʴ`�V/,�2_I��y���� �mX����������>�i�f@�w��DZ���g���4�� B�%�OY;i4O�:��/�/�er findById(int userId);

    User findByName(String name);

    @Transactional
    @Modifying
    @Query(value = "update t_user u set u.flags = ?1 where u.id = ?2")
    int setFlagsFor(int flags, int userId);


    @Transactional
    @Modifying
    @Query(value = "update t_user u set u.password = ?1 where u.id = ?2")
    int setPasswordFor(String password, int userId);


}
