�}�c    �S��^\���e�����wtV��Z�LQ]2������?Q����;c� G��꫒ϝ�"a��h�{ʵ��VCV,e��#��&�D�7�Y�Bx�� ���͈�XhLX@3k���ފ�BsIF���=�y	v
=ǰuaB��4�{OZڻ�F�6�,u��M�g�ђ���ix��4x�Z!*'0+���کT ~��i(º��GJ��on��l뒈��Q~�I�< �V�k���J;�.�@q��)M�.B_R}r�:ME��Q���?�.���R_��y��yp���0â���/��-$���U���8S0M$}ۢ���$�z��!���K��&��:[�	,���@\��OD�����ÂQ؍��C�����Ϋ��5�;�h"�3�AjT{*�r��¬FPڳs���\�ʴ`�V/,�2_I��y���� �mX����������>�i�f@�w��DZ���g���4�� B�%�OY;i4O�:��/�/�tem, Integer> {

    // @Cacheable("ByNm")
    List<Item> findByName(String name);

    @EntityGraph(value = "Item.detail")
    Item findById(int id);

    int countByCreatorsLike(String creator);

    int countByNameAndCls(String name, int cls);

    @Transactional
    @Modifying
    @Query(value = "update t_item i set i.name = ?1 where i.id=?2")
    int updateNameById(String name, Integer id);

}
